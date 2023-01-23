# Feature: Tags in Cucumber

#   @ValidCredentials
#   Scenario: Login with valid credentials
#     Given User is Registered
#     And user is on Home page
#     When user enters validAdmin and validAdmin@pass
#     And user clicks on login button
#     Then successfully Login Message is displayed

#   @InValidCredentials
#   Scenario: Login with invalid credentials
#     Given User is Registered
#     And user is on Home page
#     When user enters invalidAdmin and invalidAdmin@pass
#     And user clicks on login button
#     Then username does not exist message should be displayed

#   @InValidCredentials @BlankCredentials
#   Scenario: Login with Blank credentials
#     Given User is Registered
#     And user is on Home page
#     When user enters " " and " "
#     And user clicks on login button
#     Then username is a required field message should be displayed
