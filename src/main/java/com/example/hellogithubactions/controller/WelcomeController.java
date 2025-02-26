package com.example.hellogithubactions.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class WelcomeController {

    @GetMapping("/welcome")
    public String welcome() {
        return "welcome"; // Returnerer en HTML-side (welcome.html)
    }
}

