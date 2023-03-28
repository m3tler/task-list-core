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
1. Clone the application using ```git clone``` 
2. Build the application using ```mvn clean package``` command.
3. Copy api.war file from the ./target folder.
4. Paste file to the ./webapps folder in the Tomcat container.
5. Move to the ./bin folder and open command prompt.
6. Run the application using ```catalina.bat run``` command.

**Important:** Make sure you have Java 17 installed and JAVA_HOME enviroment variable set.
