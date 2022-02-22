@add_pruduct_in_cart
  Feature: Add Product

    Scenario: TC12_add_product_in_cart
      When user launches the browser
      And user navigates to home page
      And user verifies home page is visible
      And user clicks products page button
      And user hover over first product and click add to cart
      And user clicks continue shopping button
      And hover over second product and click add to cart
      And user clicks view cart button
      Then user verifies both products are added to cart
      Then user verifies their prices quantity and total price