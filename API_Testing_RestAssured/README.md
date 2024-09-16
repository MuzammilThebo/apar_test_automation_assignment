# API Automation Assignment

## Project Overview
This project automates the process of adding a new device using a RESTful API. The framework uses **Rest Assured** with **TestNG** for writing and executing API tests. 

### Key Features:
- Sends a POST request to add a new device.
- Validates the response payload, ensuring fields like `id` and `createdAt` are not null.
- Asserts that the device details (name, year, price, etc.) are correct.
- Generates reports with the test results.

## Tech Stack:
- **Java**
- **Rest Assured** for API automation.
- **TestNG** for unit testing.
- **Maven** as a build tool.

## Prerequisites:
- **Java 1.8** or later.
- **Maven** installed.

## How to Run:
1. Clone this repository.
    `https://github.com/MuzammilThebo/apar_test_automation_assignment.git`
2. Clone this repository.
    `cd ApiAutomationAssignment`
3. Run the following command:
   `mvn clean test`

4. **View Test Results**:
    Test results will be shown in the console.

## Folder Structure:
`src/main/java` - Contains utility classes and POJO models.
`src/test/java` - Contains the test cases and base setup.
`pom.xml` - Maven dependencies and project configurations.

## Contact:
For any questions, feel free to reach out via muzammil147freeman@gmail.com.