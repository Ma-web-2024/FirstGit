Feature: Login
Scenario: Successful login with valid credentials 
Given user is on log page
When user enters username and password
And click on login button
Then user is navigated to the home page