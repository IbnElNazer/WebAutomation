Feature: Login Action
  Scenario: Successful job search

    Given User is on Home page
    When User Navigate to Careers Page
    And User enters job name
    Then Jobs available are displayed Successfully