package org.ayeturtles.dbpersistence.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenApi(){
        return new OpenAPI()
                .info(new Info()
                        .title("Turtle Nest Monitoring Persistence DB API")
                        .version("1.0")
                        .description("This projects establish the connection with the database, we don't have any logic" +
                                "implemented in this project, since we only use this to save, consult and update information")
                );
    }

}
