# Task Management API

A RESTful API for managing tasks, built with Spring Boot, Gradle, and Spring Security. This API allows users to create, read, update, and delete tasks, along with user authentication via JWT (JSON Web Tokens).

## Features

- User registration and authentication
- JWT-based security
- CRUD operations for tasks
- H2 in-memory database for testing
- Simple task management system

## Technologies Used

- **Java 17**
- **Spring Boot 3.x**
- **Spring Security**
- **JWT (JSON Web Tokens)**
- **H2 Database**
- **Gradle**

## Getting Started

### Prerequisites

- Java 17 or higher
- Gradle
- An IDE (e.g., IntelliJ IDEA, Eclipse)

### Clone the Repository

```bash
git clone https://github.com/yourusername/task-management-api.git
cd task-management-api
```

# Run the Application

You can run the application directly from your IDE or by using the following command:

```bash
./gradlew bootRun
```

The application will start on http://localhost:8080.

API Endpoints
Authentication
Login: POST /api/auth/login

Request Body:
```json
{
  "username": "your_username",
  "password": "your_password"
}
```

### Tasks
Get All Tasks: GET /api/tasks

Get Task by ID: GET /api/tasks/{id}

Create a New Task: POST /api/tasks

### Request Body:

```json
{
  "title": "Task Title",
  "description": "Task Description"
}
```
Update Task: PUT /api/tasks/{id}

### Request Body:

```json
{
  "title": "Updated Task Title",
  "description": "Updated Task Description"
}
```
Delete Task: DELETE /api/tasks/{id}

### Database
This project uses an H2 in-memory database for data persistence. You can access the H2 console at http://localhost:8080/h2-console with the following credentials:

JDBC URL: jdbc:h2:mem:testdb
Username: sa
Password: (leave blank)
Running Tests
To run the unit tests, use the following command:

```bash
./gradlew test
```
### License
This project is licensed under the MIT License - see the LICENSE file for details.

### Contributing
Contributions are welcome! Please fork this repository and create a pull request for any features, improvements, or bug fixes.

### Acknowledgments
Spring Boot
Spring Security
H2 Database
JWT
