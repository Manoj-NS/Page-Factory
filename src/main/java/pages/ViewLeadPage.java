package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecificMethods;

public class ViewLeadPage extends ProjectSpecificMethods{
	public ViewLeadPage(RemoteWebDriver inwardDriver) {
		this.driver=inwardDriver;
	}
	
	public ViewLeadPage verifyLeadId() {
		String leadID=driver.findElement(By.id("viewLead_companyName_sp")).getText(); // text missing need to find
		System.out.println(leadID);
		return this;
		
	}
	

}
