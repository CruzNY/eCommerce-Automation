package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.*;
import pages.ContactUs;
import utils.DriverFactory;

public class ContactUsSteps extends DriverFactory{
	@Given("^User navigates to the my shop homepage$")
	public void user_navigates_to_the_my_shop_homepage() throws Throwable {
		contactUs.getContactUsPage();
	}

	@When("^User clicks on the \"([^\"]*)\" link$")
	public void user_clicks_on_the_link(String arg1) throws Throwable {
		
	}

	@Then("^User verify that the \"([^\"]*)\" page is displayed$")
	public void user_verify_that_the_page_is_displayed(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^User enters \"([^\"]*)\" into the \"([^\"]*)\" textfield$")
	public void user_enters_into_the_textfield(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^User enters \"([^\"]*)\" into the \"([^\"]*)\" textarea$")
	public void user_enters_into_the_textarea(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
}
