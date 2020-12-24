# MicroServices_SpringBoot
MicroServices_SpringBoot
LInk https://www.edureka.co/blog/microservices-with-spring-boot

What are Microservices?
microservices as an architectural style for building a suite of autonomous, self-contained and loosely coupled services that communicate over lightweight mechanisms, such as HTTP resource APIs. (monolithic means whole application microservices means divide those into small services)

Why there is a need for Spring Boot?
Spring Boot enables building production-ready applications quickly and provides non-functional features:
•	Embedded servers which are easy to deploy with the containers
•	It helps in monitoring the multiples components
•	It helps in configuring the components externally


Eureka Service–  This Service will register every microservice and then the client microservice will look up the Eureka server to get a dependent microservice to get the job done.This Eureka Server is owned by Netflix and in this, Spring Cloud offers a declarative way to register and invoke services by Java annotation.


Actuator: features to help you monitor and manage your application
Eureka Discovery: for service registration
JPA: to save/retrieve data
H2: an in-memory database
Rest Repositories: to expose JPA repositories as REST endpoints
Web: Spring MVC and embedded Tomcat
DevTools: to auto-reload the application when files change
Lombok: to reduce boilerplate code


Eureka Discovery: for service registration
Feign: a declarative web service client
Zuul: provides intelligent routing
Rest Repositories: to expose JPA repositories as REST endpoints
Web: Spring MVC and embedded Tomcat
Hystrix: a circuit breaker to stop cascading failure and enable resilience
Lombok: to reduce boilerplate code
