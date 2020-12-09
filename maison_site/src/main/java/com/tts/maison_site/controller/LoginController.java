package com.tts.maison_site.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
    // Linking to Login Page
    @GetMapping(value = "/login")
    public String login() {
        return "products/login";
    }

}
