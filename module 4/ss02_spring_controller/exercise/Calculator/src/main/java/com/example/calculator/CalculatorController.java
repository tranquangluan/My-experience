package com.example.calculator;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class CalculatorController {
    @GetMapping(value = "/calculator")
    public String ShowFormCalculator(){
        return "calculator";
    }
    @PostMapping(value = "/calculator")
    public String calculatorResult(@RequestParam String element1,@RequestParam String element2,@RequestParam("calculate") String calculate, Model model){
        double result = 0;
        switch (calculate){
            case "add":
                result = Integer.parseInt(element1) + Integer.parseInt(element2);
                model.addAttribute("result", result);
                break;
            case "sub":
                    result = Integer.parseInt(element1) - Integer.parseInt(element2);
                    model.addAttribute("result", result);
                    break;
            case "mul":
                result = Integer.parseInt(element1) * Integer.parseInt(element2);
                model.addAttribute("result", result);
                break;
            case "div":
                result = Integer.parseInt(element1) / Integer.parseInt(element2);
                model.addAttribute("result", result);
                break;
        }
        return "calculator";
    }
}
