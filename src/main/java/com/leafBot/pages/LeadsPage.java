package com.leafBot.pages;

import com.leafBot.selenium.api.base.SeleniumBase;



public class LeadsPage extends SeleniumBase {
	public CreateLeadPage clickCreateLead() {
		//driver.findElementByXPath("//a[text()='Create Lead']").click();
		//eleCreateLeadLink.click();
		click(locateElement("xpath","//a[text()='Create Lead']"));
		return new CreateLeadPage();
	}
}
