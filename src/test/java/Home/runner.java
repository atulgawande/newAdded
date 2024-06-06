package Home;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"src\\test\\resources\\Home\\Home.feature"},
		glue = {"Home_pageSteps","Hooks"},
		publish = true,
		plugin = {"pretty","com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"}
		
		
		)


public class runner extends AbstractTestNGCucumberTests {

}
