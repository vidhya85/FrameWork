package com.leafBot.pages;

import com.leafBot.selenium.api.base.SeleniumBase;



public class EditLeadPage extends SeleniumBase{
	public EditLeadPage clearAndEditCompanyName() {
		driver.findElementById("updateLeadForm_companyName").clear();
		clearAndType(locateElement("id", "updateLeadForm_companyName"),"TCS");
		return this;
		}
		
		public ViewLeadPage clickUpdate() {
			driver.findElementByXPath("//input[@value='Update']").click();
			click(locateElement("xpath","//input[@value='Update']"));
			return new ViewLeadPage();
		}
}
