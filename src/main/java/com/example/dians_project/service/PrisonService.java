package com.example.dians_project.service;

import com.example.dians_project.model.Prison;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface PrisonService {
    Prison create(String name, String description);

    Prison update(String name, String description);

    void delete(String name);

    Optional<Prison> findById(Long id);

    List<Prison> listPrisons();

    List<Prison> searchPrisons(String searchText);

}
