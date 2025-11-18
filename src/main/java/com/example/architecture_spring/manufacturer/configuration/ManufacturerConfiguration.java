package com.example.architecture_spring.manufacturer.configuration;

import com.example.architecture_spring.manufacturer.Engine;
import com.example.architecture_spring.manufacturer.EngineType;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ManufacturerConfiguration {

    @Bean
    public Engine engine() {
        var engine = new Engine();

        engine.setHorsepower(150);
        engine.setCylinders(4);
        engine.setModel("ASP-1500");
        engine.setLiterage(1.5);
        engine.setEngineType(EngineType.ASPIRATED);

        return engine;
    }

}
