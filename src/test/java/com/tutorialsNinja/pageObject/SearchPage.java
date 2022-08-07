package com.tutorialsNinja.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {

	WebDriver ldriver;

	public SearchPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//*[@name='search']")
	WebElement searchBox;
	
	@FindBy(xpath="//*[@class='btn btn-default btn-lg']")
	WebElement clickSearchIcon;
	
	
	public void searchProduct(String product) {
		searchBox.sendKeys(product);
	}
	
	public void clickSearchIcon() {
		clickSearchIcon.click();
	}
	
	
	
}	
