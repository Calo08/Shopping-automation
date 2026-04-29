
Feature: Shopping Cart Checkout

  Scenario: Complete order successfully
    Given User is on login page
    When User logs in with valid credentials
    And User navigates to Desktops under Computers
    And User selects product and adds to cart
    And User accepts terms and proceeds to checkout
    And User enters billing details
    And User selects Cash on Delivery payment
    And User confirms the order
    Then Order should be placed successfully
