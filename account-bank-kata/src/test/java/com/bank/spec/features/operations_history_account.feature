Feature: In order to check my operations
         As a bank client
         I want to see the history (operation, date, amount, balance) of my operations

  
  
  Scenario: An existing client see the whole history of its operations 
    Given an existing client named "sla" 
    And  he opned his account on 2014-11-03 
    And  he deposited 100.0 EUR on 2015-11-03 
    And  he deposited 100.0 EUR on 2016-11-03
    And  he withdrew  150.0 EUR on 2017-11-03 
    When he wants to see the whole history
    Then he see the following operations :
    
    | operation  | date          |  amount  | balance  |
    | Credit     | 2014-11-03    |  20.0    |   20.0    |
    | Credit     | 2015-11-03    |  100.0   |   100.0  |
    | Credit     | 2016-11-03    |  100.0   |   200.0  |
    | Debit      | 2017-11-03    |  150.0   |   50.0   |
    
