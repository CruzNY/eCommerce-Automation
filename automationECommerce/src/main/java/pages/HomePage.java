package pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
	public HomePage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}


	public @FindBy(xpath = "//div[@class='header_user_info']/a") WebElement signIn_Button;
	public @FindBy(xpath = "//div[@id='contact-link']/a") WebElement contactUs_Button;
	
	
	public HomePage getHomePage() throws IOException {
		getDriver().get("http://automationpractice.com/index.php");
		return new HomePage();
	}
}

