package com.practice.helloworld.controllers;

import com.practice.helloworld.models.Users;
import com.practice.helloworld.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RegController {
    @Controller
    public class RegController {

        @Autowired
        private UserRepository userRepository;

        @GetMapping("/registration")
        public String register(Model model){
            return "register";
        }

        @PostMapping("/blog/add")
        public String registration (@RequestParam String username,
                                      @RequestParam String email,
                                      @RequestParam String password,
                                      Model model) {
            Users users = new Users(username, email, password);
            userRepository.save(users);
            return "redirect:/";
        }
}
