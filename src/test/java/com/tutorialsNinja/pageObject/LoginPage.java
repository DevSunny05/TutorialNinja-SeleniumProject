package com.tutorialsNinja.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver){
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//*[@name='email']")
	WebElement textEmail;
	
	@FindBy(xpath="//*[@name='password']")
	WebElement textPassword;
	
	@FindBy(xpath="//*[@value='Login']")
	WebElement loginBtn;
	
	@FindBy(xpath="//*[contains(@class,'list-group-item')] [text()='Logout']")
	WebElement logoutBtn;
	
	@FindBy(xpath="//*[@id=\"content\"]/div/div[2]/div/form/div[2]/a")
	WebElement forgotPwdLink;
	
	@FindBy(xpath="//*[contains(text(),'My Account')][@class='hidden-xs hidden-sm hidden-md']")
	WebElement myAccount;
	
	@FindBy(xpath="//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a")
	WebElement loginBtnDropDown;
	
	
	public void setUserId(String email) {
		textEmail.sendKeys(email);
	}
	
	public String getAttributeUserId() {
		return textEmail.getAttribute("placeholder");
	}
	
	public String getAttributeLogoutBtn() {
		return loginBtn.getText();
	}
	
	public void setPassword(String password) {
		textPassword.sendKeys(password);
	}
	
	public void clickLogin() {
		loginBtn.click();
	}
	
	public void clicklogout() {
		logoutBtn.click();
	}
	
	public void forgotPassword() {
		forgotPwdLink.click();
	}
	
	public void clickMyAccount() {
		myAccount.click();
	}
	
	public void loginDropDown() {
		loginBtnDropDown.click();
	}
	
	
}
