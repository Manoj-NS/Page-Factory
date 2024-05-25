package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.ReadExcelData;

public class ProjectSpecificMethods {

	public RemoteWebDriver driver; //Removed Static-->Go to Login Page
	
	public String excelFileName;
	public static Properties property;
	
	@BeforeMethod
	
	public void BeforeMethod () throws Exception {
		
		// Getting App Config
		
		Properties prop = new Properties();
		FileInputStream getfilelocation = new FileInputStream("./config/AppConfig.properties");
		prop.load(getfilelocation);
		
		// To get the browser from Property File.
		String browserName=prop.getProperty("browserName");
			
		if (browserName.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			
		} else if(browserName.equalsIgnoreCase("Edge")){
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}

		//getting URL from the property file 
		
		driver.get(prop.getProperty("URL"));
		driver.manage().window().maximize();
		//driver .manage().timeouts().implicitlyWait(Duration.ofSeconds(120));	
		
		Thread.sleep(3000);
		
		// Getting Language Config
				
				property=new Properties();
		//Code Working		FileInputStream getfilelocation1 = new FileInputStream("C:\\OfficePractise\\config\\English.Properties");
				FileInputStream getfilelocation1 = new FileInputStream("./config/"+prop.getProperty("language")+".properties");
				
				property.load(getfilelocation1);
				
				String getlanguage=prop.getProperty("language");
				
				if (getlanguage.equals("English")) {
					
					System.out.println("English Language Selected");	
				} 
				else if(getlanguage.equals("Spanish")){
					System.out.println("Spanish Language Selected");
				}
	}
	
	@AfterMethod
	public void AfterMethod() {
		
		driver.close();		
	}
	
	@DataProvider
	public String[][] createleadData() throws IOException{
		return ReadExcelData.getData(excelFileName);	
	}

}
	

