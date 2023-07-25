package com.example.sandwich.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.stereotype.Controller

public class Controller {
    @GetMapping(value = "/sandwich")
    public String ShowFormSanwich(){
        return "sandwich";
    }
    @PostMapping(value = "/sandwich")
    public String save(@RequestParam("condiment") String[] condiment, Model model) {
        model.addAttribute("result", condiment);
        return "sandwich";
    }

}
