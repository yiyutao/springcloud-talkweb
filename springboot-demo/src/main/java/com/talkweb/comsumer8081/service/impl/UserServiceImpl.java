package com.talkweb.comsumer8081.service.impl;

import com.talkweb.comsumer8081.domain.User;
import com.talkweb.comsumer8081.service.UserService;
import org.springframework.stereotype.Service;

import java.util.concurrent.ConcurrentHashMap;

@Service
public class UserServiceImpl implements UserService {

    private ConcurrentHashMap<Integer, User> userMap = new ConcurrentHashMap<>();

    @Override
    public User get(Integer userId) {
        return userMap.get(userId);
    }

    @Override
    public Boolean add(User user) {
        userMap.put(user.getUserId(), user);
        return true;
    }

    @Override
    public Boolean remove(Integer userId) {
        userMap.remove(userId);
        return true;
    }

    @Override
    public Boolean update(User user) {
        userMap.put(user.getUserId(), user);
        return true;
    }
}
