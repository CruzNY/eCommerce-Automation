package pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUs extends BasePage{
	public ContactUs() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	public @FindBy(xpath = "//select[@id='id_contact']") WebElement subject_heading_selection;
	public @FindBy(xpath = "//input[@id='email']") WebElement email_address;
	public @FindBy(xpath = "//input[@id='id_order']") WebElement order_reference;
	public @FindBy(xpath = "//input[@id='fileUpload']") WebElement choose_file_button;
	public @FindBy(xpath = "//textarea[@id='message']") WebElement message_text_area;
	
	public ContactUs getContactUsPage() throws IOException {
		getDriver().get("http://automationpractice.com/index.php");
		return new ContactUs();
	}
	public ContactUs enterEmail(String email) throws Exception{
		sendKeysToWebElement(email_address, "email");
		return new 	ContactUs();
	}
}
