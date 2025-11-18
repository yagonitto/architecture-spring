package com.example.architecture_spring.todos;

import org.springframework.stereotype.Component;

@Component
public class MailSender {

    public void sendMail(String message) {
        System.out.println("Sending mail: " + message);
    }
    
}
