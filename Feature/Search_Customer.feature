Feature: Search Customer
Scenario: Seach customer by Email
  Given User Launch Chrome Browser
  When User open URL "https://admin-demo.nopcommerce.com/login"
  And User enter Email as "admin@yourstore.com" and Password as "admin"
  And Click on login
  Then User can view Dashboard "Dashboard / nopCommerce administration"
  And click on customer menu Item
  And Click on customers Menu Item
  And Enter customer Email "TvhVp@gmail.com"
  When Click on search button
  Then User should found Email in the search table
  And close browser