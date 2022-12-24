package com.example.dians_project.service;

import com.example.dians_project.model.User;

public interface AuthService {
    User login(String username, String password);
}
