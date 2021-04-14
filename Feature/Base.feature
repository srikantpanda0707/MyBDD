Feature: MyBDD

  Scenario: Login the application
    Given I launch the browser
    When I get the url
    Then I verify the home page
    And I close the browser