Feature: Search and add item to cart

  Scenario: User search and add to cart One
    When User open web shop
    And User click button search
    And User write the product
    And User press enter
    And User choose the item
    And User select size and color
    Then User click button Add to cart

  Scenario: User search and add to cart item Two
    When User already open web
    And User click button search again
    And User write the product two
    And User press enter again
    And User choose the item two
    And User select size and color for item two
    Then User click button Add to cart Item two


