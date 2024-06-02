Feature: Hamburger Menu

  Background:
    Given Navigate to Campus
    When Enter valid username and password and click login button

    Scenario: Check the Hamburger Menu's Elements
      Then Checking new message, inbox, outbox and trash
