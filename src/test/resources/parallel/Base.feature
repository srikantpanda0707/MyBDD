Feature: Base

  Background:
    Given I verify selenium easy page opens
    When I click demo home button selenium easy page
    Then I verify the home demo page displays
    And I click start practice

    Scenario: User created a sample form demo
      Given I clicked the sample form demo option
      When I enter Valid Message In the simple input text box
      Then  I verify the entered message displays
      When I Enter Two input details
      Then I verify the added details displays
      And I click demo home button selenium easy page
      And I verify the home demo page displays
