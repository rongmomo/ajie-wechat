package com.ajie.wechat.dao;

import com.ajie.wechat.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by rongjie on 2016/12/6.
 */
public interface UserDao extends JpaRepository<User, Long> {
}
