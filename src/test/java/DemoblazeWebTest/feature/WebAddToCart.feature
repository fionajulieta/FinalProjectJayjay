Feature: Add to cart

  Scenario: Add 1 item to cart
    Given user is in homepage
    And user input email in login menu "bottle123123@gmail.com"
    And user input password in login menu "12345678"
    And user click login button
    When user click item 1 in homepage
    And user click add to cart button
    Then validate pop up menu displayed "Product Added"
    And validate item is added in cart menu

  Scenario: Add multiple items to cart
    Given user is in homepage
    And user input email in login menu "bottle123123@gmail.com"
    And user input password in login menu "12345678"
    And user click login button
    When user click item 1 in homepage
    And user click add to cart button
    Then validate pop up menu displayed "Product Added"
    When user click item 2 in homepage
    And user click add to cart button
    Then validate pop up menu displayed "Product Added"
    And validate item is added in cart menu


  Scenario: Add multiple items to cart then delete 1 item
    Given user is in homepage
    And user input email in login menu "bottle123123@gmail.com"
    And user input password in login menu "12345678"
    And user click login button
    When user click item 1 in homepage
    And user click add to cart button
    Then validate pop up menu displayed "Product Added"
    When user click item 2 in homepage
    And user click add to cart button
    Then validate pop up menu displayed "Product Added"
    And validate item is added in cart menu
    When user delete an item from cart
    Then item will disappeared from cart item list

