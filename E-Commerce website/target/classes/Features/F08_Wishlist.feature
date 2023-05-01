Feature: wishlist functionality
  Scenario: the user clicks on heart for a product and a green message is displayed
    Given user clicks on heart
    Then success green message is displayed


  Scenario: wishlist number is updated
    Given user clicks on heart
    And user clicks on wishlist
    Then quantity is more than one