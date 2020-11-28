package demos;

import cucumber.api.testng.AbstractTestNGCucumberTests;
//import cucumber.junit.Cucumber;

//import cucumber.testng.CucumberOptions;

@cucumber.api.CucumberOptions(
		features= {"src\\demos"}
		)

public class TestNGRunnerTest extends AbstractTestNGCucumberTests {

}
