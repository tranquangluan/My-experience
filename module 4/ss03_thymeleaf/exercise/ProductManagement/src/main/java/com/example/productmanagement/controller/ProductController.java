package com.example.productmanagement.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class ProductController {
    @GetMapping(value = "/product")
    public String showListProduct(){

        return "display";
    }
}
