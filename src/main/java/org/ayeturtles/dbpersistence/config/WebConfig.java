package org.ayeturtles.dbpersistence.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")  // Aplica a todas las rutas
                .allowedOrigins("*")  // Permite cualquier origen
                .allowedMethods("*")  // Permite cualquier método HTTP (GET, POST, etc.)
                .allowedHeaders("*"); // Permite cualquier header
    }
}
