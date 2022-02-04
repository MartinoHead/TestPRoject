# new feature
# Tags: optional

Feature: Check login functionality

  @smoke
  Scenario Outline: A scenario
    Given The user is on login page
    When The user enters <username> and <password>
    And The user click on login button
    Then The user is navigated to home page

    Examples:
    |username|password|
    |username|password|

  Scenario Outline: A scenario
    Given The user is on login page
    When The user enters <username> and <password>
    And The user click on login button
    Then The user is navigated to home page

    Examples:
      |username|password|
      |username|password|
