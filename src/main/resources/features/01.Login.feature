Feature: Login User

  Scenario: User login page
    When User go to web shop
    And User Scroll Page
    And User Click MyAccount
    And User enter username password valid
    Then User click button login valid
