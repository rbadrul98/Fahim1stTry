@BlackrockTesting 
Feature: User able to Login orangehrm site 
Scenario: User succesfully Login to orange hrm 
	Given User visit orangehrm page 
	When User type Username 
	And User also type Password 
	Then User click on the Login button 
	And User verify Welcome screen