# PayFlow API

# Project Overview

PayFlow API is a Spring Boot backend application developed to manage users and financial transactions. The project demonstrates the implementation of REST APIs, database integration using Spring Data JPA, and CRUD operations with an H2 in-memory database.

The application allows users to be created and stored in the database while also supporting transaction management between users.


# Technologies Used

- Java 21
- Spring Boot
- Spring Data JPA
- H2 Database
- Maven



# Project Structure

`
src/main/java/com/payflow
├── controller
├── entity
├── repository
├── service
└── PayflowApiApplication.java
`

# Package Description

- controller – Handles incoming HTTP requests and API endpoints.
- entity – Contains database entity classes such as User and Transaction.
- repository – Provides database access using JPA repositories.
- service – Contains business logic for users and transactions.
- PayflowApiApplication – Main entry point of the Spring Boot application.


# Features Implemented

# User Management
- Create a new user
- Retrieve user details
- Store user information in the database

# Transaction Management
- Create transactions
- View transaction records
- Persist transaction data using JPA

# Database Integration
- H2 in-memory database
- Automatic table creation using Hibernate
- H2 Console support for database inspection


# Database Configuration

# H2 Console

`
/h2-console
`

### Connection Details

`
JDBC URL : jdbc:h2:mem:testdb
Username : sa
Password : (leave blank)
```


# How to Run the Project

# Compile the Project

`bash
mvn clean compile
`

# Run the Application

`bash
mvn spring-boot:run
`

The application starts on:

`
http://localhost:8080
`

# Testing the Database

1. Start the application.
2. Open the H2 Console.
3. Use the provided JDBC URL and credentials.
4. Verify the User and Transaction tables.


# Learning Outcomes

Through this project, I gained practical experience in:

- Spring Boot application development
- REST API creation
- Dependency Injection
- Spring Data JPA
- Database connectivity
- Maven project management
- Git and GitHub version control



# Author

Diksha Lang

Computer Science Student

Project developed as part of Object-Oriented Programming and Backend Development practice using Spring Boot.