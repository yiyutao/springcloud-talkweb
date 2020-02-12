package com.talkweb.comsumer8081.controller;

import com.talkweb.comsumer8081.domain.User;
import com.talkweb.comsumer8081.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping("/{userId}")
    public User get(@PathVariable Integer userId) {
        return userService.get(userId);
    }

//    @PostMapping("")
//    public Boolean add(User user) {
//        return userService.add(user);
//    }
//
//    @DeleteMapping("/{userId}")
//    public Boolean remove(@PathVariable Integer userId) {
//        return userService.remove(userId);
//    }
//
//    @PutMapping("")
//    public Boolean update(User user) {
//        return userService.update(user);
//    }
}
