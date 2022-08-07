Feature: To test User Registration

@valid
 Scenario: verify User Registration page
   Given user is on Register Page
   When user enters credentials and clicks on Register button
     | UserName   | Password       | Confirm_Password |
     | Qkart_User | QkartUser@pass | QkartUser@pass   |
   Then Successfully Registered Message is displayed
