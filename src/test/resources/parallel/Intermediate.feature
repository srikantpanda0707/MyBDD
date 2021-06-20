Feature: Intermediate

  Background:
    Given I verify selenium easy page opens
    When I click demo home button selenium easy page
    Then I verify the home demo page displays
    And I click start practice


  @TC09
  Scenario: User able to fill the input form
    Given I click the input form option from input form drop down
    When  I Enter valid input form and verify the status
    Then I Verify the form sent
    And I verify selenium easy page opens

  @TC10
  Scenario: User able to send AJAX loading message
    Given I click the Ajax form submit from input drop down
    When I Verify the mandatory field with empty text
    Then I enter valid input in ajax form and send request
    And I verify the ajax successful message