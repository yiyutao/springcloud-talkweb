package com.talkweb.feign8082.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.talkweb.feign8082.domain.User;
import com.talkweb.feign8082.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping("/{userId}")
    @HystrixCommand(fallbackMethod = "fallbackGet")
    public User get(@PathVariable Integer userId) {
        return userService.get(userId);
    }

    @PostMapping()
    public Boolean add(@RequestBody User user) {
        return userService.add(user);
    }

    private User fallbackGet(@PathVariable Integer userid) {
        User user = new User();
        user.setName("服务降级");
        return user;
    }
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
