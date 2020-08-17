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

Amazon before deploy
====================

* Create an Amazon RDS and set a private security group where you open the port 5432 from the vpc where the EBS belongs and also your machine
* Test the connection agains the RDS from your machine and a Sql Client .
* Create the database inside the remote instance .

Amazon EBS deploy
=================

* Create an instance of Postgresql in Amazon and open the ports to allow connections .
* Take notes of the user, password and url.
* Deploy the app in EBS and see how it fails .
* Set the following variables in the EBS application :
  * SERVER_PORT : 5000
  * SPRING_DATASOURCE_PASSWORD:$dataBasePassword
  * SPRING_DATASOURCE_URL:jdbc:postgresql://$dataBaseUrl:$dataBasePort/$databaseName
  * SPRING_DATASOURCE_USERNAME:$usernameDb
