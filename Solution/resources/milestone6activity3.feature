Feature: LogIn Action Test


 Scenario: LogIn with validCredentials
   Given User is Registered
   And User is on Home Page
   When user enters credentials
   Then user clicks on Login button
   And successfully Login Message is displayed


 @Search
 Scenario: Search a product and add the first product to the User basket
   Given User is Registered
   And User is on Home Page
   And user enters credentials
   And user clicks on Login button
   When user search for shoe
   And add the first result to the basket
   Then user basket should display with added item