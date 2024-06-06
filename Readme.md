Day 1: Backend Development with Spring Boot
Step 1: Set Up Spring Boot Project
Create a new Spring Boot project:

Use Spring Initializr (https://start.spring.io/) to generate a new project.
Select dependencies: Spring Web, Spring Data JPA, Spring Security, H2 Database (or any other database you prefer), Spring Boot DevTools.
Set Up Project Structure:

Create the necessary packages: controller, service, repository, model, security.
Step 2: Implement User Authentication
User Entity and Repository:

Create a User entity.
Create a UserRepository interface.
Security Configuration:

Configure Spring Security for user authentication.
Implement UserDetailsService and PasswordEncoder.
Authentication Controller:

Create endpoints for user registration and login.
Step 3: Implement Task Management
Task Entity and Repository:

Create a Task entity.
Create a TaskRepository interface.
Task Service:

Create a TaskService class to handle business logic.
Task Controller:

Create a TaskController class with endpoints for CRUD operations.
Database Configuration:

Set up H2 (or your chosen database) in application.properties.