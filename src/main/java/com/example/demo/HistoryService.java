package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HistoryService {
    private final List<String> history = new ArrayList<>();

    public void addRecord(String operation) {
        history.add(operation);
    }

    public List<String> getHistory() {
        return history;
    }
}
