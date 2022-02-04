Feature: Check home page functionality

  Background: The user is logged in
    Given The user is logged in
    When The user enters username and password
    And The user click on login button
    Then The user is navigated to home page

  Scenario:Check logout link
    When The user click on welcome link
    Then The logout link is displayed

    Scenario: Verify quick launch toolbar is present
      When The user clicks on dashboard link
      Then The quick launch toolbar is displayed