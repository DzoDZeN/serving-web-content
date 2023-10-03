package com.example.servingwebcontent.controllers;

import ch.qos.logback.core.model.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;

@Controller
public class BlogController {
    @GetMapping("/about")
    public String blog (Model model){
        return "about";
    }
}
