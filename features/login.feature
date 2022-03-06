Feature: login

@sanity
Scenario: successful login with valid credential
   Given lauch chrome browser
   When open url "http://admin-demo.nopcommerce.com/Login"
   And enter email as this "admin@yourstore.com" password as "admin"
   And enter login
   Then page title should be "Dashboard / nopCommerce administration"
   When user click on logout button
   Then page title should be "Your store. Login"
   And close browser

@regression
   Scenario Outline: login data driven
   Given lauch chrome browser
   When open url "http://admin-demo.nopcommerce.com/Login"
   And enter email as this "<email>" password as "<password>"
   And enter login
   Then page title should be "Dashboard / nopCommerce administration"
   When user click on logout button
   Then page title should be "Your store. Login"
   And close browser
   
   Examples:
       | email   |   password|
       | admin@yourstore.com   |   admin|
       | admin@yourstore.com    |  admin123|
        
   
   
   
   