Feature: As a user I should be able to access different pet views.

  @Test_SDETA-152
  Scenario: Click a product ID in the pet view
    Given the user is on the pet view
    And by clicking the Product ID of the species
    Then he should be redirected to the sub view of that species.

  @Test_SDETA-153
  Scenario: Return to pet view from pet sub view.
    When user is on the SubView of the Species
    Then user should be able to see the return to the pet view option.


  @Test_SDETA-158
  Scenario: Check desired tabular layout of subspecies.
    When user is on the SubView
    Then user should see the tabular view with these columns
    #Item ID, Product ID, Description,List Price,Add to card

  @Test_SDETA-159
  Scenario: Clicking the "Add to cart" button for a specific pet
    When user wants to select a pet
    Then he has to click the items to add them to the cart.

