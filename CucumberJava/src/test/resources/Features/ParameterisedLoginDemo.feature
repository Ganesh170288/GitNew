Feature: Test login functionality

  Scenario Outline: Check login with valid credential
    Given user opens the browser
    And user will enter url
    When user enters <username> and <password>
    And user clicks on login button
    Then page is navigated to home page

    Examples: 
      | username | password |
      | ganesh   |    12345 |
      | appu     |    12345 |
