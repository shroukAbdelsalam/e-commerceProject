Feature: users could register with new accounts

  Scenario: register new user with valid data success
    Given click on register link
    When user choose gender
    And user enter first name and last name
    And user enter Email
    And user enter password
    And user confirm password
    And user enter birthday date
    And user click on register Button
    Then success message is display