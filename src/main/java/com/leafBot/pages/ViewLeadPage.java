package com.leafBot.pages;

import com.leafBot.selenium.api.base.SeleniumBase;



public class ViewLeadPage extends SeleniumBase {
	public ViewLeadPage viewLead(String fName) {
		//String fName=driver.findElementById("viewLead_firstName_sp").getText();
		
	String firstName=	getElementText(locateElement("viewLead_firstName_sp"));
		System.out.println(firstName);
	    if(firstName.equals(fName)){
	    		System.out.println("Test pass");
	    }
	    else
	    	System.out.println("Test fail");
		return this;
		
	}
	public EditLeadPage editLead() {
		//driver.findElementByXPath("//a[text()='Edit']").click();
		click(locateElement("xpath","//a[text()='Edit']"));
		return new EditLeadPage();
	}

}
