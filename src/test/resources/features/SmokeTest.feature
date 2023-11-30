Feature: This feature is Smoke Test

  @smoke
  Scenario: smoke test
  Given I print Hello world
    Then  everybody is happy

    @regression
    Scenario: This is for Cucumber test
      Given I run cucumber test
      Then verify it is Cucumber