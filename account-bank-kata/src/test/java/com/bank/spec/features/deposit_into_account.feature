Feature: In order to save money
As a bank client
I want to make a deposit in my account

  
  Scenario: Deposit money into account
    Given an existing client named "sla" with 0.0 EUR in her account
    When she deposits 10.0 EUR into her account
    Then the new balance is 10.0 EUR

  Scenario: Try to deposit negative values
    Given an existing client named "sla" with 0.0 EUR in her account
    When she deposits -10.0 EUR into her account
    Then the new balance is 0.0 EUR