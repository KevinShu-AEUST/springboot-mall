package com.kevinhsu.springbootmall.service;

import com.kevinhsu.springbootmall.dto.UserLoginRequest;
import com.kevinhsu.springbootmall.dto.UserRegisterRequest;
import com.kevinhsu.springbootmall.model.User;

public interface UserService {

    User getUserById(Integer userId);

    Integer register(UserRegisterRequest userRegisterRequest);

    User login(UserLoginRequest userLoginRequest);
}
