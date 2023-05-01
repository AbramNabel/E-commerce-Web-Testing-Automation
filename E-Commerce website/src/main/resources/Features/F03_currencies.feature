Feature: user select currency function
  Scenario: user could select a currency and is displayed across products
    Given user Select Euro currency from the dropdown list on the top left of home page
    Then Euro symbol is displayed across products of homepage
