#Author
#Date
#Description
@SmokeRegression
Feature: feature to test login functionality

@SmokeTest

  Scenario: check login is successful with valid credential
    Given user is on login page
    When user enters username and password
    And user clicks on login button
    Then user is navigated to home page
