package com.tts.maison_site.controller;

import com.tts.maison_site.model.BlogPost;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BlogPostController {

    // Linking to Blog Page
    @GetMapping(value = "/blog")
    public String blog(BlogPost blogPost) {
        return "blogpost/blog";
    }

    // private BlogPost blogPost;

    // @PostMapping(value = "/blog")
    // public String addNewBlogPost(BlogPost blogPost, Model model) {
    // blogPostRepository.save(new BlogPost(blogPost.getTitle(),
    // blogPost.getAuthor(), blogPost.getBlogEntry()));
    // model.addAttribute("title", blogPost.getTitle());
    // model.addAttribute("author", blogPost.getAuthor());
    // model.addAttribute("blogEntry", blogPost.getBlogEntry());
    // return "blogpost/blogresult";
    // }
}
