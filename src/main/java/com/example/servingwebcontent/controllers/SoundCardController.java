package com.example.servingwebcontent.controllers;

import org.springframework.ui.Model;
import com.example.servingwebcontent.controllers.models.Texts;
import com.example.servingwebcontent.repository.TextRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SoundCardController {
    @Autowired
    private TextRepository textRepository;

    @GetMapping("/SoundCard")
    public String blog (Model model){
        Iterable<Texts> texts = textRepository.findAll();
        model.addAttribute("texts",texts);
        return "SoundCard";
    }
}
