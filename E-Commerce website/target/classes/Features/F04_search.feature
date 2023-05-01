Feature: Search function
  @smoke
  Scenario Outline:user could search using product name
    Given user navigate to to the search bar
    And user enter "<Example1>" on search and click search button
    Then the product search "<Example1>" will appear
    Examples:
    | Example1|
    | book    |
    |laptop   |
    |nike     |

  Scenario Outline:user could search for product using sku
    Given user navigate to to the search bar
    And user enter "<Example2>" in search sku and click search button
    Then the product search sku "<Example2>" will appear
    Examples:
      |Example2|
      |SCI_FAITH|
      |APPLE_CAM|
      |SF_PRO_11|
