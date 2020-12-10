package com.tts.maison_site.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SignupController {
    // Linking to Sign Up Page
    @GetMapping(value = "/signup")
    public String signup() {
        return "products/signup";
    }


    







}
