package com.example.dians_project.service;

public interface Filter<T> {
    T execute(T input);
}
