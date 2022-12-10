package com.example.dians_project.service.impl;

import com.example.dians_project.model.Prison;
import com.example.dians_project.model.Prisoner;
import com.example.dians_project.model.exceptions.PrisonNotFoundException;
import com.example.dians_project.repository.jpa.PrisonRepository;
import com.example.dians_project.repository.jpa.PrisonerRepository;
import com.example.dians_project.service.PrisonerService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class PrisonerServiceImpl implements PrisonerService {

    private final PrisonerRepository prisonerRepository;
    private final PrisonRepository prisonRepository;

    public PrisonerServiceImpl(PrisonerRepository prisonerRepository, PrisonRepository prisonRepository) {
        this.prisonerRepository = prisonerRepository;
        this.prisonRepository = prisonRepository;
    }

    @Override
    public List<Prisoner> findAll() {
        return this.prisonerRepository.findAll();
    }

    @Override
    public List<Prisoner> findByPrison(Prison prison) {
        return this.prisonerRepository.findByPrison(prison);
    }

    @Override
    public Optional<Prisoner> findById(Long id) {
        return this.prisonerRepository.findById(id);
    }

    @Override
    public Optional<Prisoner> findByName(String name) {
        return this.findByName(name);
    }

    @Override
    @Transactional
    public Optional<Prisoner> save(Long id, String lastName, String firstName, Integer age, String gender, String status, String description, LocalDateTime datePrisoned, String profession, String education, String city, Long prisonId) {
        Prison prison = this.prisonRepository.findById(prisonId).orElseThrow(() -> new PrisonNotFoundException(prisonId));

        this.prisonerRepository.deleteByFirstNameAndLastName(firstName,lastName);
        return Optional.of(this.prisonerRepository.save(new Prisoner(firstName, lastName, age, gender, status, description, datePrisoned, profession, education, city, prison)));
    }

    @Override
    public Optional<Prisoner> edit(Long id, String name, Double price, Integer quantity, Long category, Long manufacturer) {
        return Optional.empty();
    }

    @Override
    public void deleteById(Long id) {

    }
}
