Feature: In order to retrieve some or all of my savings
         As a bank client
         I want to make a withdrawal from my account

   Scenario: An existing client withdraws from his account
       Given an existing client named "SLA" with 100.0 EUR in his account
       When he withdraws 10.0 EUR from his account
       Then the new balance is 90.0 EUR
       
   Scenario: An existing client withdraws from his account
       Given an existing client named "SLA" with 100.0 EUR in his account
       When he withdraws 100.0 EUR from his account
       Then the new balance is 0.0 EUR
       
   Scenario: An existing client withdraws from his account
       Given an existing client named "SLA" with 100.0 EUR in his account
       When he withdraws 110.0 EUR from his account
       Then the new balance is 100.0 EUR    