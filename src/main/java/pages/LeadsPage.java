package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.BaseClass;
import base.ProjectSpecificMethods;

public class LeadsPage extends ProjectSpecificMethods{
	public LeadsPage(RemoteWebDriver inwardDriver) {
		this.driver=inwardDriver;		
	}
	
	public CreateLeadPage clickCreateLead() {
		driver.findElement(By.linkText(property.getProperty("leadPage.createLead.linktext"))).click();
		
		return new CreateLeadPage(driver);
	}
	

}
