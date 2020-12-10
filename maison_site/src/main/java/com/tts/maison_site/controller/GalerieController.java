package com.tts.maison_site.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GalerieController {
    // Linking to La Galerie Page
    @GetMapping(value = "/galerie")
    public String galerie() {
        return "products/galerie";
    }
}
