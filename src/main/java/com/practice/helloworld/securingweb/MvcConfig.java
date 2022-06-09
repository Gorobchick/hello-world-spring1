package com.practice.helloworld.securingweb;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

        @Override
        public void addViewControllers(ViewControllerRegistry registry) {
            registry.addViewController("/login").setViewName("login");
            registry.addViewController("/").setViewName("home");
            registry.addViewController("/about").setViewName("hello");
            registry.addViewController("/blog-add").setViewName("blog");
            registry.addViewController("/blog-main").setViewName("blog");
            registry.addViewController("/blog-detales").setViewName("blog");
            registry.addViewController("/blog-edit").setViewName("blog");
        }

}
