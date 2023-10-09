package com.example.servingwebcontent.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class AboutController {
    @GetMapping("/about")
    public String about(Model model) {
        return "about";
    }
}
