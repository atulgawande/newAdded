package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = { "src\\test\\resources\\app.feature\\app.feature"},
		glue = {"Step"},
		publish = true
	
		)

public class appRunnerClass extends AbstractTestNGCucumberTests{

}
