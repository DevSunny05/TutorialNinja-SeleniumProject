package com.tutorialsNinja.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPage {
	
	WebDriver ldriver;
	
	public AddToCartPage(WebDriver rdriver) {
		this.ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//a[text()='shopping cart']")
	WebElement clickShopingCartLink;
	
	
	public void clickShopingCartLink() {
		clickShopingCartLink.click();
	}

}
