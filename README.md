# Microservice Paraktikum Tutorial -Winter 2024/25 (TUB)- Sample service called: Micorservice-Two

This is a sample microservice demonstrating how to create a simple microservice using the Spring Boot framework. This service provides two main RESTful endpoint that returns a list of cities for a given country(calling microserviec-two) and another endpoint that return the list of countries.
## Project Technology Stack:

- **Java 17 (+)**
- [**Spring boot**](https://spring.io/projects/spring-boot) : framework
- [**Maven**](https://maven.apache.org/): build automation tool 
- [**H2**](https://www.h2database.com/html/main.html): embedded database
- [**Zipkin**](https://zipkin.io/pages/quickstart.html): tracing tool 
- [**Swagger**](https://swagger.io/tools/swagger-ui/): api document tool
- [**Eureka**](https://cloud.spring.io/spring-cloud-netflix/reference/html/): service discovery
- [**Spring cloud gateway**](https://spring.io/projects/spring-cloud-gateway): gateway

## Archirecture
![Architecture Diagram](Microservice-Application-Arch.png)

## Running

For starting the program, open the project inside your IDE, replace the **<FILE_PATH_IN_YOUR_SYSTEM>** inside the **src/main/resources/application.properties** with a path in your system. Then go to the **src/main/java/MicroserviceONEApplication.java** and run the class.

### usefull links after running the programm:

- http://localhost:8083/cities/healthCheck (health check service)
- http://localhost:8083/h2-console
- http://localhost:8083/swagger-ui/index.html (SWAGGER UI FOR CLIENT CALLS)
- http://localhost:8083/actuator (SPRING ACTUATOR)
- http://localhost:8761/ (Eureka server)
- http://localhost:8083/api-docs (SWAGGER API DOCUMENT)
  

