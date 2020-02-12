package com.talkweb.comsumer8081.service;


import com.talkweb.comsumer8081.domain.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "provider")
@Service
public interface UserService {

    @RequestMapping(value = "/user/{userId}",method = RequestMethod.GET)
    User get(@PathVariable Integer userId);

    Boolean add(User user);

    Boolean remove(Integer userId);

    Boolean update(User user);
}
