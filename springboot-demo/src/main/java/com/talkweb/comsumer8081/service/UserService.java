package com.talkweb.comsumer8081.service;

import com.talkweb.comsumer8081.domain.User;

public interface UserService {

    User get(Integer userId);

    Boolean add(User user);

    Boolean remove(Integer userId);

    Boolean update(User user);
}
