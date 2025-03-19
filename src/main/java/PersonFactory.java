package com.example.demo;

public class PersonFactory {
    public static Person createDefaultPerson() {
        return new Person("Default Name", 30, "Unknown Address");
    }
}
