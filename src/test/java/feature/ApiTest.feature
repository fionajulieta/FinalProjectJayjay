Feature: Test Automation for Dummy Api

  Scenario: test get all user
    Given prepare url for "GET_USER"
    When hit api get request
    Then response code will be 200
    And response body match with json schema "JsonSchemaGetAllUser.json"

  Scenario: test get a specific user
    Given prepare url for "GET_USER"
    When hit api get request for a specific id "60d0fe4f5311236168a109cc"
    Then response code will be 200
    And response body match with json schema "JsonSchemaGetSpecificUser.json"

  Scenario: test post user
    Given prepare url for "POST_USER"
    When hit api post request
    Then response code will be 200
    And validate create response body
    And response body match with json schema "JsonSchemaPostUser.json"

  Scenario: test update user (user input incorrect email)
    Given prepare url for "POST_USER"
    When hit api post request
    Then response code will be 200
    And validate create response body
    Then hit api put request to update the email
    And response code will be 200
    And response body match with json schema "JsonSchemaPostUser.json"

    PUT MASIH SALAH

  Scenario: test delete user
    Given prepare url for "POST_USER"
    When hit api post request
    Then response code will be 200
    And validate create response body
    Then hit api delete request
    And response code will be 200
