package com.example.demo;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Value;
@RestController
@RequestMapping("/profile")
public class ProfileController {
    @Value("${app.message}")
    private String message;

    @GetMapping
    public String getMessage() {
        return message;
    }
}

