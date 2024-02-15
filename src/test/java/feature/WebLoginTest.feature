Feature: Log In

  Scenario: Login with valid email and valid password
    Given user is in homepage
    When user click login menu
    Then validate login pop-up menu is displayed
    And user input email "bottle123123@gmail.com"
    And user input password "12345678"
    And user click login button
    Then user will stayed in homepage with username displayed in menu

  Scenario: Login with valid email and invalid password
    Given user is in homepage
    When user click login menu
    Then validate login pop-up menu is displayed
    And user input email "bottle123123@gmail.com"
    And user input password "testwrongpassword"
    And user click login button
    Then website will displayed error pop-up message "Wrong password."

  Scenario: Login with invalid email and invalid password
    Given user is in homepage
    When user click login menu
    Then validate login pop-up menu is displayed
    And user input email "964732595328@ndhsadjkb.co.dha.dj"
    And user input password "testwrongpassword"
    And user click login button
    Then website will displayed error pop-up message "User does not exist."
