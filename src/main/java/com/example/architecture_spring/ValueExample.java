package com.example.architecture_spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ValueExample {

    @Value("${app.config.variable}")
    private String variable;

    public void showVariable() {
        System.out.println("Config Variable: " + variable);
    }

}
