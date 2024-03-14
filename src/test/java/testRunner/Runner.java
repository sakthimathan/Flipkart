package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "C:\\Users\\Lenovo\\eclipse-workspace\\E-commerce\\src\\test\\resources\\Features",
glue = "stepDefinition",monochrome = true,dryRun =!true , tags = "@Co" )


public class Runner extends AbstractTestNGCucumberTests {

}
