## Getting Started
To get started with this project, you will need to have the following installed on your local machine:

* JDK 11+
* Maven 3+

      Swagger is a specification for defining APIs (Application Programming Interfaces).
      Swagger is designed to improve upon previous versions by offering more powerful features and enhanced flexibility.
      
      The Swagger specification allows developers to define the structure and behavior of APIs, including details 
      such as endpoints, request/response formats, authentication methods, error handling, and more. It uses a JSON or YAML 
      format to describe the API and its documentation.
      
      With Swagger, developers can generate interactive documentation for their APIs, which makes it easier for other 
      developers to understand and consume the API. The documentation includes information about available endpoints, 
      parameters, request/response examples, and any other relevant details.

* Features

      API Documentation: Swagger/OpenAPI provides a structured and standardized way to document APIs. It allows developers 
      to define endpoints, request/response formats, parameters, and other details in a machine-readable format. 
      This documentation can be automatically generated and made available to other developers, making it easier to understand and consume the API.
      
      Client SDK Generation: Swagger/OpenAPI specifications can be used to generate client SDKs for various programming languages. 
      These SDKs provide pre-built code and functions that make it easier for developers to interact with the API. It saves time 
      and effort by automatically generating code that handles API requests, authentication, and error handling.
      
      Testing: Swagger/OpenAPI can be leveraged to generate automated tests for the API. By defining request/response examples 
      and expected behavior in the specification, developers can generate test cases that validate the API's functionality and performance. 
      Automated testing helps catch issues early in the development process and ensures the API behaves as expected.
      
      Consistency and Collaboration: Swagger/OpenAPI promotes consistency in API design by providing a standardized format and structure. 
      It allows multiple developers or teams to collaborate on API development, as the specification serves as a common reference point. 
      Developers can easily understand and work with APIs defined using Swagger/OpenAPI, reducing confusion and promoting better collaboration.
      
      API Visualization: Swagger/OpenAPI specifications can be used to generate interactive API documentation using tools like Swagger UI. 
      This documentation provides an interactive interface where developers can explore and test the API endpoints directly. It improves 
      the developer experience and makes it easier to understand the API's capabilities and usage.
      
      Ecosystem and Tooling: Swagger/OpenAPI has a vibrant ecosystem with numerous tools and integrations available. These tools range 
      from code editors with built-in Swagger/OpenAPI support to API management platforms that leverage the specification for documentation, 
      testing, and monitoring. The widespread adoption of Swagger/OpenAPI ensures compatibility and interoperability across various development tools and frameworks.
## Technologies used
    Java-11
    Spring-boot
    Open-API(Swagger)
### Document REST API with Swagger 2(Open API 2) dependency
           <dependency>
			<groupId>io.springfox</groupId>
			<artifactId>springfox-swagger-ui</artifactId>
			<version>3.0.0</version>
		</dependency>

		<dependency>
			<groupId>io.springfox</groupId>
			<artifactId>springfox-swagger2</artifactId>
			<version>3.0.0</version>
		</dependency>
### Document REST API with Swagger 3(Open API 3) dependency
      <dependency>
          <groupId>org.springdoc</groupId>
          <artifactId>springdoc-openapi-ui</artifactId>
          <version>1.7.0</version>
      </dependency>
## Build and Run the project, follow these steps
* Locally
    - Clone the repository: `git clone https://github.com/vikrantgit97/OpenApi-Swagger-DocumentationSpringboot.git`
    - Navigate to the project directory
    - Build the project: `mvn clean install`
    - Run `mvn clean package spring-boot:run` to build the artifact and run the application
## Documentation (Swagger)
[SwaggerDocumentation_SpringBoot_Application](http://localhost:8080/swagger-ui.html) to visualize the exposed API
- Swagger UI: `http://server:port/swagger-ui.html`
- OpenAPI `http://server:port/v3/api-docs`
### SpringBoot with Swagger(Open API) Documentation references
1)[Swagger (official site)](https://swagger.io/)

2)[Setting Up Swagger 2 with a Spring REST API Using Springfox](https://www.baeldung.com/swagger-2-documentation-for-spring-rest-api)

3)[Spring Boot REST API Documentation with Swagger](https://levelup.gitconnected.com/spring-boot-rest-api-documentation-with-swagger-cab4d865a15d)

4)[API Documentation using Swagger 3 with Spring Boot 2 + Spring Security](https://medium.com/javarevisited/api-documentation-using-swagger-3-with-spring-boot-2-spring-security-5a0d2b0996ee)

5)[Spring Boot and Swagger — Writing Good API Documentations](https://betterprogramming.pub/spring-boot-swagger-api-documentation-249b3cad7d9c)

6)[https://spring.io/projects/spring-restdocs (by Spring official)](https://spring.io/projects/spring-restdocs)

7)[spring-doc-openapi v1.7.0](https://springdoc.org/)

8)[Spring Boot + Swagger 3 (OpenAPI 3)](https://www.javainuse.com/spring/boot_swagger3)

9)[Spring Boot + Swagger 3 example (with OpenAPI 3)](https://www.bezkoder.com/spring-boot-swagger-3/)
