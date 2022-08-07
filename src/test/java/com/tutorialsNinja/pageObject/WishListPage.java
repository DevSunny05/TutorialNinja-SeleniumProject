package com.tutorialsNinja.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WishListPage {
	WebDriver ldriver;
	
	public WishListPage(WebDriver rdriver) {
		this.ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//*[@data-original-title=\"Add to Cart\"]")
	WebElement addTocart;
	
	@FindBy(xpath="//*[@id=\"product-product\"]/div[1]/a[2]")
	WebElement clickWishListLink;
	
	public void addTocart() {
		addTocart.click();
	}
	
	public void clickWiahlistPage() {
		clickWishListLink.click();
	}

}
