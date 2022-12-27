package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


//@Configuration
//@EnableSwagger2
@SpringBootApplication
public class CurdApplication {
	
	
	public static void main(String[] args) {
		SpringApplication.run(CurdApplication.class, args);
		
		  
	}
	
	/*@Bean
	public Docket apiDoc() {
		return new Docket(DocumentationType.SWAGGER_2)  
		          .select()                                  
		          .apis(RequestHandlerSelectors.basePackage("com.example.demo.controller"))              
		          .paths(PathSelectors.any())                          
		          .build();      
	}*/

}
