package com.example.dians_project.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class WebController {

    public WebController() {
    }

    @GetMapping({"/","/home"})
    public String showNews() {
        return "AlloWorld.html";
    }
}
