package com.tts.maison_site.repository;

import com.tts.maison_site.model.BlogPost;

import org.springframework.data.repository.CrudRepository;
public interface BlogPostRepository extends CrudRepository<BlogPost, Long> {

}
