
@Orange
Feature: As a User
  I am able to add new Employee on Orange HRA WebSite

  Scenario: I should login on Orange website successfully
    Given I am on Login panel page of OrangeHRM Website
    When I enter Username in username field
    And I enter password in password field
    And I click on Login Button
    Then I can login Successfully with Message Welcome Admin

  Scenario: I should navigate to Add Employee page
    Given I am on HomePage
    When I click on PIM tab
    And I Click on Add Employee
    Then I should navigate to Add Employee page Successfully


