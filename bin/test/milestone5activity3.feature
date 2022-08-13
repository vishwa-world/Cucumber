# Feature: Register Action

# @M5A3
#   Scenario Outline: Register multiple users on Qkart
#     Given user is on Register page
#     When user enters "<username>" and "<password>" and "<confirmPassword>"
#     And user clicks on Register button
#     Then successfully Registered Message is displayed
#     Examples:
#       | username   | password        | confirmPassword  |
#       | admin2     | admin2@pass     | admin2@pass      |
#       | testuser01 | testuser01@pass | testuser01@pass  |
#       | testuser02 | testuser02@pass | testuser02@pass  |
