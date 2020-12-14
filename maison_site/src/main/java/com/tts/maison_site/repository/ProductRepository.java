package com.tts.maison_site.repository;

import java.util.List;

import com.tts.maison_site.model.Products;

import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Products, Long> {

    List<Products> findAll();

    Products findById(long id);

    Products findByImage(String image);

    Products findByName(String name);

    Products findByDescription(String description);

    Products findByPrice(Float price);

}
