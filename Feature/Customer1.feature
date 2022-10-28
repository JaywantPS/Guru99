Feature: Customer1
@regression
Scenario: Add New Customer
  Given User Launch Chrome Browser
  When User opens URL "https://admin-demo.nopcommerce.com/login"   
  And User enters Email as "admin@yourstore.com" and password as "admin" 
  And user click on login
  Then user on page have Title "Dashboard / nopCommerce administration"
  When user click on Customer menu
  And click on customer menu Item
  And click on Add New button
  Then user can view Add New Customer page
  When user enter customer info
  And click on save button
  Then user can view confirmation massege "The new customer has been added successfully"
  And close browser 
  
