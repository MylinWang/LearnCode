package com.gelin.demo.service.Impl;

import com.gelin.demo.Exception.ApiResponseError;
import com.gelin.demo.Exception.Exception;
import com.gelin.demo.model.dao.UserMapper;
import com.gelin.demo.model.pojo.User;
import com.gelin.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public void register(String username, String password) {
        User user = userMapper.selectByName(username);
        if (user!=null){
            throw new Exception(ApiResponseError.USER_USERNAME_NOTNULL);
        }
        User user1 = new User();
        user1.setUsername(username);
        user1.setPassword(password);
        user1.setCreateTime(new Date());
        int i = userMapper.insertSelective(user1);
        if (i!=1){
            throw new Exception(ApiResponseError.USER_REGISTER_ERROR);
        }
    }






}
