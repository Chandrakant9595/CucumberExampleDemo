Feature: Digital bank features
Scenario: Add checking account

Given open  digital bank site
When verift site title and URL
Then enter username and password
| me9595455315@gmail.com | @C9595455315c |
Then click on sign in button
Then verify home page url
Then click on checking dropdown
Then click on new checking option
Then create checking account
| Vicky | 500 |
Then click on submit button
