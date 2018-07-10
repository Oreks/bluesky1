Feature: As a user. I want to be able to register

  Scenario: Valid registration
    Given I navigate to the giftrete site
    When I click on registration button
    And I enter first name
    And I enter last name
    And I enter a valid email
    And I enter valid password
    And I enter confirm password
    And I click on the sign up Button
    Then I should be able to registered



Scenario: Invalid registration
  Given I navigate to the giftrete site
  When I click on registration button
  And I enter first name
  And I enter last name
  And I enter an invalid email
  And I enter valid password
  And I enter confirm password
  And I click on the sign up Button
  Then I should be able to registered

