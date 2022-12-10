package com.example.dians_project.data;

import com.example.dians_project.model.*;
import lombok.Getter;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
@Getter
public class DataHolder {

    public static List<Prison> prisons = new ArrayList<>();
    public static List<Prisoner> prisonerList = new ArrayList<>();
}