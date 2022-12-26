@smoke
Feature: users could login with valid username and password
  Scenario: users could login with valid username and password
    Given click on login link
    When user enter valid mail
    And user enter valid password
    And user click on login Button
    Then login success message is display