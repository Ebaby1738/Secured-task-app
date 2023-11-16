## MY TASK API
This is a Spring Boot application for managing tasks with user registration and authentication.

## PREREQUISITES
- Java JDK installed (version 8 or higher)
- Maven build tool installed
- Your preferred REST client for testing (e.g., Postman)

## BUILD INSTRUCTIONS
Run "mvn clean install"
Run "mvn spring-boot:run"

## TEST INSTRUCTIONS
**Make sure to add the bearer token once user is successfully logged in
to the authorization header of the REST client used in testing to
successfully run other endpoints related to task



# User Endpoints
**Note that otp email will be sent once user successfully registers
1. REGISTER USER(Endpoint to register user):
POST  http://localhost:8080/auth/register

   {
   "fullName": "preferred full name",
   "email": "email address(mymail@gmail.com)",
   "password": "Password@1234",
   "confirmPassword": "Password@1234",
   "phoneNumber": "08199999999"
   }

2. CONFIRM USER ACCOUNT(Endpoint to confirm user with otp):
POST  http://localhost:8080/auth/confirm-account
   {
   "confirmationToken": "6 digits token sent to email"
   }

3. LOGIN USER(Endpoint to login user):
   POST  http://localhost:8080/auth/login

   {
   "email": "mymail@gmail.com",
   "password": "Password@1234"
   }

4. LOGOUT USER(Endpoint to logout user):
   Content-Type: application/json
   Authorization: Bearer <YOUR_JWT_TOKEN>
   POST  http://localhost:8080/auth/logout


# Task Endpoints
1. CREATE TASK(Endpoint to create task)
   Content-Type: application/json
   Authorization: Bearer <YOUR_JWT_TOKEN>
   POST  http://localhost:8080/api/my-task/create-task

   {
   "name": "my task app",
   "description": "Implement cloud service",
   "dueDate": "2023-11-30"
   }

2. UPDATE TASK(Endpoint to update task)
   Content-Type: application/json
   Authorization: Bearer <YOUR_JWT_TOKEN>
   PUT  http://localhost:8080/api/my-task/update-task/{{taskID}}

   {
   "name": "my task app",
   "description": "Implement cloud service",
   "dueDate": "2023-11-30"
   }

3. FIND ALL TASK BY USER(Endpoint to get all task of a user)
   Content-Type: application/json
   Authorization: Bearer <YOUR_JWT_TOKEN>
   GET  http://localhost:8080/api/my-task/get-tasks

4. FIND TASK BY USER(Endpoint to get single task of a user)
   Content-Type: application/json
   Authorization: Bearer <YOUR_JWT_TOKEN>
   GET  http://localhost:8080/api/my-task/get-task/{{taskId}}

5. DELETE TASK(Endpoint to delete task)
   Content-Type: application/json
   Authorization: Bearer <YOUR_JWT_TOKEN>
   PUT  http://localhost:8080/api/my-task/delete2

