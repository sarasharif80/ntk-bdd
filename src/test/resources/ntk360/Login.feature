Feature: NTK Login feature

Scenario: Successful login with valid credentials
Given User is on NTK login page    
When User enters valid credentials 
And User clicks login button
Then User is on dashboard page

Scenario: Verify pending timesheet icon is displayed
Given User is on NTK login page    
When User enters valid credentials 
And User clicks login button
Then User is on dashboard page
And System displays the pending timesheet icon
 
 
Scenario: Verify pending leave request icon is displayed
Given User is on NTK login page    
When User enters valid credentials 
And User clicks login button
Then User is on dashboard page
And System displays the pending leave request icon


Scenario: Verify Scheduled Recruitment Event icon is displayed
Given User is on NTK login page    
When User enters valid credentials 
And User clicks login button
Then User is on dashboard page
And System displays the Scheduled Recruitment Event icon



#In cucumber to comment use ##### Control + Shift + ?   

####							 for mac COMMAND + ?










# Given is our Precondition
# When is the action performed by the user 
# And is (replacement of WHEN) the action perfromed by the user 















#Scenario: Successful logout
#Given User is on dashboard page
#When User logsout from the application
#Then User is redirected to sign-in page
