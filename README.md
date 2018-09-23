# Description
A hello world Spring Boot application built on top of the following:
1. Spring MVC
1. Spring Data Rest
1. Spring Data JPA
1. H2
1. Docker
1. Swagger
1. Flyway

# Environment
- Windows 8    
- PostgreSQL 10.5

# Backend
## Run
java -jar spring-boot-rest-jpa-docker-1.0.0.jar

# Execution
There are two ways to run the application.

## As Docker image
* Install Docker environment
* Execute: docker pull ivxivx/spring-boot-rest-jpa-docker:1.0.0
* Execute: docker run -p 8080:8080 ivxivx/spring-boot-rest-jpa-docker:1.0.0

## As Spring Boot application
* Go to [project root]/releases
* Execute: java -jar spring-boot-rest-jpa-docker-1.0.0.jar

# Testing
## Using Swagger
* Start the application and access http://localhost:8080/swagger-ui.html  
