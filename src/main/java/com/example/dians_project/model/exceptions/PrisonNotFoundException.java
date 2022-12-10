package com.example.dians_project.model.exceptions;

public class PrisonNotFoundException extends RuntimeException{
    public PrisonNotFoundException(Long id){
        super(String.format("Prison with id: %d is not found",id));
    }
}
