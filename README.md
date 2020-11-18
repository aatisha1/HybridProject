# Hybrid Testing Automation Framework
This is a project that uses hybrid testing automation framework for testing a website. Here, different classes are stored in separate packages according to their functioning. Test automation framework is an execution environment for automated tests. It is the overall system in which our tests will be automated.I have done the testing of a demo website http://demo.guru99.com/ using hybrid testing automation framework. 
In this approach, the attempt is to build a lot of applications independent reusable keyword components so that they can directly used for another web application without spending any extra effort. With this framework in place, whenever we need to automate a web based application, we would not need to start from scratch, but use the application independent keyword components to the extent possible and create application specific components for the specific needs.
# Tools
* Eclipse
* Java
* TestNG
* pom.xml
* Selenium WebDriver
* Log4j
# Framework Structure
The framework consists of the following components:
* com.ResearchProj.PageObjects
  * AddCustomerPage.java
  * LoginPage.java
* com.ResearchProj.TestCases
  * BaseClass.java
  * TC_LoginTest_01.java
  * TC_LoginDDT_02.java
  * TC_AddCustomerPage_03.java
* com.ResearchProj.TestData
  * LoginData.xlsx
* com.ResearchProj.Utilities
  * ReadConfig.java
  * Reporting.java
  * XLUtils.java
* config.properties
# Drivers
# Screenshots
# Logs
# Test Output
* extent-config.xml
* log4j.properties
* pom.xml
* TestNG.xml
The test can be run through both pom.xml and TestNG.xml files.



