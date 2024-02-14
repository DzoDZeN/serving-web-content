package com.example.webСontent.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
public class ErrorsControllers {
    @ResponseStatus(HttpStatus.NOT_FOUND)

    public String handleNotFound(Exception e, Model model) {
        model.addAttribute("error", e.getMessage());
        return "error";
    }

}
