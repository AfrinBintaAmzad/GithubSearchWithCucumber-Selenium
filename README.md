# GithubSearchWithCucumber-Selenium

## Tools USed in This Project:
- IntellIj IDEA
- Selenium Framework (automated testing framework)
- Cucumber (BDD Tool)

## Language Used:
- Java

## Project Senarion:
Create a project with browser-based tests for the following acceptance criteria for github.com. You must use "Cucumber Framework".

1. As a guest (not logged in), when searching GitHub for the term "create-react-app" from the landing page search input, you will see: A count of matching results
2. You will find and verify "facebook/create-react-app " project as the first result
3. As a guest, when clicking the "About" button in the landing page footer, you will be taken to the GitHub "About" page. verify, you are on about page

The following terms should be passed from the Example,
1. create-react-app
2. facebook/create-create-app

## How to run this project:
- Clone this project Web-Automation-with-Selenium_Cucumber
- hit the following command:
mvn clean test / mvn clean install

## How to Generate Report:
<build>
      <plugins>
          <plugin>
              <groupId>net.masterthought</groupId>
              <artifactId>maven-cucumber-reporting</artifactId>
              <version>5.3.0</version>
              <executions>
                  <execution>
                      <id>execution</id>
                      <phase>verify</phase>
                      <goals>
                          <goal>generate</goal>
                      </goals>
                      <configuration>
                          <projectName>Sample-Cucumber-Report</projectName>
                          <skip>false</skip>
                          <outputDirectory>reports/html-reports</outputDirectory>
                          <inputDirectory>target/cucumber-reports</inputDirectory>
                          <jsonFiles>
                              <param>**/*.json</param>
                          </jsonFiles>
                      </configuration>
                  </execution>
              </executions>
          </plugin>
      </plugins>
  </build>
  
  
  ## Pre-rquisite:
  - Some maven dependency is must for run this project These are:
  <!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java -->
       <dependency>
           <groupId>org.seleniumhq.selenium</groupId>
           <artifactId>selenium-java</artifactId>
           <version>4.5.0</version>
       </dependency>
       
       <!-- https://mvnrepository.com/artifact/io.cucumber/cucumber-java -->
       <dependency>
           <groupId>io.cucumber</groupId>
           <artifactId>cucumber-java</artifactId>
           <version>7.5.0</version>
       </dependency>
          <!-- https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager -->
        <dependency>
            <groupId>io.github.bonigarcia</groupId>
            <artifactId>webdrivermanager</artifactId>
            <version>5.3.0</version>
        </dependency>
         <dependency>
            <groupId>io.cucumber</groupId>
            <artifactId>cucumber-junit</artifactId>
            <version>7.3.4</version>
            <scope>test</scope>
        </dependency>
        
        
 ## Report Result:
        
![Cucumber Report Result](https://user-images.githubusercontent.com/83439797/224552342-812af63c-e997-4f33-b949-0fb5052deb44.PNG)
