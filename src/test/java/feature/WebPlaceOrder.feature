Feature: Place Order in Cart

Scenario: Place order with complete customer data
  Given user is in homepage
  And user input email in login menu "bottle123123@gmail.com"
  And user input password in login menu "12345678"
  And user click login button
  And user click item 1 in homepage
  And user click add to cart button
  And validate item is added in cart menu
  And validate total item price
  When user click place order button
  Then validate place order pop up is displayed
  When user enter name in place order pop up menu
  And user enter country in place order pop up menu
  And user enter city in place order pop up menu
  And user enter credit card in place order pop up menu
  And user enter month in place order pop up menu
  And user enter year in place order pop up menu
  And user click purchase button in place order pop up menu
  Then validate thank you pop up is displayed
  And validate order details

Scenario: Place order with only mandatory customer data (name and credit card)
  Given user is in homepage
  And user input email in login menu "bottle123123@gmail.com"
  And user input password in login menu "12345678"
  And user click login button
  And user click item 1 in homepage
  And user click add to cart button
  And validate item is added in cart menu
  And validate total item price
  When user click place order button
  Then validate place order pop up is displayed
  When user enter name in place order pop up menu
  And user enter credit card in place order pop up menu
  And user click purchase button in place order pop up menu
  Then validate thank you pop up is displayed
  And validate order details


Scenario: Place order with incomplete customer data (name only)
  Given user is in homepage
  And user input email in login menu "bottle123123@gmail.com"
  And user input password in login menu "12345678"
  And user click login button
  And user click item 1 in homepage
  And user click add to cart button
  And validate item is added in cart menu
  And validate total item price
  When user click place order button
  Then validate place order pop up is displayed
  When user enter name in place order pop up menu
  And user click purchase button in place order pop up menu
  Then validate pop up menu displayed "Please fill out Name and Creditcard."


Scenario: Place order with multiple items
  Given user is in homepage
  And user input email in login menu "bottle123123@gmail.com"
  And user input password in login menu "12345678"
  And user click login button
  And user click item 1 in homepage
  And user click add to cart button
  And user click item 2 in homepage
  And user click add to cart button
  And validate item is added in cart menu
  And validate total item price
  When user click place order button
  Then validate place order pop up is displayed
  When user enter name in place order pop up menu
  And user enter credit card in place order pop up menu
  And user click purchase button in place order pop up menu
  Then validate thank you pop up is displayed
  And validate order details
