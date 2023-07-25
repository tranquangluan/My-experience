package com.example.simpledictionary.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.stereotype.Controller
public class Controller {
    @RequestMapping(method = RequestMethod.GET, value = "/dictionary")
    public String ShowDistionary(){
        return "dictionary";
    }
    @RequestMapping(method = RequestMethod.POST, value = "/dictionary")
    public String ShowResult(@RequestParam String word, Model model){
        String engWords[] = {"hello", "nice to meet you", "goodbye"};
        String vietWords[] = {"xin chào", "hân hạnh được gặp bạn", "tạm biệt"};
        String result = null;
        for (int i = 0; i < engWords.length; i++) {
            if (word.equals(engWords[i])){
                result = vietWords[i];
            }
        }
        model.addAttribute("result", result);
        return "dictionary";
    }
}
