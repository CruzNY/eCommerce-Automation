package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
	public @FindBy(xpath = "//div[@class='header_user_info']/a") WebElement signIn_Button;
	public @FindBy(xpath = "//div[@id='contact-link']/a") WebElement contactUs_Button;
}
