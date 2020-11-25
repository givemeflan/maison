package com.tts.maison_site.maison;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MaisonController {

    @Autowired
    private MaisonRepository maisonRepository;

    // Linking to Homepage
    @GetMapping(value = "/")
    public String index(Maison maison) {
        return "maison/index";
    }

    // Linking to About Page
    @GetMapping(value = "/about")
    public String about(Maison maison) {
        return "maison/about";
    }

    private Maison Maison;

    @PostMapping(value = "/")
    public String addNewMaison(Maison maison, Model model) {
        maisonRepository.save(
                new Maison(maison.getFirstName(), maison.getLastName(), maison.getUserName(), maison.getSignedup()));
        model.addAttribute("firstName", maison.getFirstName());
        model.addAttribute("lastName", maison.getLastName());
        model.addAttribute("userName", maison.getUserName());
        return "maison/result";

    }

}
