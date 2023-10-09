package com.example.servingwebcontent.controllers;

import org.springframework.ui.Model;
import com.example.servingwebcontent.controllers.models.Texts;
import com.example.servingwebcontent.repository.TextRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
    @GetMapping("/SoundCard/2sgM1j4&JzqJrqMV7PPXBZs$0l/add")
    public String SoundCardAdd (Model model){
        return "SoundCard-add";
    }
    @PostMapping("/SoundCard/2sgM1j4&JzqJrqMV7PPXBZs$0l/add")
    public String SoundCardPostAdd(@RequestParam String title,@RequestParam String text,@RequestParam String photo, Model model){
        Texts texts = new Texts(title,text, photo);
        textRepository.save(texts);
        return "redirect:/";
    }

}
