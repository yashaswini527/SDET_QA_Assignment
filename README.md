Automation Testing Framework for Longest Substring Problem

Project Overview**
This project is an automation testing framework built to test a website that calculates the Longest Unique Substring Without Repeating Characters.  
The framework follows the Page Object Model (POM) and is automated using Selenium WebDriver + TestNG.



Technology Stack
- Java (Programming Language)
- Selenium WebDriver (Web Automation)
- TestNG (Test Execution & Reporting)
- Maven (Dependency Management)
- Log4j (Logging)
- GitHub (Version Control)

---

Folder Structure

AutomationFramework 
├── src/ 
│ ├── main/java/ 
│ │ ├── baseTests/ → Base test class (BaseTestPage.java) 
│ │ ├── pages/ → Page Object Model classes (FirstPage.java, ResultsPage.java) 
│ │ ├── utils/ → Utility classes (ConfigReader.java, TestData.java) 
│ │ ├── resources/ → Config files (testdata.properties) 
│ ├── test/java/ 
│ │ ├── tests/ → Automated test cases (LongestSubstringTest.java) 
│ ├── resources/ → TestNG XML file (testfile.xml) 
│ ├── target/ → Compiled test reports 
├── Test cases/ 
│ ├── Automation test cases.md → Automated test cases documentation 
│ ├── Manual Test cases.md → Manual test cases documentation 
│ ├── pom.xml → Dependencies for Maven 
├── .gitignore → Git ignore file 
├── README.md → Explanation of framework


Test Scenarios Covered
Automated Test Cases
- Verify input field is present on the First Page
- Enter a string and validate the longest substring calculation
- Check for edge cases like empty input, single character input
- Ensure correct navigation between First Page and Results Page

Manual Test Cases
- UI validation (correct layout, button visibility)

- Verify input restrictions (e.g., numeric values, special characters)

- Check error messages for invalid inputs

Note : Remaining test cases are covered in Test cases folder