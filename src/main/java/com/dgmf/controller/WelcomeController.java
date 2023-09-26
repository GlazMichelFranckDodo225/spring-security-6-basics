package com.dgmf.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    //Endpoint: http://localhost:8080/welcome
    @GetMapping("/welcome")
    public String sayWelcome() {
        return "Welcome to Spring Application with Spring Security";
    }
}
