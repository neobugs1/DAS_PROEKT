package com.example.dians_project.service;


import com.example.dians_project.model.Role;
import com.example.dians_project.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

    User register(String username, String password, String repeatPassword, String name, String surname, Role role);
}
