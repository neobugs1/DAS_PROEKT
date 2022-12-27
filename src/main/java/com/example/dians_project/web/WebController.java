package com.example.dians_project.web;

import com.example.dians_project.model.Prison;
import com.example.dians_project.model.Prisoner;
import com.example.dians_project.service.PrisonService;
import com.example.dians_project.service.PrisonerService;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDateTime;
import java.util.List;


@Controller
public class WebController {

    private final PrisonService prisonService;
    private final PrisonerService prisonerService;

    public WebController(PrisonService prisonService, PrisonerService prisonerService) {
        this.prisonService = prisonService;
        this.prisonerService = prisonerService;
    }

    @GetMapping({"/", "/prisons"})
    public String getPrisonsPage(@RequestParam(required = false) Long id, Model model) {
        if (id != null) {
            if (this.prisonService.findById(id).isPresent()) {
                Prison prison = this.prisonService.findById(id).get();
                List<Prisoner> prisoners = this.prisonerService.findByPrison(prison);
                model.addAttribute("prisonersById", prisoners);
//            model.addAttribute("bodyContent", "add-product");
            }
        }
        List<Prisoner> prisonerList = this.prisonerService.findAll();
        model.addAttribute("prisoners", prisonerList);
        List<Prison> prisons = this.prisonService.listPrisons();
        model.addAttribute("prisons", prisons);

        return "AlloWorld.html";
    }

    @GetMapping("/add-form")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public String addProductPage(Model model) {
        List<Prison> prisons = this.prisonService.listPrisons();
        model.addAttribute("prisons", prisons);
        List<Prisoner> prisonerList = this.prisonerService.findAll();
        model.addAttribute("prisoners", prisonerList);
        model.addAttribute("bodyContent", "add-prisoner");
        return "master-template";
    }

    //Long id, String lastName, String firstName, Integer age, String gender, String status, String description, LocalDateTime datePrisoned, String profession, String education, String city, Long prisonId
    @PostMapping("/add")
    public String saveProduct(
//            @RequestParam(required = false) Long id,
            @RequestParam String firstName,
            @RequestParam String lastName,
            @RequestParam Integer age,
            @RequestParam String gender,
            @RequestParam String status,
            @RequestParam String description,
            @RequestParam("datePrisoned")@DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime datePrisoned,
            @RequestParam String profession,
            @RequestParam String education,
            @RequestParam String city,
            @RequestParam Long prisonId) {
//        if (id != null) {
//            this.prisonerService.edit(id, name, price, quantity, category, manufacturer);
//        } else {
        this.prisonerService.save(lastName, firstName, age, gender, status, description, datePrisoned, profession, education, city, prisonId);

        return "redirect:/";
    }

}
