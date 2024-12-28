package com.github.gabrielvelosoo.springarchitecture.automaker.api;

import com.github.gabrielvelosoo.springarchitecture.automaker.CarStatus;
import com.github.gabrielvelosoo.springarchitecture.automaker.Engine;
import com.github.gabrielvelosoo.springarchitecture.automaker.HondaHRV;
import com.github.gabrielvelosoo.springarchitecture.automaker.Key;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/cars")
public class FactoryTestController {

    @Autowired
    @Qualifier("turboEngine")
    private Engine engine;

    @PostMapping
    public CarStatus startCar(@RequestBody Key key) {
        var car = new HondaHRV(engine);
        return car.ignite(key);
    }
}
