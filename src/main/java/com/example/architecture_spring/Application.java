package com.example.architecture_spring;

import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

@SpringBootApplication
@EnableConfigurationProperties
public class Application {

	static void main(String[] args) {
		// SpringApplication.run(ArchitectureSpringApplication.class, args);

        SpringApplicationBuilder builder = new SpringApplicationBuilder(Application.class);

        builder.bannerMode(Banner.Mode.OFF);
        builder.profiles("production");
        // builder.lazyInitialization(true or false);

        builder.run(args);

        ConfigurableApplicationContext context = builder.context();
        // Object productRepository = context.getBean("productRepository");

        ConfigurableEnvironment environment = context.getEnvironment();
        String applicationName = environment.getProperty("spring.application.name");
        System.out.println("Application Name: " + applicationName);

        ValueExample value = context.getBean(ValueExample.class);
        value.showVariable();

        AppProperties appProperties = context.getBean(AppProperties.class);
        System.out.println("App Config Variable: " + appProperties.getVariable());
        System.out.println("App Config Value: " + appProperties.getValue());
    }

}
