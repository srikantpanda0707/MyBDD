Feature: Base

  @Smoke
  Scenario: Login the application

    Given I enter valid ID
    When I click submit button
    Then I verify the home page
    And I verify the validity


  Scenario: Verify Mini Statement Of Customer

    Given I enter valid ID
    When I click submit button
    Then I verify the home page
    And I click mini statement tab
    Then I select the statement number from the document
    And I click submit button in mini statement form window
    And Verify the statement displays
    And I click log out button

  Scenario: Verify Home page after mini Statement Of Customer

    Given I enter valid ID
    When I click submit button
    Then I verify the home page
    And I click mini statement tab
    Then I select the statement number from the document
    And I click submit button in mini statement form window
    And Verify the statement displays
    Then I click continue button in statement window
    And I verify the home page
    And I click log out button