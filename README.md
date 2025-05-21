# Task Schedular API (Spring Boot ) 
A spring Boot-Based Task Management System that auto- update Task Status using a Schedular every 6 hours 

##  Features

- Create tasks with `PENDING` status
- Scheduler updates status every 6 hours:
  - PENDING → IN_PROGRESS → REVIEW → COMPLETED
- REST API to create and list tasks
- Integrated with MySQL
- Swagger UI for API testing
  

## How to Run 
- Clone the Repo
- https://github.com/umesh5282/Task-Management-with-Scheduler.git
   
- Configure `application.properties` with your MySQL credentials.  application run on port 8083
- Run the app:
-----------------------------------------------------------------------------------------------
# Api End Points 
- post  = http://localhost:8083/tasks
- get  =  http://localhost:8083/tasks
------------------------------------------------------------------------------------------------
## Test api in postman or Swagger 
 Swagger http://localhost:8083/swagger-ui/index.html#/
- Method:Post
- Url = http://localhost:8083/tasks
- Body
- {
  "title": "Task 1 ",
  "description": " Task status scheduler" }

----------------------------------------------------------------------------------------
- Method: Get
- URL http://localhost:8083/tasks
