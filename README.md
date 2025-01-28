# Wafilie - Ecommerce Automation
This repository contains a web automation framework developed for the e-commerce website [WafiLife](https://www.wafilife.com/) using Playwright Java.

##  Key Features
   - **Page Object Model (POM):** Ensures code reusability and maintainability by organizing web elements and actions into structured classes.
   - **Page Chaining:** Optimizes the navigation flow between          application pages during testing for seamless execution.
   - **Data-Driven Testing:** Implements a data provider to efficiently test multiple login scenarios and other test cases with diverse data sets.
   - **Test Case Automation:** Automates critical workflows to enhance testing speed, reliability, and accuracy.

This framework is designed to provide a scalable and maintainable solution for automating test case execution and improving overall test coverage for the Wafilife platform.



## Prerequisites
 - Java JDK
 **Choose one of the following IDE:**

 - Eclipse

 - IntelliJ IDEA
    
 - Spring Tools
 - Apache Maven


## Setting Up Java JDK
 - Download the JDK installer from Oracle
  - Run the installer and select your installation folder.
 - Set up JAVA_HOME and PATH environment variables: - Open System Properties. - Navigate to Environment Variables. - Add JAVA_HOME with the JDK installation path. - Update the PATH variable to include %JAVA_HOME%\bin.
- Verify Java installation by running java --version in a terminal.
    
## Installing Apache Maven
- Check if you have Java installed by running java --version.
 - Download Apache Maven from the official website.
- Extract the archive to your desired location.
- Set up M2_HOME and MAVEN_HOME environment variables:
    
    - Create M2_HOME and point it to the Maven installation directory.
    - Update the PATH variable to include %M2_HOME%\bin.
5. Verify Maven installation by running mvn --version in a terminal.

## Built With
- Java JDK - Java Development Kit
- Eclipse
- Apache Maven - Dependency Management

**Maven Dependencies**
```bash
<dependencies>
		<!-- https://mvnrepository.com/artifact/com.microsoft.playwright/playwright -->
        <dependency>
            <groupId>com.microsoft.playwright</groupId>
            <artifactId>playwright</artifactId>
            <version>1.43.0</version>
        </dependency>

		<!-- https://mvnrepository.com/artifact/org.testng/testng -->
		<dependency>
			<groupId>org.testng</groupId>
			<artifactId>testng</artifactId>
			<version>7.8.0</version>
			<scope>test</scope>
		</dependency>
</dependencies>
