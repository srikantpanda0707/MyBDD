Feature: Starter


  Scenario: Creating New Telecom Customer

    Given I click telecom project
    And I click Add customer option
    When I verify the add customer page displays
    Then I add a new customer in telecom page
    And I Verify the added customer listing in the pay billing page

