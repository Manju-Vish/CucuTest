Feature: Application Login

Scenario: Admin Page default login

Given User is on NetBanking landing page
When User login into application with "<username>" and password "<Password>"
Then Home page is displayed
And Cards are displayed

Examples:
	| username | Password |
	| Manj1         | 0234          |
	| Manj2         | pass2          |
	| Manj3         | pass3          |
	
Scenario: user  Page default sign up

Given User is on register page
When User signup application
|	Varun |
| Sharma |
| Varun.Sharma@gmail.com |
| 9999999999|
Then Home page is displayed
And Cards are displayed



