Feature: Feature to Test Login Functionality

  Scenario: Check Login is Successful with valid login Credentials
    Given user is on Login page
    When user enters valid username and password
    And Clicks Login button
    Then User navigates to Homepage
