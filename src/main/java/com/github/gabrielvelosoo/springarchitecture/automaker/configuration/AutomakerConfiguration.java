package com.github.gabrielvelosoo.springarchitecture.automaker.configuration;

import com.github.gabrielvelosoo.springarchitecture.automaker.Engine;
import com.github.gabrielvelosoo.springarchitecture.automaker.EngineType;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AutomakerConfiguration {

    @Bean
    @Primary
    public Engine aspiratedEngine() {
        var engine = new Engine();
        engine.setHorsepower(120);
        engine.setCylinders(4);
        engine.setModel("XPTO-0");
        engine.setLiterage(2.0);
        engine.setEngineType(EngineType.ASPIRATED);
        return engine;
    }

    @Bean
    public Engine eletricEngine() {
        var engine = new Engine();
        engine.setHorsepower(110);
        engine.setCylinders(3);
        engine.setModel("TH-40");
        engine.setLiterage(1.4);
        engine.setEngineType(EngineType.ELETRIC);
        return engine;
    }

    @Bean
    public Engine turboEngine() {
        var engine = new Engine();
        engine.setHorsepower(180);
        engine.setCylinders(4);
        engine.setModel("XPTO-01");
        engine.setLiterage(1.5);
        engine.setEngineType(EngineType.TURBO);
        return engine;
    }
}
