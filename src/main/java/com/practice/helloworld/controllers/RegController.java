package com.practice.helloworld.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RegController {
    package com.practice.helloworld.controllers;

import com.practice.helloworld.models.Post;
import com.practice.helloworld.repo.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Optional;

    @Controller
    public class BlogController {

        @Autowired
        private PostRepository postRepository;



        @GetMapping("/registration")
        public String (Model model){
            return "";
        }


}
