package com.example.dians_project.service.impl;

import com.example.dians_project.model.User;
import com.example.dians_project.model.exceptions.InvalidArgumentsException;
import com.example.dians_project.model.exceptions.InvalidUserCredentialsException;
import com.example.dians_project.repository.jpa.UserRepository;
import com.example.dians_project.service.AuthService;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {

    private final UserRepository userRepository;

    public AuthServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User login(String username, String password) {
        if (username==null || username.isEmpty() || password==null || password.isEmpty()) {
            throw new InvalidArgumentsException();
        }
        return userRepository.findByUsernameAndPassword(username,
                password).orElseThrow(InvalidUserCredentialsException::new);
    }

}
