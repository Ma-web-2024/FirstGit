Feature: Feature Multiple login to demo website

  Scenario Outline: Successful logins to saucedemo
    Given chrome browser is open
    And user is on saucedemo page
    When user enters <username> and <password>
    And clicks on login button
    Then user is navigated to swag labs page

    Examples: 
      | username                | password     |
      | standard_user           | secret_sauce |
      | performance_glitch_user | secret_sauce |
