package com.orangehralive;

import cucumber.annotation.After;
import cucumber.annotation.Before;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * @author Jay Vaghani on 24/04/2017.
 *
 */
public class BaseTest extends BasePage
{
    @org.junit.Before
    public void openBrowser()
    {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("http://opensource.demo.orangehrmlive.com");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @org.junit.After
    public void closeBrowser()
    {
       driver.quit();
    }

}
