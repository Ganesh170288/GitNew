Feature: Check Home Page functionality

  Background: User is logged in
    Given user is on login page
    When user now will make an entery on username and password fields
    And user will now operate the login button
    Then user is navigated to the HomePage

  Scenario: Check logout link
    When user clicks on welcom link
    Then Logout link is displayed

  Scenario: Verify quick launch toolbar is visible
    When user clicks on Dashboard link
    Then Quick Launch link is displayed
