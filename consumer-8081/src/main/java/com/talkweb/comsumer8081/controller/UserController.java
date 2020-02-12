package com.talkweb.comsumer8081.controller;

import com.talkweb.comsumer8081.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/{userId}")
    public User get(@PathVariable Integer userId) {
        String url="http://localhost:8080/user/"+userId;
        return restTemplate.getForObject(url, User.class);
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
