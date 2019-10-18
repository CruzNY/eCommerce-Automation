package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;

import pages.HomePage;
import pages.LoginAndSignUp;

public class DriverFactory {
	public static WebDriver driver;
	public static HomePage homepage;
	public static LoginAndSignUp loginAndSignUp;
	
	
	public WebDriver getDriver() {
	try {
		ReadConfigFile file = new ReadConfigFile();
		String browserName = file.getBrowser();
		
		switch (browserName) {
		
		case "firefox":
			if(null == driver) {
				System.setProperty("webdriver.gecko.driver",Constant.GECKO_DRIVER_DIRECTORY);
				DesiredCapabilities capabilities = DesiredCapabilities.firefox();
				capabilities.setCapability("marionette", true);
				driver = new FirefoxDriver();
			}
			break;
		case "chrome":
			if(null == driver) {
				
			}
			break;
		case "ie":
			if(null == driver) {
				
			}
			break;
		}
	}catch(Exception e) {
		System.out.println("Unable to load browser"+ e.getMessage());
	}finally {
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);	
		homepage = PageFactory.initElements(driver, HomePage.class);
		loginAndSignUp = PageFactory.initElements(driver, LoginAndSignUp.class);
	}
	return driver;
	}
}