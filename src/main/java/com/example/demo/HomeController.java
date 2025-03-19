package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {
    @GetMapping("/")
    public String index() {
        return "index";
    }

    @PostMapping("/submit")
    public String handleSubmit(@RequestParam String name, Model model) {
        model.addAttribute("greeting", "Hello, " + name + "!");
        return "result";
    }
}
