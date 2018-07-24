package com.wei.fruithome.service.user.impl;

import com.wei.fruithome.dao.user.UserMapper;
import com.wei.fruithome.entity.user.User;
import com.wei.fruithome.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService{
    @Resource
    private UserMapper userMapper;

    @Override
    public void register(String username, String password) {
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        userMapper.insert(user);
    }
}
