package com.tutorialsNinja.testCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.tutorialsNinja.pageObject.LoginPage;
import com.tutorialsNinja.pageObject.ProductDisplayPage;
import com.tutorialsNinja.pageObject.SearchPage;
import com.tutorialsNinja.pageObject.WishListPage;

public class TC_Wishlist_009 extends BaseClass{
	
	@Test
	public void TC_WL_001(){
		LoginPage lp=new LoginPage(driver);
		lp.clickLogin();
		lp.loginDropDown();
		lp.setUserId(userId);
		lp.setPassword(password);
		lp.clickLogin();
		
		SearchPage sp=new SearchPage(driver);
		sp.searchProduct("iMac");
		sp.clickSearchIcon();
		
		ProductDisplayPage pdp=new ProductDisplayPage(driver);
		pdp.clickDisplayProduct();
		pdp.addWishListRelatedProduct();
		
		String SuccessMsg=driver.findElement(By.xpath("//*[@id=\"product-product\"]/div[1]")).getText();
		
		if(SuccessMsg.equals(" Success: You have added Apple Cinema 30\" to your wish list!")) {
			Assert.assertTrue(true);
		}
		
		WishListPage wlp=new WishListPage(driver);
		wlp.clickWiahlistPage();
		
		boolean product=driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/table/tbody/tr/td[2]/a")).isDisplayed();
		
		if(product) {
			Assert.assertTrue(true);
		}
	}
	
	
}
