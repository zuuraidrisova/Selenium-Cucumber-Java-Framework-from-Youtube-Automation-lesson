Feature: Google Search Functionality

  @search
  Scenario: Validate google search functionality is working

    Given User is on google search page
    And User enters a text in google search box
    And User hits Enter
    Then User is navigated to the search result page

