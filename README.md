# 📱 Contact Management System

A backend-based Contact Management System developed using **Java and Spring Boot**.  
The application provides RESTful APIs to manage contact information and demonstrates
CRUD operations, database connectivity, validation, and layered application development.

---

## 📌 About the Project
The **Contact Management System** is a Spring Boot application designed to manage
contact information efficiently.

The application allows users to perform basic contact management operations such as
creating, viewing, updating, and deleting contact records.

The project follows a structured backend architecture using **Spring Boot, Spring Data JPA,
and PostgreSQL** for database management.

It is developed as a practical project to understand how a Java Spring Boot application
connects with a relational database and performs CRUD operations through REST APIs.

---

## 🚀 Features
- ➕ Add a new contact
- 📋 View contact details
- 🔍 Retrieve contact information
- ✏️ Update existing contact details
- 🗑️ Delete contacts
- ✅ Input validation
- 💾 Persistent database storage
- 🌐 RESTful API architecture
- 🗄️ Database integration using Spring Data JPA
- 🧩 Layered application structure

---

## 🛠️ Technologies Used

### Backend
- **Java 21**
- **Spring Boot 3.5.6**
- **Spring Web**
- **Spring Data JPA**

### Database
- **PostgreSQL**
- **H2 Database** for runtime/testing purposes

### Other Tools & Libraries
- **Maven** – Project build and dependency management
- **Lombok** – Reduces boilerplate code
- **Spring Boot Validation** – Input validation
- **Spring Boot DevTools** – Development support

---

## 🏗️ Project Architecture
The project follows a layered Spring Boot architecture:

```text
Client
   |
   v
Controller Layer
   |
   v
Service Layer
   |
   v
Repository Layer
   |
   v
Database
(PostgreSQL / H2)
```

---

## 🔄 CRUD Operations
The project demonstrates the four basic CRUD operations:

| Operation | Description |
|-----------|-------------|
| Create | Add a new contact |
| Read | Retrieve contact information |
| Update | Modify existing contact details |
| Delete | Remove a contact |

---

## 📂 Project Structure
```text
Contact-System-Project/
│
├── .mvn/
│   └── wrapper/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── itshaala/
│   │   │           └── newcrud/
│   │   │
│   │   └── resources/
│   │       └── application.properties
│   │
│   └── test/
│       └── java/
│
├── .gitignore
├── mvnw
├── mvnw.cmd
├── pom.xml
└── README.md
```

---

**⚙️ Prerequisites**
Before running the project, make sure you have:
-Java JDK 21 or later
-Maven
-PostgreSQL
-IntelliJ IDEA / Eclipse / VS Code
-Git

---

**▶️ How to Run the Project**

1. Clone the Repository
git clone https://github.com/shitalb11/Contact-System-Project.git

2. Navigate to the Project Directory
cd Contact-System-Project

3. Configure the Database
Open:
src/main/resources/application.properties

Configure your PostgreSQL database details:
spring.datasource.url=jdbc:postgresql://localhost:5432/your_database
spring.datasource.username=your_username
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

4. Build the Project
mvn clean install

5. Run the Application
mvn spring-boot:run

You can also run the main Spring Boot application class directly from your IDE.

---

**🧪 Testing**
The project includes Spring Boot testing support.

Run the tests using:
mvn test

---

**🎯 Learning Objectives**
This project was developed to gain practical knowledge of:
-Java programming
-Spring Boot
-REST API development
-CRUD operations
-Spring Data JPA
-PostgreSQL database connectivity
-Input validation
-Maven project management
-Layered architecture
-Backend application development

---

**🔮 Future Enhancements**
Some possible improvements for this project are:
-User authentication and authorization
-Contact search functionality
-Pagination and sorting
-Email integration
-Frontend application using React or Angular
-Cloud deployment
-API documentation using Swagger/OpenAPI

---

**👩‍💻 Author**
Shital Bhosale
