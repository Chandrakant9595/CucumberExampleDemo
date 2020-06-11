@FunctionalTest
Feature: Amazon functional test

@RegressionTest
Scenario: User is on Amazon home page
Given Validate the amazon home page

@SmokeTest @RegressionTest
Scenario: Login with username and password
Given Validate the login functionality

@SmokeTest @RegressionTest
Scenario: Search a product TV
Given Validate the search functionality

@RegressionTest
Scenario: Add TV in to card
Given Validate the add to cart functionality

@SmokeTest 
Scenario: User is on checkout page
Given Validate the checkout page is opened

@SmokeTest @RegressionTest
Scenario: Checkout with CARD
Given Validate the checkout functionality with CARD option

@SmokeTest 
Scenario: Checkout with UPI
Given Validate the checkout functionality with UPI option

@RegressionTest
Scenario: Checkout with COD
Given Validate the checkout functionality with COD option

@EndToEnds
Scenario: Download recipt
Given Validate the download recipt functioanlity

@SmokeTest @RegressionTest
Scenario: Logout user
Given Validate the logout functionality
