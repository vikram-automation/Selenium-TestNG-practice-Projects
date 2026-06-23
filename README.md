# TestNG Automation Practice Projects

This repository contains basic Selenium Automation framework concepts implemented using **TestNG**. It includes structural execution, assertions, and annotations practiced across multiple real-world web applications.

---

## 🚀 Projects & Applications Covered

The project includes test automation suites for the following popular platforms located under `src/test/java/com/basic/projects`:

* **Amazon Test (`AmazonTest.java`)**: Focuses on e-commerce flows, product searches, and page title validations.
* **Netflix Test (`NetflixTest.java`)**: Implements basic UI validations and landing page element verifications.
* **Twitter Test (`TwitterTest.java`)**: Handles login validations and basic feed interactions.
* **YouTube Test (`YouTubeTest.java`)**: Automates video search functionalities and player page verifications.
---
## 🛠️ Features Implemented
* **Assertions**: Hard and soft assertions to validate page URLs, titles, and element visibility.
* **Clean Architecture**: Segregated test classes for better readability and maintenance.
---
## ⚙️ Tech Stack & Prerequisites

* **Language**: Java 11 / 17
* **Automation Tool**: Selenium WebDriver
* **Testing Framework**: TestNG
* **Build Tool**: Maven
---
## 🏃 How to Run the Tests

1. Clone this repository to your local system.
2. Open the project in **IntelliJ IDEA** or **Eclipse**.
3. Right-click on any test class (e.g., `AmazonTest.java`) and select **Run**.
4. Alternatively, execute via Maven using the terminal:
   ```bash
   mvn test
