Feature: LogIn Action Test
Scenario: Successful LogIn with Valid Credentials
Given User is on Home Page
When User enters UserName and Password 
And click on submit button
Then User logged in Successfully