Feature: WorkTypeGroup in Sales force
Scenario: Create Work type Group

    Given Login to salesforce
    And Click on AppLauncher
    And Click View All 
    And Click Work Type Groups
    And Click on New button
    And Enter Work Type Group Name as 'Salesforce Automation by Avila'
    And Click save and 
    Then Verify Work Type Group Name
    
