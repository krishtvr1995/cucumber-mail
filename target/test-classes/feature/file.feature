@a
Feature: to validate loin functionallty of facebook app
Scenario: to validate loin of user by inalidate username and invalidate passsword

Given The user should launch the chrome browser
When The user should type the url
And The user should maxmize the window
And The user should type invalid username and invalid password
|mani|mani@123|kumar|kumar@123|
|aaaa|bbbni@123|cccc|cccc@123|
And The user should click the login button
And The user should get te title of the incorrect credential page
Then The user should naviage to incorrect credential page



