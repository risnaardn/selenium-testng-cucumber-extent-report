Feature: Checkout Page

  Scenario: User search item One to checkout
    When User open the page web shop
    And User click the button search
    And User write product
    And User key enter
    And User choose the product
    And User select size and color the product
    Then User click button Add To Cart

  Scenario: User search item Two to checkout
    When User already open home page
    And User click for button search
    And User write product two
    And User press key enter
    And User choose product two
    And User select size and color product two
    Then User click button Add to cart product two

    Scenario: User checkout item
      When User on home page
      And User scroll the page
      And User click Checkout
      And User scroll down
      And User checklist verify
      Then User click button Place Order