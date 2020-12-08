package com.tts.maison_site.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CartController {
    // Linking to Cart Page
    @GetMapping(value = "/cart")
    public String cart() {
        return "products/cart";
    }
}
