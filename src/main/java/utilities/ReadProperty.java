package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProperty {
	
	public static void main(String[] args) throws IOException {
		Properties prop = new Properties();
		FileInputStream getpropertiesfile = new FileInputStream("./config/AppConfig.properties");
		prop.load(getpropertiesfile);
		// To get the property keyword
		String geturl=prop.getProperty("URL");
		System.out.println(geturl);
		String getbrowser=prop.getProperty("browserName");
		System.out.println(getbrowser);
		String getlanguage=prop.getProperty("language");
		System.out.println(getlanguage);
		
	}

}
