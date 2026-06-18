# Spring Boot REST API Demo

## Overview

This project is a simple backend application built using **Spring Boot** to understand the fundamentals of **REST APIs**. It demonstrates how to create, read, update, and delete resources using standard HTTP methods.

The project is intended for learning purposes and serves as a starting point for building RESTful web services with Spring Boot.

---

## Features

- RESTful API implementation
- CRUD (Create, Read, Update, Delete) operations
- Spring Boot framework
- JSON request and response handling
- Layered architecture (Controller, Service, Repository)
- Exception handling (if implemented)
- Simple and easy-to-understand code structure

---

## Technologies Used

- Java
- Spring Boot
- Spring Web
- Maven
- REST APIs
- JSON



## Project Structure

```
src
├── main
│   ├── java
│   │   └── com.embarkX.ChallengeApp
│   │       ├── controller
│   │       ├── service
│   │       ├── repository
│   │       ├── model
│   │       └── Application.java
│   └── resources
│       └── application.properties
└── test
```

---

## REST Endpoints

| Method | Endpoint | Description |
|---------|----------|-------------|
| GET | `/api/...` | Retrieve data |
| GET | `/api/.../{id}` | Retrieve a single resource |
| POST | `/api/...` | Create a new resource |
| PUT | `/api/.../{id}` | Update an existing resource |
| DELETE | `/api/.../{id}` | Delete a resource |

> Replace the endpoints above with your actual API endpoints.

---

## Getting Started

### Prerequisites

- Java 17 (or your project's Java version)
- Maven
- IDE (IntelliJ IDEA / Eclipse / VS Code)

### Clone the Repository

```bash
git clone https://github.com/Sangramjit150/Rest_Apis_Simplified.git
```

### Navigate to the Project

```bash
cd Rest_Apis_Simplified
```

### Run the Application

Using Maven:

```bash
mvn spring-boot:run
```

Or run the main application class directly from your IDE.

---

## Testing the APIs

You can test the endpoints using:

- Postman
- Insomnia
- cURL
- Swagger UI (if integrated)

Example:

```http
GET http://localhost:8080/challenges/...
```

---

## Learning Objectives

This project helped in understanding:

- What REST APIs are
- HTTP methods (GET, POST, PUT, DELETE)
- Request mapping annotations
- RequestBody and PathVariable
- JSON serialization/deserialization
- Spring Boot project structure
- Dependency Injection
- Building RESTful web services

---

## Future Improvements

- Add database integration
- Input validation
- Global exception handling
- Swagger/OpenAPI documentation
- Authentication and Authorization using Spring Security
- Unit and Integration testing
- Docker support

---

## Author

**Sangramjit Baksi**

GitHub: https://github.com/Sangramjit150

---

## License

This project is created for educational purposes and is open for learning and experimentation.
