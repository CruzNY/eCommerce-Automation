package runners;

import cucumber.api.CucumberOptions;

@CucumberOptions(
		features = {"/home/alex/git/phpTravales-Automation-Framework/AutomationFrameowrk/features"},
		glue = {"steps"},
		monochrome = true,
		tags = {},
		plugin = {"pretty","html:target/cucumber","json:target/cucumber.json","com.cucumber.listener.ExtentCucumberFormatter:target/report.html"}
		)

public class UserRegistrationRunner {

}
