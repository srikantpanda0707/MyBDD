Feature: Base

  Background:
    Given I verify selenium easy page opens
    When I click demo home button selenium easy page
    Then I verify the home demo page displays
    And I click start practice

  @TC01
  Scenario: User created a sample form demo
    Given I clicked the sample form demo option
    When I enter Valid Message In the simple input text box
    Then  I verify the entered message displays
    When I Enter Two input details
    Then I verify the added details displays
    And I click demo home button selenium easy page
    And I verify the home demo page displays

  @TC02
  Scenario: User Able To check and Uncheck the check Boxes
    Given I click the check box option
    When I click the check box and verify in check box option
    Then I click demo home button selenium easy page
    And I verify the home demo page displays

  @TC03
  Scenario: User is able to click radio button demo page
    Given I click the radio button demo option
    When I check radio button demo and verify
    Then I check group radio button and verify
    And I verify selenium easy page opens

  @TC04
  Scenario: User is able to select value from dropdown
    Given I click drop down demo option
    When I Select a day from the dropdown and verify
    Then I check group dropdown selected
    And I verify selenium easy page opens

  @TC05
  Scenario: User is able to accept or dismiss JS alert
    Given I click the js alert option
    When I Accept and dismiss the alert
    Then I enter value and accept alert and verify the text displays
    And I enter value and dismiss alert and verify text not displays

  @TC06
  Scenario: User able to handle window pop
    Given I click the Window popup modal option
    When I click the twiter pop and verify the window