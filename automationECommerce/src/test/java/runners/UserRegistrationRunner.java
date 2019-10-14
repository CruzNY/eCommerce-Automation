package runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
		features = {"/home/alex/git/repository/automationECommerce/features/standardFeatures/UserRegistration.feature"},
		glue = {"steps"},
		monochrome = true,
		tags = {},
		plugin = {"pretty","html:target/cucumber","json:target/cucumber.json","com.cucumber.listener.ExtentCucumberFormatter:target/report.html"}
		)

public class UserRegistrationRunner {

}
