Feature: Assignments Searching


  Background: Login
    Given Navigate to Campus
    When Enter valid username and password and click login button
    Then User should login successfully


  Scenario: Searching for Assignments in the Campus Student System
    Given student Go to the Assignment HomePage
    Given The Student should be able to see and click the search button
    When Listing of tasks when default search is completed
    And the student should be able to search assignment by filtering
    And Search and verify assignments using the date button
    And Search and verify assignments using the sorting menu
