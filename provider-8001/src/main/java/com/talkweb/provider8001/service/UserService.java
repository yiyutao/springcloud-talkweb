package com.talkweb.provider8001.service;

import com.talkweb.provider8001.domain.User;

public interface UserService {

    User get(Integer userId);

    Boolean add(User user);

    Boolean remove(Integer userId);

    Boolean update(User user);
}
