package org.test.mybatisxmldemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.test.mybatisxmldemo.model.User;
import org.test.mybatisxmldemo.service.UserService;


import java.util.List;

@RestController
@RequestMapping(value = "/test/user")
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping("/all")
    public @ResponseBody List<User> getAllUser() {
        return service.getAllUser();
    }

    @PostMapping("/save")
    public void saveUser(User user) {
        service.saveUser(user);
    }
}
