package com.orangehralive;

import cucumber.annotation.en.And;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import cucumber.runtime.PendingException;
import org.openqa.selenium.By;

/**
 * @author Jay Vaghani on 24/04/2017.
 */
public class MyStepdefs extends Utils
{
    @Given("^I am on Login panel page of OrangeHRM Website$")
    public void iAmOnLoginPanelPageOfOrangeHRMWebsite()
    {
        BaseTest baseTest = new BaseTest();
        baseTest.openBrowser();
    }

    @When("^I enter Username$")
    public void iEnterUsername()
    {
        typeText(By.id("txtUsername"),"Admin");
    }

    @And("^I enter password$")
    public void iEnterPassword()
    {
        typeText(By.id("txtPassword"),"admin");
    }

    @And("^I click on Login Button$")
    public void iClickOnLoginButton()
    {
        clickOnElement(By.id("btnLogin"));
    }

    @Then("^I am login Successfully with Message Welcome Admin$")
    public void iAmLoginSuccessfullyWithMessageWelcomeAdmin()
    {
        assertTrueContains("welcome","id","Welcome Admin","I am not on Home Page");
    }

    @Given("^I am on HomePage$")
    public void iAmOnHomePage()
    {

    }

    @When("^I click on PIM tab$")
    public void iClickOnPIMTab()
    {
        clickOnElement(By.xpath("//a[@id='menu_pim_viewPimModule']/b"));
    }

    @And("^I Click on Add Employee$")
    public void iClickOnAddEmployee()
    {
        clickOnElement(By.id("menu_pim_addEmployee"));
    }

    @Then("^I navigate to Add Employee page Successfully$")
    public void iNavigateToAddEmployeePageSuccessfully()
    {
        assertTrueContains("h1","css","Add Employee","I am not navigate to Add Employee  ");
    }
}
