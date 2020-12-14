package com.tts.maison_site.controller;

import java.util.ArrayList;
import java.util.List;

import com.tts.maison_site.model.Products;

import com.tts.maison_site.service.ProductsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductsController {
    // Linking to Products Page
    @GetMapping(value = "/products")
    public String products() {
        return "products/products";
    }

    @Autowired
    private ProductsService productService;

    @GetMapping(value = "/products2")
    public String getProducts(Model model) {

        List<Products> products = new ArrayList<>();
        products = productService.findAll();
        model.addAttribute("productsList", products);
        return "products/products2";
    }

}
