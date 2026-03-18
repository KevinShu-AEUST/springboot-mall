package com.kevinhsu.springbootmall.service.impl;

import com.kevinhsu.springbootmall.dao.UserDao;
import com.kevinhsu.springbootmall.dto.UserRegisterRequest;
import com.kevinhsu.springbootmall.model.User;
import com.kevinhsu.springbootmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User getUserById(Integer userId) {
        return userDao.getUserById(userId);
    }

    @Override
    public Integer register(UserRegisterRequest userRegisterRequest) {
        return userDao.createUser(userRegisterRequest);
    }

}
