package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DriverFactory {
	public static WebDriver driver;
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
	}
	return driver;
	}
}