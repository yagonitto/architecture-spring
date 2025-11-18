package com.example.architecture_spring.manufacturer.configuration;

import com.example.architecture_spring.manufacturer.Engine;
import com.example.architecture_spring.manufacturer.EngineType;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ManufacturerConfiguration {

    @Bean(name = "aspiratedEngine")
    public Engine aspiratedEngine() {
        var engine = new Engine();

        engine.setHorsepower(150);
        engine.setCylinders(4);
        engine.setModel("ASP-1500");
        engine.setLiterage(1.4);
        engine.setEngineType(EngineType.ASPIRATED);

        return engine;
    }

    @Bean(name = "electricEngine")
    @Primary
    public Engine electricEngine() {
        var engine = new Engine();

        engine.setHorsepower(230);
        engine.setCylinders(4);
        engine.setModel("ELC-2300");
        engine.setLiterage(1.6);
        engine.setEngineType(EngineType.ELECTRIC);

        return engine;
    }

    @Bean(name = "turboEngine")
    public Engine turboEngine() {
        var engine = new Engine();

        engine.setHorsepower(200);
        engine.setCylinders(4);
        engine.setModel("TRB-1654");
        engine.setLiterage(1.5);
        engine.setEngineType(EngineType.TURBOCHARGED);

        return engine;
    }

}
