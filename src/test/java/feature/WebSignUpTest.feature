Feature: Sign Up

  Scenario: Sign up with unregistered email and password
    Given user is in homepage
    When user click sign up menu
    Then validate sign up pop-up menu is displayed
    And user input random email in sign up menu
    And user input password in sign up menu "12345678"
    And user click sign up button
    Then website will displayed pop-up message "Sign up successful."

  Scenario: Sign up with unregistered email and no password entered
    Given user is in homepage
    When user click sign up menu
    Then validate sign up pop-up menu is displayed
    And user input random email in sign up menu
    And user click sign up button
    Then website will displayed pop-up message "Please fill out Username and Password."

  Scenario: Sign up with no email and no password entered
    Given user is in homepage
    When user click sign up menu
    Then validate sign up pop-up menu is displayed
    And user click sign up button
    Then website will displayed pop-up message "Please fill out Username and Password."

  Scenario: Sign up with only password entered (no email entered)
    Given user is in homepage
    When user click sign up menu
    Then validate sign up pop-up menu is displayed
    And user input random email in sign up menu
    And user click sign up button
    Then website will displayed pop-up message "Please fill out Username and Password."

  Scenario: Sign up with registered email and password
    Given user is in homepage
    When user click sign up menu
    Then validate sign up pop-up menu is displayed
    And user input email in sign up menu "bottle123123@gmail.com"
    And user input password in sign up menu "12345678"
    And user click sign up button
    Then website will displayed pop-up message "Sign up successful."


