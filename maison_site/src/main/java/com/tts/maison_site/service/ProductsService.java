package com.tts.maison_site.service;

import java.util.List;

import com.tts.maison_site.model.Products;
import com.tts.maison_site.repository.ProductRepository;

import org.springframework.stereotype.Service;

@Service
public class ProductsService {

    private ProductRepository pr;

    public ProductsService(ProductRepository pr) {
        this.pr = pr;
    }

    public List<Products> findAll() {
        return (List<Products>) pr.findAll();
    }

    // Uncomment this later!!!

    // public Products findByImage(String image){
    // return pr.findByImage(image);
    // }

    // public Products findByName(String name);{
    // return pr.findByName(name);
    // }

    // public Products findByDescription(String description){
    // return pr.findByDescription(description);
    // }

    // public Products findByPrice(String price){
    // return pr.findByPrice(price);
    // }


}
