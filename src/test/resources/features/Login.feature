Feature: Swag Labs Login tests
  As a customer, I can login to swag labs website

  Background: login to swag labs successfully
    Given the user logs in with username "standard_user" and password "secret_sauce"
    And wait for the page to finish loading

  Scenario: Login to swag labs using valid username and password
    Then products page title is displayed
