Feature: Search a word in Google

  Scenario: Search a word in Google
    Given the User wants to search something in the google page
    When he searches for "cars"
    Then the results are displayed