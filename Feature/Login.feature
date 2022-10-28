 
Feature: Login
@Sanity   
Scenario: Successful Login With Valid Credentials
  Given User Launch Chrome Browser
  When User opens URL "https://admin-demo.nopcommerce.com/login"   
  And User enters Email as "admin@yourstore.com" and password as "admin" 
  And user click on login
  Then user on page have Title "Dashboard / nopCommerce administration"
  When user click on logout
  Then user on page have Title "Your store. Login"
  And User close the broser
  
Scenario Outline: Successful Login With Credentials 
  Given User Launch Chrome Browser
  When User opens URL "https://admin-demo.nopcommerce.com/login"   
  And User enters Email as "<email>" and password as "<password>" 
  And user click on login
  Then user on page have Title "Dashboard / nopCommerce administration"
  When user click on logout
  Then user on page have Title "Your store. Login"
  And User close the broser
 
Examples:
|email|password|  
|admin@yourstore.com|jaywant|
|jaywant@yourstore.com|admin|
|test@yourstore.com|jaywant|
