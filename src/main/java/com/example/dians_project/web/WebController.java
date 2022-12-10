package com.example.dians_project.web;

import com.example.dians_project.model.Prison;
import com.example.dians_project.model.Prisoner;
import com.example.dians_project.service.PrisonService;
import com.example.dians_project.service.PrisonerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@Controller
public class WebController {

    private final PrisonService prisonService;
    private final PrisonerService prisonerService;

    public WebController(PrisonService prisonService, PrisonerService prisonerService) {
        this.prisonService = prisonService;
        this.prisonerService = prisonerService;
    }

    @GetMapping({"/","/prisons"})
    public String getPrisonsPage(@RequestParam(required = false) Long id, Model model) {
        if(id!=null) {
            if (this.prisonService.findById(id).isPresent()) {
                Prison prison = this.prisonService.findById(id).get();
                List<Prisoner> prisoners = this.prisonerService.findByPrison(prison);
                model.addAttribute("prisonersById", prisoners);
//            model.addAttribute("bodyContent", "add-product");
            }
        }
        List<Prisoner> prisonerList = this.prisonerService.findAll();
        model.addAttribute("prisoners",prisonerList);
        List<Prison> prisons = this.prisonService.listPrisons();
        model.addAttribute("prisons", prisons);

        return "AlloWorld.html";
    }
}
