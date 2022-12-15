Feature: FaceBook

Scenario: Facebook User Login

Given user Launch The Application Url
When user Get Text From The Home Page
And user Enter The Username
And user Enter The Password
And user Click The Login 
Then user Back To The Home Page

Scenario: Facebook SiignUp Page

When user Click The Create Account Botton
And use Enter The First Name
And user Enter The Sure Name
And user Enther The Email Id 
And user Enter Comfrim The Email Id
And user Enter The Pass
And user Select The Date
And user Select Teh Month
And user Select The Year
And user Select The Sex
Then user Click The SignUp Botton