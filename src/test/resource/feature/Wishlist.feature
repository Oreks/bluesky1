Feature: As a user, I would like to access the wishlist


  Scenario: Access Wishlist
    Given That I navigate to the giftrete website
    When I click on Wishlist
    And I enter the valid email address
    And I enter the password
    And I click on the Secure sign in button
    Then I should be logged on the wishlist page

