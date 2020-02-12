package com.talkweb.feign8082.service.fallback;

import com.talkweb.feign8082.domain.User;
import com.talkweb.feign8082.service.UserService;
import org.springframework.stereotype.Component;

@Component
public class UserFallbackService implements UserService {
    @Override
    public User get(Integer userId) {
        User user=new User();
        user.setName("超时");
        return user;
    }

    @Override
    public Boolean add(User user) {
        return null;
    }
}
