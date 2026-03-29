# Student Management API (Spring Boot + H2 Database)

## Overview
This project is a simple Student Management REST API built using Spring Boot and H2 Database. It performs CRUD operations like create, read, update, and delete student records.

---

## Technologies Used
- Java
- Spring Boot
- Spring Data JPA
- H2 Database
- Lombok
- REST API

---
##  Project Structure
com.example.h2connections
│
├── Controller
│   └── StudentController.java
│
├── Service
│   └── StudentService.java
│
├── DAO
│   └── Student1.java
│
├── Exception
│   └── StudentNotException.java

---

##  Entity Details

### Student1
| Field       | Type    |
|------------|--------|
| id         | Integer |
| name       | String |
| firstName  | String |
| lastName   | String |
| result     | String |

---

## API Endpoints

### 1️ Get All Students
- URL: /api/students
- Method: GET
- Description: Fetch all student records

---

### 2️ Add Student
- URL: /api/students
- Method: POST
- Body:
{
  "name": "John",
  "firstName": "John",
  "lastName": "Doe",
  "result": "Pass"
}

---

### 3️ Update Student
- URL: /api/students/{id}
- Method: PUT

---

### 4️ Delete Student
- URL: /api/students/{id}
- Method: DELETE

---

##  Exception Handling
- Custom Exception: StudentNotException
- Returns 404 NOT FOUND when student is not found

---

##  How to Run

1. Extract the project zip
2. Open in IntelliJ / Eclipse
3. Run the Spring Boot application
4. Use Postman or Browser

---

##  Test URLs

- GET: http://localhost:8080/api/students
- POST: http://localhost:8080/api/students
- PUT: http://localhost:8080/api/students/{id}
- DELETE: http://localhost:8080/api/students/{id}

---

##  H2 Console

- URL: http://localhost:8080/h2-console
- JDBC URL: jdbc:h2:mem:testdb
- Username: sa
- Password: (empty)

---

##  Features
- REST API with CRUD operations
- In-memory database
- Clean architecture
- Exception handling
- Lombok integration

---

##  Author
Praveen Kumar
