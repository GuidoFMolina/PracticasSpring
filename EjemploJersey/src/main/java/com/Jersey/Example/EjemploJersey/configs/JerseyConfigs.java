package com.Jersey.Example.EjemploJersey.configs;


import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import javax.ws.rs.ApplicationPath;

@ApplicationPath("/")
@Component
public class JerseyConfigs extends ResourceConfig {
    public JerseyConfigs() {
        this.packages("com.Jersey.Example.EjemploJersey.controllers");
    }
}
