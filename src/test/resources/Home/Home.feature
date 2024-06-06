Feature:Home Page Functionality 
Scenario:verify the title of the page 
Given user should be on landing page
Then page should be contain "shopping"

Scenario:verify the cart icon 
Given user should be on landing page
Then cart icon should be displayed 

Scenario:verify checkout deals section 
Given user should be on landing page
When user clicks on fashion links 
Then page should be nevigate to the Home page 

Scenario:verify the login page 
Given user should be on landing page
When user enter the username "9850232989"
And user enter the password "Atul@123"
