Feature: In order to save money
As a bank client
I want to make a deposit in my account

  Background:
    Given an existing client named "sla" with 0.0 EUR in her account
     
  Scenario Outline: Deposit money into account
    When she deposits <action> amount <amount> EUR into her account
    Then the new balance will <result> and it become<balance> EUR

  Examples:
 |  action     |  amount     | result          | balance|
 |  positive   |  10.0       | be incremented  | 10.0  |
 |  negative   | -10.0       | remain          | 10.0  |
    