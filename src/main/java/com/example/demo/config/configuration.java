package com.example.demo.config;


import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class configuration {

	@Bean
	public OpenAPI springShopOpenAPI() {
		return new OpenAPI()
				.info(new Info().title("SpringBoot_Swagger_OpenAp-3 API")
						.description("SpringBoot with Swagger application")
						.version("v0.0.1")
						.license(new License().name("Apache 2.0").url("http://springdoc.org"))
						.contact(new Contact()
						.name("Vikrant")
						.url("https://github.com/vikrantgit97")
				)
            )
				.externalDocs(new ExternalDocumentation());
	}
}
