Project Company Service
=======================

InTRODUCTION
-------------------

This project implements certain basic funtionalities of a company. It makes available the following API:

* Creating a new company
* Getting the list of all companies
* Getting details about a particular company
* Updating the information for a specific company
* Adding beneficial owners of a company

REQUIREMENTS
----------
The following tools are required in order to fully utilize the project. They were used during the implementation of this project and form the core tools of the project.

* Spring MVC
* Maven version 3
* Mysql database
* Tomcat server

INSTALLATION
------------

In order to install this application, the of the requirements and /or dependencies mentioned in the requirements section above have to be met. Installation can be performed sequentially as follows:

* Install Java preferable Java 8 - [link](http://www.oracle.com/technetwork/java/javase/downloads/index.html)
* Install Maven first - [link](http://maven.apache.org/download.cgi)
* Install Spring Tool Suite (STS)  - [link](http://spring.io/tools/sts/all). It comes embedded with tomcat server.

CONFIGURATION
-------------
Some configuration is required in order to run this project.

* Open the **application.properties** file and set the set your database connection settings

QUERYING WITH CURL
------------------
Below are following ways to call the services using CUrl:
* curl  http://localhost:8080/company/new - POST data to the server
* curl  http://localhost:8080/company/all - GET all the companies from the database
* curl	http://localhost:8080/company/companyName - GET details for a particular company where company name has to be specified in the path
* curl	http://localhost:8080/company/companyName - PUT updates for a particular company named companyName
* curl	http://localhost:8080/company/companyName/owners/add - POST data to the server about the owners for a specific company called companyName

PROPOSITION
-----------
* In order to make the project redundant spring proposes a solution by the name of cloudfoundry The project can be hosted there and the problem of redundancy can be handled.
* When using springMVC it easier to manage authentication with the help of spring security. Spring security introduces several mechanisms to do this.

