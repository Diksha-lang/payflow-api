# PayFlow API

# About the Project

PayFlow API is a backend application built using Spring Boot. The main goal of this project is to learn how REST APIs work, how data can be stored in a database using JPA, and how different layers of a Spring Boot application interact with each other.

In this project, users can be registered and stored in a database, and transactions can be recorded between users. The project uses the H2 in-memory database for easy testing and development.


# Technologies Used

- Java 21
- Spring Boot
- Spring Data JPA
- H2 Database
- Maven
- Git & GitHub


# Project Structure

```text
src/main/java/com/payflow
├── controller
├── entity
├── repository
├── service
└── PayflowApiApplication.java
```


# Features

# User Management

- Add a new user
- View all users
- Find a user by ID
- Find a user using UPI ID
- View users having balance greater than a specified amount

# Transaction Management

- Create a transaction
- Store transaction records
- View transaction information

# Database Support

- H2 in-memory database
- Automatic table creation using Hibernate
- H2 Console for viewing database tables and records


# Running the Project

# Compile

```bash
mvn clean compile
```

# Start the Application

```bash
mvn spring-boot:run
```

The application runs on:

```text
http://localhost:8080
```



# Available API Endpoints

# User APIs

| Method | Endpoint |
|----------|----------|
| POST | /users |
| GET | /users |
| GET | /users/{id} |
| GET | /users/upi/{upiId} |
| GET | /users/balance/{amount} |

# Transaction APIs

| Method | Endpoint |
|----------|----------|
| POST | /transactions |
| GET | /transactions |



# H2 Database Access

Open:

```text
http://localhost:8080/h2-console
```

Use the following credentials:

```text
JDBC URL : jdbc:h2:mem:testdb
Username : sa
Password : (leave blank)
```



# Sample User JSON

```json
{
  "name": "Priya",
  "upiId": "priya@okaxis",
  "balance": 5000,
  "phoneNumber": "9876543210"
}
```



# What I Learned

While building this project, I learned:

- How Spring Boot applications are structured
- Creating REST APIs using controllers
- Using Spring Data JPA for database operations
- Connecting applications with a database
- Working with Maven dependencies
- Using Git and GitHub for version control
- Understanding layered architecture (Controller, Service, Repository)



# Future Improvements

Some features that can be added in the future are:

- Validation for user inputs
- Better exception handling
- Spring Security for authentication
- Swagger API documentation
- Integration with MySQL or PostgreSQL
- Transaction status tracking


# Author

*Diksha Lang* 
B.Sc. Computer Science Student

This project was developed as part of my learning journey in Object-Oriented Programming and Spring Boot backend development.