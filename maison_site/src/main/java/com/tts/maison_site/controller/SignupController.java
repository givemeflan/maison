package com.tts.maison_site.controller;

// import javax.validation.Valid;

// import com.tts.maison_site.model.User;

import org.springframework.stereotype.Controller;
// import org.springframework.ui.Model;
// import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SignupController {
    // Linking to Sign Up Page
    @GetMapping(value = "/signup")
    public String signup() {
        return "products/signup";
    }

    // @PostMapping(value = "/signup")
    // public String createNewUser(@Valid User user, BindingResult bindingResult,
    // Model model) {
    // User userExists = userService.findByUsername(user.getUsername());
    // if (userExists != null) {
    // bindingResult.rejectValue("username", "error.user", "Username is already
    // taken");
    // }

    // if (!bindingResult.hasErrors()) {
    // userService.saveNewUser(user);
    // model.addAttribute("success", "Sign up successful!");
    // model.addAttribute("user", new User());
    // }
    // return "login";
    // }

}
