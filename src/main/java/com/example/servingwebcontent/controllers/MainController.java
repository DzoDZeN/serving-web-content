package com.example.servingwebcontent.controllers;

import org.springframework.ui.Model;
import com.example.servingwebcontent.controllers.models.Texts;
import com.example.servingwebcontent.repository.TextRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Optional;

@Controller
public class MainController {
    @Autowired
    private TextRepository textRepository;

    @GetMapping("/")
    public String home (Model model){
        Iterable<Texts> texts = textRepository.findAll();
        model.addAttribute("texts",texts);
        return "home";
    }
    @GetMapping("/SoundCard/2sgM1j4&JzqJrqMV7PPXBZs$0l/add")
    public String SoundCardAdd (Model model){
        return "SoundCard-add";
    }
    @PostMapping("/SoundCard/2sgM1j4&JzqJrqMV7PPXBZs$0l/add")
    public String SoundCardPostAdd(@RequestParam String title,@RequestParam String text, @RequestParam String photo, Model model){
        Texts texts = new Texts(title,text, photo);
        textRepository.save(texts);
        return "redirect:/";
    }
    @GetMapping("/SoundCard/{id}")
    public String SoundCardDetails (@PathVariable(value = "id") Long id, Model model){
        Optional<Texts> optionalTexts = textRepository.findById(id);
        ArrayList<Texts> textsArrayList = new ArrayList<>();
        optionalTexts.ifPresent(textsArrayList::add);
        model.addAttribute("text",textsArrayList);
        return "SoundCard-details";
    }

}
