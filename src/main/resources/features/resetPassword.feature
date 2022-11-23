Feature: users can reset password with valid mail

  Scenario:  users can reset password with valid mail
    Given click on login link
    And click on Forgot password? link
    When user enter  mail to reset password
    And user click on recover Button
    Then  success email is send message is display
    #Email with instructions has been sent to you.