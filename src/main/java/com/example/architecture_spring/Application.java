package com.example.architecture_spring;

import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

@SpringBootApplication
public class Application {

	static void main(String[] args) {
		// SpringApplication.run(ArchitectureSpringApplication.class, args);

        SpringApplicationBuilder builder = new SpringApplicationBuilder(Application.class);

        builder.bannerMode(Banner.Mode.OFF);
        builder.profiles("production");

        builder.run(args);

        ConfigurableApplicationContext context = builder.context();
        // Object productRepository = context.getBean("productRepository");

        ConfigurableEnvironment environment = context.getEnvironment();
        String applicationName = environment.getProperty("spring.application.name");
        System.out.println("Application Name: " + applicationName);
    }

}
