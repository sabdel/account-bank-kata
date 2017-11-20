Feature: Create account
  As a client
  I want to create my account
  In order to manage my money and payments

  Scenario: Create an account with balance 20.0
    Given an existing client named "diego"
    When he opens a bank account
    Then the initial balance is 20.0 EUR
