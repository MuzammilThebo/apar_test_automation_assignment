# Front-End Automation Assignment

This project is an automation framework designed to test subscription prices for STC TV's subscription plans across different countries using Selenium WebDriver, TestNG, and Maven.

## Frameworks & Technologies Used:
- **Selenium WebDriver**: For browser automation and web scraping.
- **TestNG**: Testing framework for structuring and executing test cases.
- **Maven**: Build automation tool for managing dependencies and running tests.
- **WebDriverManager**: For managing browser drivers automatically.
- **SLF4J (NOP)**: To suppress logging warnings.
- **Java**: Core programming language.

## Objectives Achieved:
1. **Price Validation for Different Countries**: The automation suite validates the subscription prices for three packages (`Lite`, `Classic`, `Premium`) across Saudi Arabia, Kuwait, and Bahrain.
2. **Reusable Components**: The project follows best practices with reusable `SubscriptionPage` class methods for navigating and extracting prices from the web pages.
3. **Screenshot Capture**: The framework captures a screenshot after each test run, stored in a dedicated `screenshots` directory.
4. **Implicit Waits and Error Handling**: The project uses implicit waits and handles exceptions for better stability during web scraping.

## Prerequisites:
- **JDK 1.8 or higher**
- **Maven** (Ensure Maven is installed and configured)
- **Chrome Browser** (Latest version)

## How to Run the Project:

1. **Clone the Repository**:
`https://github.com/MuzammilThebo/apar_test_automation_assignment.git`

2. **Update Browser Driver**:
The WebDriverManager will automatically manage the correct ChromeDriver version for you.

3. **Run Tests via Maven**:
To clean and execute tests:
`mvn clean test`

4. **View Test Results**:
Test results will be shown in the console. Screenshots are saved in the `./screenshots/` directory.

## Directory Structure:

```src/ |-- main/ | |-- java/ | |-- base/ # Base test class setup and teardown | |-- pages/ # Page classes containing web element locators and methods | -- utils/ # Utility functions for common operations like taking screenshots |-- test/ |-- java/ -- tests/ # Test classes containing actual test cases```


## Best Practices Followed:
- **Page Object Model (POM)**: For better maintainability, the project follows POM by separating page interactions in `SubscriptionPage.java`.
- **Maven Lifecycle**: The project leverages Maven for dependency management and test execution.
- **Headless Browser Option**: For faster test execution, the Chrome browser can run in headless mode by uncommenting the headless configuration.

#

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


