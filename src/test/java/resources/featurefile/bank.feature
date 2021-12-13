Feature: Bank Functionality

  Background: I am on home page

@smoke
  Scenario: bank manager should add customer successfully
    When I click on manager login link
    Then I click on add customer tab
    And I enter first name "Kishan"
    And I enter last name "Patel"
    And I enter postal code "01546"
    And I click on add customer button

@smoke,@sanity
  Scenario: bank manager should open account successfully
    When I click on manager login link
    Then I click on open account tab
    And I select customer name "Harry Potter"
    And I select currency "Pound"
    And I click on process button

@sanity
  Scenario: customer should login and logout successfully
    When I click on customer login link
    And I select customer name "Harry Potter"
    And I click on login button
    And I click on Logout  button

@smoke,@regression
  Scenario: Customer should deposit money successfully
    When I click on customer login link
    And I select my name "Harry Potter"
    And I click on login button
    And I click on deposit button
    And I enter amount "500"
    And I click to deposit money
    And I can see deposit successful

  @regression
  Scenario: customer should withdraw money successfully
    When I click on customer login link
    And I select my name "Harry Potter"
    And I click on login button
    And I click on deposit button
    And I enter amount "500"
    And I click to deposit money
    Then I click on withdraw tab
    And I enter amount to be withdrawn "100"
    And I click on withdraw for cash
    And I can see transaction








