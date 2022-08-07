package com.tutorialsNinja.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	
WebDriver ldriver;
	
	public RegisterPage(WebDriver rdriver){
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//*[@title='My Account']/span")
	WebElement myAccount;
	
	@FindBy(xpath="//*[@id='top-links']/ul/li[2]/ul/li[1]/a")
	WebElement Register;
	
	
	public void clickMyAccount() {
		myAccount.click();
	}
	
	public void clickRegister() {
		Register.click();
	}
	
	

}
