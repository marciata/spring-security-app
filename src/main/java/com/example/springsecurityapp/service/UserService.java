package com.example.springsecurityapp.service;

import com.example.springsecurityapp.model.User;
import com.example.springsecurityapp.model.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User getUser(Long id) {
        return userRepository.getReferenceById(id);
    }
}
