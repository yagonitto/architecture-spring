package com.example.architecture_spring;

import com.example.architecture_spring.todos.MailSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AccessEmailConfiguration {

    @Autowired
    private AppProperties appProperties;

    @Bean
    public MailSender mailSender() {
        MailSender mailSender = new MailSender();
        String fooValue = appProperties.getFoo();
        mailSender.sendMail(fooValue);

        return mailSender;
    }

}
