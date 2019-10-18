package utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadConfigFile {
	protected InputStream input = null;
	protected Properties properties = null;
	
	public ReadConfigFile() {
		try {
			ReadConfigFile.class.getResourceAsStream(Constant.GECKO_DRIVER_DIRECTORY);
			properties = new Properties();
			properties.load(input);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	public String getBrowser() {
		if(properties.getProperty("browser") == null)
			return "";
		return properties.getProperty("browser"); 			
	}
}
