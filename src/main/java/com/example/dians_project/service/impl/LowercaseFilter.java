package com.example.dians_project.service.impl;
import com.example.dians_project.service.Filter;

public class LowercaseFilter implements Filter<String> {
    @Override
    public String execute(String input) {
        return input.toLowerCase();
    }
}
