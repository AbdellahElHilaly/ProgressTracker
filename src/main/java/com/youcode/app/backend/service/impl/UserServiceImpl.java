package com.youcode.app.backend.service;

import com.youcode.app.backend.entity.User;
import com.youcode.app.backend.repository.UserRepository;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class UserService {

    UserRepository userRepository;
    public User save(User user) {
        return userRepository.save(user);
    }

}
