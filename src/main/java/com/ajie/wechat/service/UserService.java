package com.ajie.wechat.service;

import com.ajie.wechat.dao.UserDao;
import com.ajie.wechat.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by rongjie on 2016/12/6.
 */
@Service
@Transactional
public class UserService {
    @Autowired
    private UserDao userDao;
    public String add(User user){
        userDao.save(user);
        return "添加成功！";
    }

    public String addUser(String account){
        User user = new User();
        user.setAccount(account);
        userDao.save(user);
        return "添加成功！";
    }

    public User getOneUser(Long id){
        return userDao.findOne(id);
    }
}
