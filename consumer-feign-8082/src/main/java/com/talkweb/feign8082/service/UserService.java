package com.talkweb.feign8082.service;


import com.talkweb.feign8082.domain.User;
import com.talkweb.feign8082.service.fallback.UserFallbackService;
import feign.Body;
import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(value = "provider")
public interface UserService {

    @GetMapping("/user/{userId}")
    User get(@PathVariable Integer userId);

    @PostMapping("/user")
    Boolean add(@RequestBody User user);
//
//    Boolean remove(Integer userId);
//
//    Boolean update(User user);
}
