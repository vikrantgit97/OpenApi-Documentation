## Getting Started
To get started with this project, you will need to have the following installed on your local machine:

* JDK 11+
* Maven 3+

## Technologies used
    Java-11
    Spring-boot
    Open-API(Swagger)
## Build and Run the project, follow these steps
* Locally
    - Clone the repository: `git clone https://github.com/vikrantgit97/OpenApi-Swagger-DocumentationSpringboot.git`
    - Navigate to the project directory
    - Create a database in MySql `db_caching`
    - Build the project: `mvn clean install`
    - Run `mvn clean package spring-boot:run` to build the artifact and run the application
* Docker
    - Run `docker-compose up --build -d` to run the docker services
## Documentation (Swagger)
[SwaggerDocumentation_SpringBoot_Application](http://localhost:8080/swagger-ui.html) to visualize the exposed API