Feature: Login
  As a user I would like to login to the webpage


  Scenario: Valid Login
    Given That I navigate to the giftrete website
    When I click on login
    And I enter the email address
    And I enter the password
    And I click on the login button
    Then I should be logged in

  Scenario: login with invalid email
    Given That I navigate to the giftrete website
    When I click on login
    And I enter the invalid email address
    And I enter the password
    And I click on the login button
    Then I should be logged in



  Scenario: login with invalid password
    Given That I navigate to the giftrete website
    When I click on login
    And I enter the invalid email address
    And I enter the invalid password
    And I click on the login button
    Then I should be logged in
