# PageObjectModel-TestNG-Project

Welcome to the **PageObjectModel-TestNG-Project**, a maintainable and scalable test automation framework built using **Selenium WebDriver**, **TestNG**, and the **Page Object Model** design pattern with **Page Factory**.

## Table of Contents
1. [Overview](#overview)
2. [Project Structure](#project-structure)
3. [Technologies & Dependencies](#technologies--dependencies)
4. [Setup Instructions](#setup-instructions)
5. [Test Architecture](#test-architecture)
6. [Running Tests & Reports](#running-tests--reports)
7. [License](#license)

## Overview

This project demonstrates best practices for building Selenium test automation frameworks using **Page Object Model (POM)** and **Page Factory**:

- **POM**: Represents each page as a class, encapsulating interactions and reducing test maintenance.
- **Page Factory**: Uses `@FindBy` annotations for cleaner element initialization and improved code readability.

## Project Structure

```plaintext
src/
├── main/
├── test/
│   ├── java/
│   │   ├── base/                 # WebDriver setup and utilities
│   │   ├── commonUtils/         # Config loader
│   │   ├── pages/               # Page Object classes
│   │   └── tests/               # Test classes
│   ├── configFiles/             # config.properties file
│   └── resources/
pom.xml                          # Maven configuration
```

## Technologies & Dependencies

- **Java 8+**
- **Selenium WebDriver**
- **TestNG**
- **Maven**

Sample Maven dependency for TestNG:

```xml
<dependency>
  <groupId>org.testng</groupId>
  <artifactId>testng</artifactId>
  <version>7.4.0</version>
  <scope>test</scope>
</dependency>
```

## Setup Instructions

### 1. Clone the Repository
```bash
git clone <repository-url>
cd <project-directory>
```

### 2. Configure Properties
Edit `config.properties` under `src/test/configFiles/` with the appropriate test data:

```properties
# Saucedemo Shop App
baseURL=https://www.saucedemo.com
username=standard_user
password=secret_sauce

# Conduit Article App
articleBaseURL=https://conduit.example.com
articleUsername=testuser
articlePassword=securepassword
```

### 3. Run the Tests
Run the test suite using Maven:
```bash
mvn test
```

## Test Architecture

### 🧱 Base & Utility Classes
- `TestBase.java`: Initializes and tears down the WebDriver.
- `ConfigLoader.java`: Loads environment variables and config data.

### 📄 Page Objects (`pages/`)
Each class represents a webpage and contains methods to interact with it. Examples:
- `ShopLoginPage.java`
- `ShopProductListPage.java`
- `ArticleLoginPage.java`
- `ArticleEditPage.java`

> See all files in `src/test/java/pages/`.

### 🧪 Test Classes (`tests/`)
Contains automated test scripts:
- `ShopAppTest.java`: Tests for the Saucedemo shopping app.
- `ArticleTest.java`: Tests for the Conduit article app.

## Running Tests & Reports

After executing the tests via Maven, a report is generated automatically in the `test-output/` directory.

Open `test-output/index.html` in a browser to view the results.

## License

This project is **All Rights Reserved**. No part of this codebase may be reused or distributed without explicit permission from the owner.
