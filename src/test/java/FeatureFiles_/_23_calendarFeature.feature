Feature: Calendar Features

  Background: Login
    Given Navigate to Campus
    When Enter valid username and password and click login button
    Then User should login successfully

    Scenario: Calendar Features
      Given the student should be able to click calendar button
      When The student should be able to see the default date of today and the weekly course plan on the Calendar page
      Then The student should be able to view the status of scheduled courses

