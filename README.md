<<<<<<< HEAD

=======
# PageObjectModel-TestNG-Project

Welcome to the **PageObjectModel-TestNG-Project**!

This project leverages the Page Object Model (POM) and Page Factory design patterns to create a maintainable and scalable test automation framework using Selenium WebDriver and TestNG.

---

## Table of Contents

1. [Overview](#overview)
2. [Project Structure](#project-structure)
3. [Dependencies](#dependencies)
4. [Key Features](#key-features)
5. [Steps to Clone and Run the Project](#steps-to-clone-and-run-the-project)
6. [License](#license)

---

## Overview

The **Page Object Model (POM)** and **Page Factory** are design patterns used in Selenium WebDriver for creating maintainable and scalable test automation frameworks.

- **Page Object Model (POM)**: POM encourages the creation of classes that represent web pages, where each class contains methods to interact with the page elements. This makes it easier to maintain and update tests since UI changes will only require changes in the page object classes and not the test scripts themselves.
- **Page Factory**: Page Factory is a feature in Selenium that simplifies the initialization of page objects by using annotations such as `@FindBy`. It helps make code cleaner and more efficient by automatically locating elements.

This project uses both **POM** and **Page Factory** to create a well-structured, reusable, and maintainable test automation framework.

---
```plaintext
## Project Structure

src/
├── main/
└── test/
    ├── java/
    │   ├── base/
    │   │   └── TestBase.java               # WebDriver setup and common utilities
    │   ├── commonUtils/
    │   │   └── ConfigLoader.java            # Loads config.properties file for configuration
    │   ├── pages/
    │   │   ├── ArticleEditPage.java         # Page Object for article edit page (Project 2)
    │   │   ├── ArticleHomePage.java         # Page Object for article home page (Project 2)
    │   │   ├── ArticleInfoPage.java         # Page Object for article info page (Project 2)
    │   │   ├── ArticleLoginPage.java        # Page Object for article login page (Project 2)
    │   │   ├── ShopCartPage.java            # Page Object for shop cart page (Project 1)
    │   │   ├── ShopCheckOutPage.java        # Page Object for shop checkout page (Project 1)
    │   │   ├── ShopLoginPage.java           # Page Object for shop login page (Project 1)
    │   │   └── ShopProductListPage.java     # Page Object for shop product list page (Project 1)
    │   ├── tests/
    │   │   ├── ArticleTest.java             # Test case for Conduit article app (Project 2)
    │   │   ├── ArticleTest_DataRepo.java    # Data repository test for Conduit app (Project 2)
    │   │   └── ShopAppTest.java             # Test case for Saucedemo Shop app (Project 1)
    ├── configFiles/
    │   └── config.properties                # Configuration file for test variables
    ├── resources/
    └── pom.xml                              # Maven dependencies and configuration
```
---

## Dependencies

The project uses Maven for managing dependencies. The required libraries for Selenium WebDriver, TestNG, and other essential dependencies are specified in the pom.xml file.
```
<dependency>
    <groupId>org.testng</groupId>
    <artifactId>testng</artifactId>
    <version>7.4.0</version>
    <scope>test</scope>
</dependency>
```
---

## Key Features

TestBase.java: This class is responsible for setting up and tearing down the WebDriver instance. It ensures that the browser is initialized before each test and properly closed after the test execution. It also provides other common utility methods used across multiple tests.

ConfigLoader.java: This class is located in the commonUtils folder. It loads configuration values from the config.properties file, which contains essential test data such as URLs, credentials, and other variables.


---

## Page Objects

The pages folder contains the following classes, each representing a page in the application:

ArticleEditPage.java: Represents the article edit page for the Conduit app (Project 2).

ArticleHomePage.java: Represents the article home page for the Conduit app (Project 2).

ArticleInfoPage.java: Represents the article info page for the Conduit app (Project 2).

ArticleLoginPage.java: Represents the login page for the Conduit app (Project 2).

ShopCartPage.java: Represents the shopping cart page for the Saucedemo Shop app (Project 1).

ShopCheckOutPage.java: Represents the checkout page for the Saucedemo Shop app (Project 1).

ShopLoginPage.java: Represents the login page for the Saucedemo Shop app (Project 1).

ShopProductListPage.java: Represents the product list page for the Saucedemo Shop app (Project 1).

---

## Test Scripts

ArticleTest.java: Contains test cases for automating user interactions with the Conduit article creation and publishing app.

ArticleTest_DataRepo.java: A data repository test for managing data in the Conduit app.

ShopAppTest.java: Contains test cases for automating user interactions on the Saucedemo Shop app.

---

## Configuration

The config.properties file under the src/test/configFiles folder contains necessary test variables (e.g., URLs, credentials, etc.). The ConfigLoader.java class is responsible for loading these values into the test scripts.

Steps to Clone and Run the Project

1. Clone the Repository
To clone the repository, use the following command:
```
git clone <repository-url>
```
2. Navigate to the Project Directory
After cloning the repository, navigate to the project directory:
```
cd <project-directory>
```
3. Add TestNG Dependency (if needed)
Ensure that TestNG is included as a dependency in the pom.xml file. If it is not already present, add the following dependency:
```
<dependency>
    <groupId>org.testng</groupId>
    <artifactId>testng</artifactId>
    <version>7.4.0</version>
    <scope>test</scope>
</dependency>
```
4. Configure config.properties
Make sure the config.properties file is correctly set up. This file is located in the src/test/configFiles folder and contains test-specific variables like URLs and credentials.

Example config.properties:
1. Saucedemo Shop App Configuration
```
    baseURL=https://www.saucedemo.com
    username=standard_user
    password=secret_sauce
```
2.  Conduit Article App Configuration
```
    articleBaseURL=https://conduit.example.com
    articleUsername=testuser
    articlePassword=securepassword
```
5. Run the Tests
To run the tests, execute the following Maven command:
```
mvn test
```
This will run all the test scripts located in the tests folder. After execution, TestNG will generate a report in the test-output directory.

6. View Test Reports
Once the tests complete, you can view the results in the test-output folder. TestNG generates an HTML report that can be opened in a web browser.


---

## License

This project is licensed under all rights reserved to the owner. No part of this repository may be reproduced or distributed without permission.


---

## Additional Info
This framework is designed to ensure that your Selenium WebDriver tests remain clean, maintainable, and easy to scale. By using the Page Object Model and Page Factory design patterns, the test scripts are more modular, and any changes to the UI can be handled with minimal impact on the tests themselves.
>>>>>>> refs/heads/develop
