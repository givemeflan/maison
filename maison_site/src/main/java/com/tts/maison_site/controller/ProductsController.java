package com.tts.maison_site.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductsController {
    // Linking to Products Page
    @GetMapping(value = "/products")
    public String products() {
        return "products/products";
    }
}
