package com.tutorialsNinja.testCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.tutorialsNinja.pageObject.LoginPage;
import com.tutorialsNinja.pageObject.LogoutPage;
import com.tutorialsNinja.pageObject.SearchPage;

public class TC_SearchTest_005 extends BaseClass {
	
	@Test(priority=0)
	public void TC_SF_001(){
		driver.get(baseURL);
		logger.info("URL is open.");
		
		SearchPage sp= new SearchPage(driver);
		sp.searchProduct("iMac");
		logger.info("enter product into search icon");
		sp.clickSearchIcon();
		logger.info("click on search icon");
		
		String product=driver.findElement(By.xpath("//a[text()='iMac']")).getText();
		System.out.println(product);
		
			Assert.assertEquals(product, "iMac");
		
	}
	
	@Test(priority=1)
	public void TC_SF_002(){
		driver.get(baseURL);
		logger.info("URL is open.");
		
		SearchPage sp= new SearchPage(driver);
		sp.searchProduct("Bat");
		logger.info("enter product into search icon");
		sp.clickSearchIcon();
		logger.info("click on search icon");
		
		String product=driver.findElement(By.xpath("//*[@id=\"content\"]/p[2]")).getText();
		System.out.println(product);
		
			Assert.assertEquals(product, "There is no product that matches the search criteria.");
		
	}
	
	@Test(priority=2)
	public void TC_SF_003(){
		driver.get(baseURL);
		logger.info("URL is open.");
		
		SearchPage sp= new SearchPage(driver);
		sp.searchProduct("");
		logger.info("enter product into search icon");
		sp.clickSearchIcon();
		logger.info("click on search icon");
		
		String product=driver.findElement(By.xpath("//*[@id=\"content\"]/p[2]")).getText();
		System.out.println(product);
		
			Assert.assertEquals(product, "There is no product that matches the search criteria.");
		
	}
	
	@Test(priority=3)
	public void TC_SF_004() {
		driver.get(baseURL);
		logger.info("URL is open.");
		
		LoginPage lp= new LoginPage(driver);
		lp.clickMyAccount();
		lp.loginDropDown();
		lp.setUserId(userId);
		lp.setPassword(password);
		lp.clickLogin();
		
		SearchPage sp= new SearchPage(driver);
		sp.searchProduct("iMac");
		logger.info("enter product into search icon");
		sp.clickSearchIcon();
		logger.info("click on search icon");
		
		String product=driver.findElement(By.xpath("//a[text()='iMac']")).getText();
		System.out.println(product);
		
			Assert.assertEquals(product, "iMac");
		
			LogoutPage lo=new LogoutPage(driver);
			lo.clickMyAccount();
			logger.info("click on my account");
			lo.clickLogout();
			logger.info("click on logout");
			lo.clickContinue();
			logger.info("click on continue");
			
	}
	
	@Test(priority=4)
	public void TC_SF_005() {
		
		driver.get(baseURL);
		logger.info("URL is open.");
		
		List<WebElement> product=driver.findElements(By.xpath("//*[@id=\"content\"]/div[3]/div"));
		System.out.println(product.size());
		
		if(product.size() >1) {
			Assert.assertTrue(true);
			logger.info("Test pass");
		}else {
			Assert.assertTrue(false);
			logger.info("Test fail");
		}
	}
	
	
	
	
}
