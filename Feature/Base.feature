Feature: Base

  Scenario: Login the application

    Given I enter valid ID
    When I click submit button
    Then I verify the home page
    And I verify the validity


