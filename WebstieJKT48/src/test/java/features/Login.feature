Feature: Login Feature

  Scenario: User Want To Login With Valid Credentials
    Given User Access Website
    And User Klik Login Button
    When User Input Valid Credentials
    And User Click Login Button
    Then User Should Be Logged In


  Scenario: User Want To Login With Invalid Credentials
    Given User Access Website
    And User Klik Login Button
    When User Input Invalid Credentials
    And User Click Login Button
    Then User Should See Error Message