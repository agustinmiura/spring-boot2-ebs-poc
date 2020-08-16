# Spring boot sample for Amazon EBS

This is a poc of a Spring Boot sample application with the following features :
* Spring Boot 2 .
* Java 11.
* Connection against a Postgresql database.

Local setup
===========

* Install Java 11.
* Install Docker compose .
* Set the parameters for the Postgresql inside the database.env file
* Inside the docker folder execute : ```docker-compose up```
* Create the database tables.
* Run the app with ```mvn spring-boot:run```
* Execute : ```curl localhost:5000/api/v1/people```