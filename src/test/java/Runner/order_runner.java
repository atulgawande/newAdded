package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src\\test\\resources\\app.feature\\Order.feature"},
		glue = {"Step"},
		publish = true
		)

public class order_runner extends AbstractTestNGCucumberTests{

}
