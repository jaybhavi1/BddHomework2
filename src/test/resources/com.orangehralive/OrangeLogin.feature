@Orange
Feature: As a user
  I want to login successfully on OrangeHRM Website

  Scenario: I should login successfully with Username:Admin and Password:admin
    Given I am on Login panel page of OrangeHRM Website
    When I enter Username
    And I enter password
    And I click on Login Button
    Then I am login Successfully with Message Welcome Admin