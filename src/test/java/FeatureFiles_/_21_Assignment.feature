Feature: Assignment Submit

  Background: Login
    Given Navigate to Campus
    When Enter valid username and password and click login button
    Then User should login successfully

    Scenario: upload assignment
      Given Go to the Assignment HomePage
      When Student should be able to click on the submit icon
      And Student should be able to access text editor and write a text
      Then Student should be able to create a picture or table
      And Student should be able to attach a file
      And The student should be able to record his changes as a draft




