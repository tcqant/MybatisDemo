package org.test.mybatisannotationdemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.test.mybatisannotationdemo.dao.UserDao;
import org.test.mybatisannotationdemo.model.User;

import java.util.List;

@Service
public class UserService {


    @Autowired
    private UserDao userDao;

    public List<User> getAllUser() {
        return userDao.getAll();
    }

    public void saveUser(User user) {
        userDao.insert(user);
    }
}
