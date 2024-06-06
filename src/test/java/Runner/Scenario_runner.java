package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src\\test\\resources\\app.feature\\Scenario.feature"},
		glue = {"Step"},
		publish = true

		)


public class Scenario_runner extends AbstractTestNGCucumberTests{

}
