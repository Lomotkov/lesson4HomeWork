package com.example.MyBookShopApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MenuElementsController {
    @GetMapping("/documents")
    public String documentsPage(){
        return "/documents/index";
    }
    @GetMapping("/about")
    public String aboutPage(){
        return "/about";
    }
    @GetMapping("/faq")
    public String faqPage(){
        return "/faq";
    }
    @GetMapping("/contacts")
    public String singInPage(){
        return "/contacts";
    }
}
