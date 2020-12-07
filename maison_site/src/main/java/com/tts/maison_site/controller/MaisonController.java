package com.tts.maison_site.controller;

import com.tts.maison_site.repository.MaisonRepository;

import com.tts.maison_site.model.Maison;
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
        maisonRepository.save(maison);
        model.addAttribute("fullName", maison.getFullName());
        model.addAttribute("emailAddress", maison.getEmailAddress());
        model.addAttribute("subjectMatter", maison.getSubjectMatter());
        model.addAttribute("clientMessage", maison.getClientMessage());
        return "maison/result";

    }

}
