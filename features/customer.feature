Feature: cuctomer

@unit
Scenario: successful login with valid credential
   Given lauch chrome browser
   When open url "http://admin-demo.nopcommerce.com/Login"
   And enter email as this "admin@yourstore.com" password as "admin"
   And enter login
   Then user can view dashboard
   When user click on customer menu
   And click on customer menu item
   And click on Add new button
   Then user can view Add customer page
   When user enter customer info
   And click on save button
   Then user can view confirmation message  "The new customer has been added successfully."
   And close browser