package com.example.programstoreemailconfiguration.controller;

import com.example.programstoreemailconfiguration.bean.Email;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class EmailController {
    @GetMapping(value = "/program")
    public String ShowFormEmail(Model model){
        model.addAttribute("email", new Email());
        model.addAttribute("language", new String[]{"English", "Vietnamese", "Japanese", "Chinese"});
        model.addAttribute("size", new Integer[]{5, 10, 15, 25, 50, 100});
        return "program";
    }
    @PostMapping(value = "/program")
    public ModelAndView Submit(@ModelAttribute Email email, Model model){
        ModelAndView modelAndView = new ModelAndView("display");
        modelAndView.addObject("email", email);
        return modelAndView;
    }
}
