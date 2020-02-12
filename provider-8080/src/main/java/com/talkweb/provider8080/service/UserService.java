package com.talkweb.provider8080.service;

import com.talkweb.provider8080.domain.User;

public interface UserService {

    User get(Integer userId);

    Boolean add(User user);

    Boolean remove(Integer userId);

    Boolean update(User user);
}
