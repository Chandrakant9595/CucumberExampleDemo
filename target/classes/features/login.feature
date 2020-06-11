Feature: Ninja login Feature
Scenario Outline: Ninja login test_scenario
 
Given user on login page
When title verify
Then click on MyAccount dropdown
Then click on login link
Then enter "<username>" and "<password>"
Then click on login button 

Examples:
	| username                | password |
	| me9595455315@gmail.com  | Test#123 |
	
