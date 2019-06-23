Feature: Is it friday yet

  Scenario: my scenario
    Given today is Sunday
    When I ask whether it's Friday yet
    Then I should be told "Nope"