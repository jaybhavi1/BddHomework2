package com.orangehralive;

import cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * @author Jay Vaghani on 24/04/2017.
 */

@RunWith(Cucumber.class)
@Cucumber.Options(features = ".",format = "html:target/CucumberReports", tags = "@Orange")

public class RunTest
{

}
