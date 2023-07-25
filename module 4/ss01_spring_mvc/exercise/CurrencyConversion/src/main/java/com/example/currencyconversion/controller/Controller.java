package com.example.currencyconversion.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import java.lang.NullPointerException;

@org.springframework.stereotype.Controller

public class Controller {
    @RequestMapping(method = RequestMethod.GET, value = "/conversion")
    public String ShowPageConversion(){
        return "conversion";
    }

    @RequestMapping(method = RequestMethod.POST, value = "/conversion")
    public String ShowResult(@RequestParam String USD, Model model){
        int result = Integer.parseInt(USD)*23000;
        model.addAttribute("currency", result);
        return "conversion";
    }
}
