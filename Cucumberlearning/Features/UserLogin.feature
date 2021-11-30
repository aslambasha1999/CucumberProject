Feature: Checking user Login Functionality

	@Smoke
  Scenario Outline: User will enter valid username and password and validating HomePage
    Given Open the Chrome Browser
    When Launch the Application
    And Enter the <username> and <password>
    And Click Login button
    Then user should be naviaget to homepage

    Examples: 
      | username | password |
      | aslam    |    12345 |
      | jana     |     1234 |
      | yashu    |    12345 |
