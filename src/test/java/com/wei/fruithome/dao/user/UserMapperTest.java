package com.wei.fruithome.dao.user;

import com.wei.fruithome.entity.user.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {

    @Resource
    private UserMapper userMapper;

    @Test
    public void insert() {
        User user = new User();
        user.setUsername("wang222");
        user.setPassword("hahaha");
        userMapper.insert(user);
    }
}