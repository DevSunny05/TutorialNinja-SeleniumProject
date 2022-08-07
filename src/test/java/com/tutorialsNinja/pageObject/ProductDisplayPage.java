package com.tutorialsNinja.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDisplayPage {
	
	 WebDriver ldriver;
	
	public ProductDisplayPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	@FindBy(xpath="//*[@id=\"content\"]/div[3]/div/div/div[2]/div[1]/h4/a")
	WebElement displayProduct;
	
	@FindBy(xpath="//*[@id='input-quantity']")
	WebElement productQuantity;
	
	@FindBy(xpath="//*[@id='input-quantity']")
	WebElement clearProductQuantity;
	
	@FindBy(xpath="//*[@id='button-cart']")
	WebElement addToCart;
	
	@FindBy(xpath="//*[@data-original-title='Add to Wish List']")
	WebElement addWishlist;
	
	@FindBy(xpath="//*[@id=\"content\"]/div[2]/div/div/div[3]/button[2]")
	WebElement addWishlistRelatedProduct;
	
	@FindBy(xpath="//*[@id=\"wishlist-total\"]/span")
	WebElement clickOnWishlist;
	
	public void clickDisplayProduct() {
		displayProduct.click();
	}
	
	public void productQuantity(String quantity) {
		productQuantity.sendKeys(quantity);
	}
	
	public void clearProductQuantity() {
		clearProductQuantity.clear();
	}
	
	public void addToCart() {
		addToCart.click();
	}
	
	public void addWishList() {
		addWishlist.click();
	}
	
	public void addWishListRelatedProduct() {
		addWishlistRelatedProduct.click();
	}
	
	public void clickOnWishlist() {
		clickOnWishlist.click();
	}
	

}
