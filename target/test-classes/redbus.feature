Feature: To validate the login functionality of redbus 

Background:
Given To launch the browser and maximise the window


Scenario: To validate the login in redbus

When To launch the url of redbus
And To click the login logo
And To click the signin option
And To enter the mobileno


Scenario Outline: User has to login to connect facebook
When To launch the url of redbus
And To click the login logo
And To click the signin option1
And To click the facebook option
And To pass the email in "<emaildatas>" email field
And To pass the password in "<passworddatas>" password field
And To click the login button
Then To close to the browser

Examples:
|emaildatas         |passworddatas|
|vinoth123@gmail.com|12345678     |