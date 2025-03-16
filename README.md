# Spring Boot CRUD Application

## Description
This is a simple Spring Boot CRUD (Create, Read, Update, Delete) application that manages Employee records using Spring Data JPA and a RESTful API.

## Features
- Perform CRUD operations on Employee records
- Uses Spring Boot with Spring Data JPA for database operations
- Exposes RESTful endpoints for managing Employee entities

## Technologies Used
- Java
- Spring Boot
- Spring Data JPA
- REST API
- MySQL or H2 Database (Configurable)

## Installation

### Prerequisites
- Java 17 or later
- Maven
- MySQL (if using a database other than H2)

### Steps
1. Clone the repository:
   ```sh
   git clone https://github.com/your-username/your-repo.git
   
2.  Navigate to the project directory:
    ```sh
    cd your-repo 

3. Configure the database in application.properties (for MySQL):
   ```sh
   spring.datasource.url=jdbc:mysql://localhost:3306/your_database
   spring.datasource.username=root
   spring.datasource.password=your_password
   spring.jpa.hibernate.ddl-auto=update
4. Build and run the project:
   ```sh
   mvn spring-boot:run

## API Endpoints
| Method | Endpoint                | Description                      |
|--------|-------------------------|----------------------------------|
| GET    | `/api/employees`        | Get all employees               |
| GET    | `/api/employees/{id}`   | Get an employee by ID           |
| POST   | `/api/employees`        | Add a new employee              |
| PUT    | `/api/employees`        | Update an existing employee     |
| DELETE | `/api/employees/{id}`   | Delete an employee by ID        |

   
## Contributing
 - Fork the project
 - Create a new branch (git checkout -b feature-branch)
 - Commit your changes (git commit -m 'Add new feature')
 - Push to the branch (git push origin feature-branch)
 - Open a Pull Request


