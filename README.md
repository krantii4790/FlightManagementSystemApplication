# ✈️ Flight Management System (Spring Boot)

A RESTful **Flight Management System** built using **Spring Boot**, **Spring Data JPA**, and **MySQL**.  
This application provides CRUD operations for managing flight customers, including booking details such as arrival, departure, duration, and fare.

---

## 📌 Features

- Create, read, update, and delete customer flight bookings
- RESTful API design
- Layered architecture (Controller, Service, Repository)
- Spring Data JPA for database operations
- MySQL database integration
- Maven-based project structure
- Spring Boot DevTools support for faster development

---

## 🛠️ Tech Stack

- **Java 17**
- **Spring Boot 3.5.7**
- **Spring Web**
- **Spring Data JPA**
- **MySQL**
- **Maven**
- **Eclipse / Spring Tools Suite**

---

## 📂 Project Structure

```
FlightManagementSystem
├── src/main/java/com/flightbooking
│ ├── controller
│ │ └── CustomerController.java
│ ├── model
│ │ └── Custumer.java
│ ├── repository
│ │ └── CustomerRepository.java
│ ├── service
│ │ └── CustomerService.java
│ └── FlightManagementSystemApplication.java
│
├── src/main/resources
│ └── application.properties
│
├── pom.xml
└── mvnw / mvnw.cmd
```

---

## 🔗 REST API Endpoints

Base URL:
http://localhost:8080/customerapi


| Method | Endpoint | Description |
|------|---------|-------------|
| GET | `/allCust` | Get all customers |
| GET | `/{id}` | Get customer by ID |
| POST | `/addProduct` | Add new customer |
| PUT | `/updateProduct/{id}` | Update customer by ID |
| DELETE | `/deleteProduct/{id}` | Delete customer by ID |

---

## 🧪 Sample JSON Request (POST)

```json
{
  "arrival": "Mumbai",
  "depature": "Delhi",
  "duration": "2h 10m",
  "fare": 5500
}
```
---

⚙️ **Database Configuration**
Update application.properties with your MySQL details:

spring.datasource.url=jdbc:mysql://localhost:3306/flightdb
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect

---

# ▶️  How to Run the Project
Using Eclipse / STS
Import project as Existing Maven Project

Update Maven dependencies

Run FlightManagementSystemApplication.java

Using Command Line
mvn spring-boot:run

---

👨‍💻 Author
Krantikumar Dilip Patil

GitHub: https://github.com/krantii4790

Java Full Stack | Spring Boot Developer
