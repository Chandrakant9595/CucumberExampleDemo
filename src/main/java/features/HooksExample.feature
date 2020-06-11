Feature: Hooks example of cucumber

Scenario: Test scenario one
Given given step one
When when step one
Then then step one

Scenario: Test scenario two
Given given step two
When when step two
Then then step two

Scenario Outline:: Test scenario three
Given given step three
When when step three
Then then step three
Examples:
| fName | lName |
| ABC   | AAA   |
| XYZ   | BBB   |

