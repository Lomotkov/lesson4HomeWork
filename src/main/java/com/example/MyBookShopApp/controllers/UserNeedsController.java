package com.example.MyBookShopApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserNeedsController {
    @GetMapping("/postponed")
    public String postponedPage(){
        return "/postponed";
    }
    @GetMapping("/cart")
    public String cartPage(){
        return "/cart";
    }
}
