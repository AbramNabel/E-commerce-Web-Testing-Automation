Feature: users could open follow us links
  Scenario: user opens facebook link
    Given user click on facebook link
    Then facebook is opened in new tab

  Scenario: user opens twitter link
    Given user click on twitter link
    Then twitter is opened in new tab

  Scenario: user opens rss link
    Given user click on rss link
    Then rss is opened in new tab

  Scenario: user opens youtube link
    Given user click on youtube link
    Then youtube is opened in new tab