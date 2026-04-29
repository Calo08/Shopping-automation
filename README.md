Automation Project - 
Demo Web Shop
📌 Overview:


-This project is an automated test framework built using:
Selenium WebDriver
Java
Cucumber (BDD)
JUnit
Maven


-It automates the end-to-end checkout process on:
https://demowebshop.tricentis.com
---
✅ Test Scenario Covered:

Login to application
Navigate to Computers → Desktops
Select "Build your own cheap computer"
Add to cart
Accept Terms & Conditions and Checkout
Enter Billing & Shipping details
Select Payment Method (Cash on Delivery)
Confirm Order
Capture Order Number
---

🛠️ Project Structure
```
src
 ├── main/java
 │    └── base
 │         └── BaseClass.java
 ├── test/java
 │    ├── runner
 │    │     └── TestRunner.java
 │    └── stepdefinitions
 │          └── StepDefinitions.java
 └── test/resources
      └── features
            └── shopping.feature
```
---
🚀 Get Started
1. Prerequisites
Java JDK 11 or higher
Maven installed
IntelliJ IDEA (recommended)
Chrome browser
---
2. Setup Instructions
Download and unzip the project
Open IntelliJ IDEA
Select Open Project
Choose the extracted folder
Wait for Maven dependencies to download
---
3. Run the Tests
Navigate to:
```
   src/test/java/runner/TestRunner.java
   ```
Right-click → Run TestRunner
---
4. View Reports
After execution, open:
```
target/report.html
```
---
⚠️ Notes
Ensure internet connection is available
Update credentials in Step Definitions if needed
ChromeDriver is managed automatically via WebDriverManager
---
💡 Future Enhancements
Implement full Page Object Model (POM)
Add explicit waits (WebDriverWait)
Integrate Allure reporting
Add screenshot capture on failure
Parameterize test data
---
👨‍💻 Author
Calvin De Villiers
