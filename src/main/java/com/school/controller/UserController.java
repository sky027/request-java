package com.school.controller;

import com.school.bean.po.ResultPlus;
import com.school.bean.po.User;
import com.school.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*",maxAge = 3600)
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/addUser")
    private ResultPlus addUser(@RequestBody User user){
        return userService.addUser(user);
    }

    @PostMapping("/checkLogin")
    private ResultPlus queryUserByAccount(@RequestBody User user){
        return userService.queryUserByAccount(user.getAccount(), user.getPassword());
    }
}
