package com.example.architecture_spring.manufacturer.api;

import com.example.architecture_spring.manufacturer.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cars")
public class ManufacturerController {

    @Autowired
    @Qualifier("turboEngine")
    private Engine engine;

    @PostMapping
    public CarStatus startCar(@RequestBody Key key) {
        var car = new HondaHRV(engine);

        return car.ignite(key);
    }

}
