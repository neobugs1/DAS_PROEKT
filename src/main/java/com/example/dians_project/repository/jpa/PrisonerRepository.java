package com.example.dians_project.repository.jpa;

import com.example.dians_project.model.Prison;
import com.example.dians_project.model.Prisoner;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface PrisonerRepository extends JpaRepository<Prisoner,Long> {
    Optional<Prisoner> findByFirstNameAndLastName(String name,String lastName);
    List<Prisoner> findByPrison(Prison prison);
    void deleteByFirstNameAndLastName(String name, String lastName);
}
