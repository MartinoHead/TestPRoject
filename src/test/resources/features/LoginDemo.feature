# new feature
# Tags: optional

Feature: Test Login

  Scenario Outline: Check if login is successful with valid credentials
#    Given Open browser
#    When The user is on login page
#    When The user enters <username> and <password>
#    When The user click on login button
#    Then The user is navigated to home page
#
#    Examples:
#      | username | password |
#      | Marto    | 12345    |


#    When The user is on login page_POM
#    When The user enters <username> and <password> _POM
#    When The user click on login button_POM
#    Then The user is navigated to home page_POM
#
#    Examples:
#      | username | password |
#      | Marto    | 12345    |

    When The user is on login page_PF
    When The user enters <username> and <password> _PF
    When The user click on login button_PF
    Then The user is navigated to home page_PF

    Examples:
      | username | password |
      | Marto    | 12345    |