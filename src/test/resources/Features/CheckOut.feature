@Co
Feature: Product in AddTocart and verify that and procced to CheckOut

  Scenario: Checkout the Product
    When user in home page and verify the page load successfully
    Then user search the product and view the deatils of the product
    And add the product into cart
    And user add the product in cart and verify the product and proceed to checkout for validate  the mail-id and OTP
   
    
    
