package com.example.servingwebcontent.controllers;


import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
public class MainController {

    @GetMapping("/")
    public String home(Model model) {
        return "home";
    }
    @ExceptionHandler(org.springframework.web.servlet.NoHandlerFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String handleNotFound(Exception e, Model model) {
        model.addAttribute("error", e.getMessage());
        return "error";
    }

}