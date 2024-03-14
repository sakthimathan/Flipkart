Feature: user open Flipkart page and search product and add to cart

  Scenario: Add to cart the product
    When user in home page and verify the page load successfully
    Then user search the product and view the deatils of the product
    And add the product into cart
