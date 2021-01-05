
Feature: Feature to test Login functionality

  Background:
    Given User is on login page

  @login
  Scenario: check login is successful using valid credentials

    When User enters valid username and password
    And User clicks Enter button
    Then User is navigated to the home page


  @wip
  Scenario Outline: check login is successful using valid credentials

    When User enters valid "<username>" and "<password>"
    And User clicks Enter button
    Then User is navigated to the home page

    Examples:
    |username|password|
    |User1   | 12345  |
    |User2   | 12345  |