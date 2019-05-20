package org.test.mybatisxmldemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.test.mybatisxmldemo.mapper.UserMapper;
import org.test.mybatisxmldemo.model.User;


import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> getAllUser() {
        return userMapper.getAll();
    }

    public void saveUser(User user) {
        userMapper.insert(user);
    }
}
