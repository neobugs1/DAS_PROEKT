package com.example.dians_project.service;

import com.example.dians_project.model.Prison;
import com.example.dians_project.model.Prisoner;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public interface PrisonerService {

    List<Prisoner> findAll();

    List<Prisoner> findByPrison(Prison prison);

    Optional<Prisoner> findById(Long id);

    Optional<Prisoner> findByName(String name);

    Optional<Prisoner> save(Long id, String lastName, String firstName, Integer age, String gender, String status, String description, LocalDateTime datePrisoned, String profession, String education, String city, Long prisonId);

//    Optional<Prisoner> save(ProductDto productDto);

    Optional<Prisoner> edit(Long id, String name, Double price, Integer quantity, Long category, Long manufacturer);

//    Optional<Prisoner> edit(Long id, ProductDto productDto);

    void deleteById(Long id);

}
