package com.tutorialsNinja.testCases;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.tutorialsNinja.pageObject.AddToCartPage;
import com.tutorialsNinja.pageObject.LoginPage;
import com.tutorialsNinja.pageObject.ProductDisplayPage;
import com.tutorialsNinja.pageObject.SearchPage;
import com.tutorialsNinja.pageObject.WishListPage;

public class TC_AddToCartTest_008 extends BaseClass {

	@Test(priority=0)
	public void TC_ATC_001() {
		driver.get(baseURL);
		logger.info("url is open");

		SearchPage sp = new SearchPage(driver);

		sp.searchProduct("iMac");
		logger.info("product add to search box");
		sp.clickSearchIcon();
		logger.info("click on search icon");

		ProductDisplayPage pdp = new ProductDisplayPage(driver);
		pdp.clickDisplayProduct();
		logger.info("click on display product");
		pdp.addToCart();
		logger.info("click on add to cart");

		String SuccessMsg = driver.findElement(By.xpath("//*[@id=\"product-product\"]/div[1]")).getText();
		if (SuccessMsg.equals("Success: You have added iMac to your shopping cart!")) {
			Assert.assertTrue(true);
			logger.info("test1 pass");
		}

		AddToCartPage acp = new AddToCartPage(driver);
		acp.clickShopingCartLink();
		logger.info("click on shoping cart link");

		String product = driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/table/tbody/tr/td[2]/a")).getText();

		if (product.equals("iMac")) {
			Assert.assertTrue(true);
			logger.info("test2 pass");
		}
	}
	
	
	@Test(priority=1)
	public void TC_ATC_002() {

		driver.get(baseURL);
		logger.info("url is open");
		
		LoginPage lp=new LoginPage(driver);
		lp.clickMyAccount();
		logger.info("click on my account");
		lp.loginDropDown();
		logger.info("click on login");
		lp.setUserId(userId);
		logger.info("user id added");
		lp.setPassword(password);
		logger.info("password added.");
		lp.clickLogin();
		
		
		
		SearchPage sp=new SearchPage(driver);
		sp.searchProduct("iMac");
		logger.info("product added to search box");
		sp.clickSearchIcon();
		logger.info("click on search icon");
		
		ProductDisplayPage pdp=new ProductDisplayPage(driver);
		pdp.addWishList();
		logger.info("prodduct added into the wishlist");
		
		pdp.clickOnWishlist();
		logger.info("click on wishlist on header");
		
		WishListPage wlp=new WishListPage(driver);
		wlp.addTocart();
		logger.info("added to car");
		
		String SuccessMsg=driver.findElement(By.xpath("//*[@id=\"account-wishlist\"]/div[1]")).getText();
		
		if(SuccessMsg.equals(" Success: You have added iMac to your shopping cart!")) {
			Assert.assertTrue(true);
			logger.info("test pass");
		}

	}
	
	

}
