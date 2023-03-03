package com.authentication.ldap.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWordController {
    @GetMapping("/")
    public String index(){
        return "Welcome to ehe home page";
    }
}
