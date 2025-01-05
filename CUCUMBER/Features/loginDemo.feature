Feature: Feature login to demo website

Scenario: Successful login to saucedemo 
Given chrome browser is open
And user is on saucedemo page
When user enters username as "performance_glitch_user" and password as "secret_sauce"
And clicks on login button
Then user is navigated to swag labs page
