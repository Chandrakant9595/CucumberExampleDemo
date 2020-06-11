Feature: TaggedHooks example 

Scenario: Dog
Given given step dog
When when step dog
Then then step dog

@Cat
Scenario: Cat
Given given step cat
When when step cat
Then then step cat


Scenario Outline:: Monkey
Given given step monkey
When when step monkey
Then then step monkey
Examples:
| fName | lName |
| PQR   | PPP   |
| MNO   | MMM   |

