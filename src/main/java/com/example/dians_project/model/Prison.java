package com.example.dians_project.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Data
@Entity
public class Prison {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String municipality;

    private String city;

    private Double lat;

    private Double lon;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMunicipality() {
        return municipality;
    }

    public void setMunicipality(String municipality) {
        this.municipality = municipality;
    }

    public String getCity() {
        return city;
    }

    public Prison(String name, String municipality, String city, Double lat, Double lon, List<Prisoner> prisonerList) {
        this.name = name;
        this.municipality = municipality;
        this.city = city;
        this.lat = lat;
        this.lon = lon;
    }

    public void setCity(String city) {
        this.city = city;
    }
    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLat() {
        return lat;
    }

    public Double getLon() {
        return lon;
    }

    public void setLon(Double lon) {
        this.lon = lon;
    }

    public Prison() {
    }
}
