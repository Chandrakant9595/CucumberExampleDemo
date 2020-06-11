Feature: Facebook login feature.
Scenario Outline: Facebook login scenario

Given User On Facebook Page
When Verify Facebook Title And URL
Then Enter "<UserName>" And "<Password>"
Then Click On Login Button
Then Close The Browser

Examples:
	| UserName | Password |
	| ABC	   | test123  |
	| XYZ      | test456  |	