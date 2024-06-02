Feature: Login Functionality


  Scenario: Login with valid username and password

    Given Navigate to Campus
    When Enter valid username and password and click login button
    Then User should login successfully

  Scenario: Login with invalid username and password

    Given Navigate to Campus
    When Enter invalid username and password and click login button
    Then User should not login successfully





