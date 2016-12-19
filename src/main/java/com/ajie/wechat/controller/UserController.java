package com.ajie.wechat.controller;

import com.ajie.wechat.model.User;
import com.ajie.wechat.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * Created by rongjie on 2016/12/6.
 */
@RestController
@RequestMapping(value = "/frame")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/saveUser",
            method = RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_VALUE + ";charset=UTF-8")
    public String saveUser(@RequestBody User user){
        return userService.add(user);
    }

    @RequestMapping(value = "/saveUser/{account}",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE + ";charset=UTF-8")
    public String add(@PathVariable String account){
        return userService.addUser(account);
    }

    @RequestMapping(value = "/user/{id}",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE + ";charset=UTF-8")
    public User add(@PathVariable Long id){
        return userService.getOneUser(id);
    }
}
