package com.preperad.to.interview.algoritm.swagger;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
        info = @Info(
                title = "Algorithm API",
                version = "1.0",
                description = "Documentation for use API"
        )
)
public class OpenApiConfig {
}
