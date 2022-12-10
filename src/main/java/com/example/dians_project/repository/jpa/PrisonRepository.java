package com.example.dians_project.repository.jpa;

import com.example.dians_project.model.Prison;
import com.example.dians_project.model.Prisoner;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PrisonRepository extends JpaRepository<Prison,Long> {
    List<Prison> findAllByNameLike(String text);
    void deleteByName(String name);
}
