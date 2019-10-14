package steps;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import cucumber.api.PendingException;
import cucumber.api.java.en.*;

public class SimpleSteps {
	WebDriver driver;
	public void setUp() {		
		System.setProperty("webdriver.gecko.driver","/home/alex/git/phpTravales-Automation-Framework/AutomationFrameowrk/drivers/geckodriver");
		this.driver = new FirefoxDriver();
		this.driver.manage().window().maximize();
		this.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	}
	

	@Given("^User is on the Homepage$")
	public void user_is_on_the_Homepage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^User clicks on the \"([^\"]*)\" button$")
	public void user_clicks_on_the_button(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^User verifies the \"([^\"]*)\" page is displayed$")
	public void user_verifies_the_page_is_displayed(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^User enters \"([^\"]*)\" into textbox$")
	public void user_enters_into_textbox(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^User selects the \"([^\"]*)\" against the \"([^\"]*)\" checkbox$")
	public void user_selects_the_against_the_checkbox(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^User enters \"([^\"]*)\" into the \"([^\"]*)\" textbox$")
	public void user_enters_into_the_textbox(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^User selects \"([^\"]*)\" from the \"([^\"]*)\" dropdown$")
	public void user_selects_from_the_dropdown(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^User And User enters \"([^\"]*)\" into the \"([^\"]*)\" textbox$")
	public void user_And_User_enters_into_the_textbox(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
}
