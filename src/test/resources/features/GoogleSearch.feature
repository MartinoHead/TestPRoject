# new feature
# Tags: optional

Feature: Google search test
@SmokeTest
  Scenario: Validate google search is working
    Given Open browser
    When The user is on google search page
    When The user accept google cookies
    When The user enter text on google search
    When The user press ENTER button
    Then The user is navigated to search results
