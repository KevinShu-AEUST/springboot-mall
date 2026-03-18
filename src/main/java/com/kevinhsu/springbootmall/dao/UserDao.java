package com.kevinhsu.springbootmall.dao;

import com.kevinhsu.springbootmall.dto.UserRegisterRequest;
import com.kevinhsu.springbootmall.model.User;

public interface UserDao {

    User getUserById(Integer userId);

    Integer createUser(UserRegisterRequest userRegisterRequest);
}
