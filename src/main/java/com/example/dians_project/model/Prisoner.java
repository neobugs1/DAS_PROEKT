package com.example.dians_project.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "prisoner")
public class Prisoner {
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getDatePrisoned() {
        return datePrisoned;
    }

    public void setDatePrisoned(LocalDateTime datePrisoned) {
        this.datePrisoned = datePrisoned;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Prisoner(String lastName, String firstName, Integer age, String gender, String status, String description, LocalDateTime datePrisoned, String profession, String education, String city, Prison prison) {

        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
        this.gender = gender;
        this.status = status;
        this.description = description;
        this.datePrisoned = datePrisoned;
        this.profession = profession;
        this.education = education;
        this.city = city;
        this.prison = prison;
    }
    public Prisoner() {
    }

    @Id
    @GeneratedValue
    private Long id;

    private String lastName;

    private String firstName;

    private Integer age;

    private String gender;

    private String status;

    private String description;

    private LocalDateTime datePrisoned;

    private String profession;

    private String education;

    private String city;

    @ManyToOne
    @JoinColumn(name = "prison_id")
    private Prison prison;
}
