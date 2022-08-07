package com.tutorialsNinja.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {
	
WebDriver ldriver;
	
	public LogoutPage(WebDriver rdriver){
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//*[contains(text(),'My Account')][@class='hidden-xs hidden-sm hidden-md']")
	WebElement myAccount;
	
	
	@FindBy(xpath="//*[@id=\"top-links\"]/ul/li[2]/ul/li[5]/a")
	WebElement logout;
	
	@FindBy(xpath="//*[contains(text(),'Logout')][@class='list-group-item']")
	WebElement logoutRightColumn;
	

	@FindBy(xpath="//*[contains(text(),'Continue')]")
	WebElement continueBtn;
	
	
	public void clickMyAccount() {
		myAccount.click();
	}
	
	
	public void clickLogout() {
		logout.click();
	}
	
	public void logoutRightColumn() {
		logoutRightColumn.click();
	}
	
	public void clickContinue() {
		continueBtn.click();
	}
	
}
