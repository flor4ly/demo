package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class FarewellServiceImpl implements GreetingService {
    public String getMessage() {
        return "Goodbye, Spring Boot!";
    }
}
