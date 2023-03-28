# Task list - core app

## Table of contents
* [General info](#general-info)
* [Technologies](#technologies)
* [Set up](#set-up)

## General info
This application is a backend site of the task list project. 

## Technologies
Project is created with:
* Java: 17
* Spring: 3.0.5
* Maven: 3.8.1

## Set up
This section shows how to set up and install the application on the Tomcat server.

First of all you need to clone the application using ```git clone https://github.com/m3tler/task-list-core.git```

Next you need to run PostgreSQL database server and set the connection configuration:
1. Go to ./src/main/resources/application.xml file.
2. Set the following properties:
- spring.datasource.url
- spring.datasource.username
- spring.datasource.password

**Important:** Before the app installation on the Tomcat server make sure you have Java 17 and Maven installed, and JAVA_HOME enviroment variable is set.

To set up the application follow these steps:
1. Build the application using ```mvn clean package``` command.
2. Copy api.war file from the ./target folder.
3. Paste file to the ./webapps folder in the Tomcat container.
4. Go to the ./bin folder and open command prompt.
5. Run the application using ```catalina.bat run``` command.
