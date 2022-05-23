package com.practice.helloworld.controllers;

import com.practice.helloworld.models.User;
import com.practice.helloworld.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RegController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/registration")
    public String register(Model model){
        model.addAttribute("title", "Реєстрація");
        return "registration";
    }

    @PostMapping("/registration")
    public String registration(@RequestParam String username,
                               @RequestParam String email,
                               @RequestParam String password,
                               Model model){
        User user = new User(username, email, password);
        userRepository.save(user);
        return"redirect:/";
    }
}
