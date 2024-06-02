Feature: Main Menu Control

  Background:
    Given Navigate to Campus
    When Enter valid username and password and click login button

    Scenario: Top Nav Button Control

      Then user checks home page elements
      And See menu

