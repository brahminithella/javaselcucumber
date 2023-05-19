Feature: Flipkart Login

  Scenario: Successful login
    Given browser is open
    And user is on Flipkart login page
    When user enter valid credentials
    And user clicks on Request OTP button
    Then user should be logged in successfully

  Scenario: failed login
    Given browser is open
    And user is on Flipkart login page
    When user enter invalid credentials
    Then user should see an error message
