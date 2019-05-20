package org.test.mybatisannotationdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.test.mybatisannotationdemo.dao.UserDao;
import org.test.mybatisannotationdemo.model.User;
import org.test.mybatisannotationdemo.service.UserService;

import java.util.List;

@RestController
@RequestMapping(value = "/test/user")
public class UserController {

//    @Autowired
//    private UserDao userDao;

    @Autowired
    private UserService service;

    @GetMapping("/all")
    public @ResponseBody List<User> getAllUser() {
//        userDao.getAll();
        return service.getAllUser();
//        return  null;
    }

    @PostMapping("/save")
    public void saveUser(User user) {
//        service.saveUser(user);
    }
}
