package com.leafBot.pages;

import com.leafBot.selenium.api.base.SeleniumBase;



public class FindLeadsPage extends SeleniumBase{
	
	public FindLeadsPage enterFirstName() {
		append(locateElement("xpath","(//input[@name='firstName'])[3]"),"Vidhya");
		//driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("Vidhya");
		return this;
	}
	public FindLeadsPage clickFindLeadsButton() throws InterruptedException {
		//driver.findElementByXPath("//button[text()='Find Leads']").click();
		click(locateElement("xpath","//button[text()='Find Leads']"));
		Thread.sleep(3000);
		return this;
	}
	public ViewLeadPage clickResultingLead() {
		//driver.findElementByXPath("(//a[@class='linktext'])[4]").click();
		click(locateElement("xpath","(//a[@class='linktext'])[4]"));
		return new ViewLeadPage();
	}
}
