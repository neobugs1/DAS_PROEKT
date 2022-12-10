package com.example.dians_project.service.impl;

import com.example.dians_project.model.Prison;
import com.example.dians_project.repository.jpa.PrisonRepository;
import com.example.dians_project.repository.jpa.PrisonerRepository;
import com.example.dians_project.service.PrisonService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PrisonServiceImpl implements PrisonService {

    private final PrisonerRepository prisonerRepository;
    private final PrisonRepository prisonRepository;

    public PrisonServiceImpl(PrisonerRepository prisonerRepository, PrisonRepository prisonRepository) {
        this.prisonerRepository = prisonerRepository;
        this.prisonRepository = prisonRepository;
    }

    @Override
    public Prison create(String name, String description) {
        return null;
    }

    @Override
    public Prison update(String name, String description) {
        return null;
    }

    @Override
    public void delete(String name) {

    }

    @Override
    public Optional<Prison> findById(Long id) {
        return this.prisonRepository.findById(id);
    }

    @Override
    public List<Prison> listPrisons() {
        return this.prisonRepository.findAll();
    }

    @Override
    public List<Prison> searchPrisons(String searchText) {
        return null;
    }
}
