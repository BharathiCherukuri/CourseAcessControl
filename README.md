Course Access Control API - A Spring Boot backend application that provides RESTful APIs to manage course access based on user enrollment.  
Users can only access lessons for courses they are enrolled in.

1. Tech Stack
    Java 17
    Spring Boot 3.x
    Maven
    Embedded Tomcat
   
3. How to Run the Project
    Prerequisites
       Java 17 or higher installed  
       Maven installed  
   Steps
   1. Clone the repository
   2. Navigate to the project folder
   3. Build the project
   4. Run the application
   5. The server will start at: "http://localhost:8080"

API Endpoints
1. Get Lessons for a Course - GET /courses/{courseId}/lessons?userId={userId} -
    Eg: for enrolled users
   GET http://localhost:8080/courses/101/lessons?userId=1
        Response: ["Intro", "Basics", "Advanced Topics"]

       for Non-enrolled Students
     GET http://localhost:8080/courses/101/lessons?userId=2
        Response: 403 Forbidden
Rules:
Only enrolled users can access lessons.
Non-enrolled users receive HTTP 403 Forbidden.


DSA Solution  - Check if a string of parentheses is balanced.

Approach:
1. Use a Stack to track opening parentheses.
2. Pop from stack when encountering a closing parenthesis.
Return true if stack is empty at the end.

Time Complexity: O(n)
Space Complexity: O(n)

Design Assumptions - 1. Data is stored in-memory using Java collections (no database).
2. Enrollment and lesson data are mock data for demonstration.
3. No authentication layer is implemented.
4. This project is for educational and assessment purposes




