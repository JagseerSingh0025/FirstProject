Feature: Application Login


Scenario Outline: Login
Given username <username> and password <password>
When I log into page
Then Results should be <outUser> and <outPassword>
And Validate both matches or not


Examples:
|username|password|outUser	|outPassword|
|user1	|password1|user1	|password1|
|user2	|password2|user2	|password2|
|user3	|password3|user3	|password3|
|user4	|password4|user4	|password4|