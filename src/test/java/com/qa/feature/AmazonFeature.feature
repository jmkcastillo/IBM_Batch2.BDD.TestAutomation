Feature: Validate amazon web application for its functonality

  Scenario: Validate search an item in amazon application
    Given The user is on amazon home page
    When The user selects Books category
    And The user types Da vinci code as search item
    When The magnifier button is clicked
    Then The title of page should be same as search term
    And The items related to search term should be loaded
    Then Close the browser

    