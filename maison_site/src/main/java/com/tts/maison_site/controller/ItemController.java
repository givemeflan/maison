package com.tts.maison_site.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ItemController {

    @GetMapping(value = "/item/{id}")
    public String main() {

        return "products/item";
    }
}
