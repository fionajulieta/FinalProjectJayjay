Feature: Log In

  @web
  Scenario: Login with valid email and valid password
    Given user is in homepage
    When user click login menu
    Then validate login pop-up menu is displayed
    And user input email in login menu "bottle123123@gmail.com"
    And user input password in login menu "12345678"
    And user click login button
    Then user will stayed in homepage with username displayed in menu

  @web
  Scenario: Login with valid email and invalid password
    Given user is in homepage
    When user click login menu
    Then validate login pop-up menu is displayed
    And user input email in login menu "bottle123123@gmail.com"
    And user input password in login menu "testwrongpassword"
    And user click login button
    Then validate pop up menu displayed "Wrong password."

  @web
  Scenario: Login with invalid email and invalid password
    Given user is in homepage
    When user click login menu
    Then validate login pop-up menu is displayed
    And user input email in login menu "964732595328@ndhsadjkb.co.dha.dj"
    And user input password in login menu "testwrongpassword"
    And user click login button
    Then validate pop up menu displayed "User does not exist."

  @web
  Scenario: Login with any email and no password entered
    Given user is in homepage
    When user click login menu
    Then validate login pop-up menu is displayed
    And user input email in login menu "964732595328@ndhsadjkb.co.dha.dj"
    And user click login button
    Then validate pop up menu displayed "Please fill out Username and Password."
