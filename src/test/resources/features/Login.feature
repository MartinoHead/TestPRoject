# new feature
# Tags: optional
@SmokeFeature
Feature: Login test

  @SmokeTest
  Scenario: Login with valid credentials
    Given User is on login page
    When User enters username and password
    And User click on login button
    Then User is logged in

#  Scenario Outline: Login with valid credentials with parameters
#
#    Given User is on login page
#    When User enters <username> and <password>
#    And User click on login button
#    Then User is logged in
#
#    Examples:
#      | username | password |
#      | usr      | pass     |