package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    @Autowired
    private CalculatorService calculatorService;
    @Autowired
    private HistoryService historyService;

    @GetMapping("/add")
    public int add(@RequestParam int a, @RequestParam int b) {
        int result = calculatorService.add(a, b);
        historyService.addRecord(a + " + " + b + " = " + result);
        return result;
    }

    @GetMapping("/history")
    public List<String> getHistory() {
        return historyService.getHistory();
    }
}
