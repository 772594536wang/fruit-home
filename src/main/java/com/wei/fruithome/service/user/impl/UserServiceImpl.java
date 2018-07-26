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
    public void register(User user) {
        userMapper.insert(user);
    }

    @Override
    public boolean verifyUserLogin(User user) {
        return false;
    }

    @Override
    public boolean verifyTelephone(String telephone) {
        Integer count = userMapper.selectTelephoneUnique(telephone);
        return count == 0;
    }

    @Override
    public boolean verifyUsername(String username) {
        Integer count = userMapper.selectUsernameUnique(username);
        return count == 0;
    }
}
