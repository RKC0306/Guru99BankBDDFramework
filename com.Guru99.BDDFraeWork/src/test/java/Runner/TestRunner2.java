package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
 features = "C:\\Work\\eclipse-workspace\\com.Guru99.BDDFraeWork\\Features\\gurubankLoginWithExcel.feature"
 ,glue={"StepDefinitions2"}
 ,plugin = {"pretty","html:reports/test-report"}
 ,dryRun = false
 ,monochrome = true)
public class TestRunner2 {

}
