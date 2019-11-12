package com.leafBot.pages;

import com.leafBot.selenium.api.base.SeleniumBase;



public class CreateLeadPage extends SeleniumBase{
	public CreateLeadPage enterCompanyName(String cName) {
		
		append(locateElement("createLeadForm_companyName"),cName);
		return this;
	}
	public CreateLeadPage enterFirstName(String fName) {
		//driver.findElementById("createLeadForm_firstName").sendKeys("Vidhya");
		append(locateElement("createLeadForm_firstName"),fName);
		
		return this;
	}
	public CreateLeadPage enterLastName(String lName) {
		//driver.findElementById("createLeadForm_lastName").sendKeys("Karthik");
		append(locateElement("createLeadForm_lastName"),lName);
		return this;
		
	}
	public ViewLeadPage clickCreateLeadButton() {
		//driver.findElementByXPath("//input[@value='Create Lead']").click();
		click(locateElement("xpath","//input[@value='Create Lead']"));
		return new ViewLeadPage();
	}

}
