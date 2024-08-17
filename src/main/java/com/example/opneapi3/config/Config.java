package com.example.opneapi3.config;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

	@Bean
	public OpenAPI springShopOpenAPI() {
		return new OpenAPI()
				.info(new Info().title("OpenApI-3Application")
						.description("SpringBoot with OpenApI application")
						.version("v0.0.1")
						.license(new License().name("Apache 2.0").url("https://www.apache.org/licenses/LICENSE-2.0.html"))
						.contact(new Contact()
						.name("Vikrant")
						.url("https://github.com/vikrantgit97")
				)
            )
		.externalDocs(new ExternalDocumentation());
	}
}
