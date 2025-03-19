package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {
    public String getMessage() {
        return "Hello, Spring Boot!";
    }
}
