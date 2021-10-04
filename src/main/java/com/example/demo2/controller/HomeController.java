package com.example.demo2.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/demo2")
@RequiredArgsConstructor
@PreAuthorize("isAuthenticated()")
public class HomeController {
    
    @GetMapping("info")
    @PreAuthorize("hasAuthority(\"user\")") 
    public String info() {
        return "hello from demo2 app";
    }

}
