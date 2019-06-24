package Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
 
@RunWith(Cucumber.class)
@CucumberOptions(
 features = "C:\\Work\\eclipse-workspace\\com.Guru99.BD\\Features\\gurubankLogin.feature"
 ,glue={"StepDefinitions"}
 ,plugin = {"pretty","html:reports/test-report"}
 ,dryRun = false
 ,monochrome = true)

public class TestRunner 
{

}
