Feature: F01_add_product_to_cart | checkout

  Scenario: validate user add product to cart and checkout
    Given user login as "standard_user" and enter password as "secret_sauce"
    And user clicks on login button
    When  user add product to cart
    And user navigates to shopping cart
    And user clicks on checkout
    And provide checkout firstName as "Esraa" and lastName as "Hassan" and Postalcode as "1234"
    And  user click on continue Button
    And user redirected to checkout overview and clicks on Finish button
    Then success message will be displayed "Thank you for your order!"