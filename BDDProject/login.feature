Feature:  login validation

Scenario:  valid credential

Given open browser
And navigate to url
When user type userId in Text box
And user type password ind text box
And uder click on login button

Then user should land his profile page

Scenario:  Invalid credential

Given open browser
And navigate to url
When user type <"userId"> in Text box
And user type  <"password"> ind text box
And uder click on login button

Then user should not land his profile page

Examples:
|useId|password|
|user1|Ysek|
|user2|hfase|















