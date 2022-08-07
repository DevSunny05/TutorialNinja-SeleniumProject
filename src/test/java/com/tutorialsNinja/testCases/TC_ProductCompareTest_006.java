package com.tutorialsNinja.testCases;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.tutorialsNinja.pageObject.ProductComparePage;
import com.tutorialsNinja.pageObject.SearchPage;

public class TC_ProductCompareTest_006 extends BaseClass {

	@Test(priority=0)
	public void TC_PC_001() throws InterruptedException {
		driver.get(baseURL);
		logger.info("URL is open.");
		
		SearchPage sp= new SearchPage(driver);
		sp.searchProduct("iMac");
		logger.info("enter product into search icon");
		sp.clickSearchIcon();
		logger.info("click on search icon");
		
		ProductComparePage pcp= new ProductComparePage(driver);
		pcp.clickCompareProduct();
		logger.info("click on product compare button.");
		Thread.sleep(2000);
		pcp.clickProductCompareLink();
		logger.info("click on product compare link.");
		
		String text= driver.findElement(By.xpath("//*[@id=\"content\"]/h1")).getText();
		System.out.println(text);
		
		Assert.assertEquals(text, "Product Comparison");
		logger.info(".......................test pass............................");
		
		
	}
	
	@Test(priority=1)
	public void TC_PC_002() throws InterruptedException {
		driver.get(baseURL);
		logger.info("URL is open.");
		
		SearchPage sp= new SearchPage(driver);
		sp.searchProduct("iMac");
		logger.info("enter product into search icon");
		sp.clickSearchIcon();
		logger.info("click on search icon");
		
		ProductComparePage pcp= new ProductComparePage(driver);
		pcp.clickListOption();
		pcp.clickCompareProduct();
		logger.info("click on product compare button.");
		Thread.sleep(2000);
		pcp.clickProductCompareLink();
		logger.info("click on product compare link.");
		
		String text= driver.findElement(By.xpath("//*[@id=\"content\"]/h1")).getText();
		System.out.println(text);
		
		Assert.assertEquals(text, "Product Comparison");
		logger.info(".......................test pass............................");
		
		
	}
	

	@Test(priority=2)
	public void TC_PC_003() throws InterruptedException {
		driver.get(baseURL);
		logger.info("URL is open.");
		
		SearchPage sp= new SearchPage(driver);
		sp.searchProduct("iMac");
		logger.info("enter product into search icon");
		sp.clickSearchIcon();
		logger.info("click on search icon");
		
		ProductComparePage pcp= new ProductComparePage(driver);
		pcp.clickGridOption();
		pcp.clickCompareProduct();
		logger.info("click on product compare button.");
		Thread.sleep(2000);
		pcp.clickProductCompareLink();
		logger.info("click on product compare link.");
		
		String text= driver.findElement(By.xpath("//*[@id=\"content\"]/h1")).getText();
		System.out.println(text);
		
		Assert.assertEquals(text, "Product Comparison");
		logger.info(".......................test pass............................");
		
		
	}
	
	@Test(priority=3)
	public void TC_PC_004() throws InterruptedException {
		driver.get(baseURL);
		logger.info("URL is open.");
		
		
		
		ProductComparePage pcp= new ProductComparePage(driver);
		
		pcp.clickDesktop();
		logger.info("click on desktop.");
		pcp.clickShowAllDesktop();
		logger.info("click on show all desktop.");
		pcp.clickListOption();
		logger.info("select list option.");
		pcp.clickCompareProduct();
		logger.info("click on product compare button.");
		Thread.sleep(2000);
		pcp.clickProductCompareLink();
		logger.info("click on product compare link.");
		
		String text= driver.findElement(By.xpath("//*[@id=\"content\"]/h1")).getText();
		System.out.println(text);
		
		Assert.assertEquals(text, "Product Comparison");
		logger.info(".......................test pass............................");
		
		
	}
	
	@Test(priority=4)
	public void TC_PC_005() throws InterruptedException {
		driver.get(baseURL);
		logger.info("URL is open.");
		
		
		
		ProductComparePage pcp= new ProductComparePage(driver);
		
		pcp.clickDesktop();
		logger.info("click on desktop.");
		pcp.clickShowAllDesktop();
		logger.info("click on show all desktop.");
		pcp.clickGridOption();
		logger.info("select grid option.");
		pcp.clickCompareProduct();
		logger.info("click on product compare button.");
		Thread.sleep(2000);
		pcp.clickProductCompareLink();
		logger.info("click on product compare link.");
		
		String text= driver.findElement(By.xpath("//*[@id=\"content\"]/h1")).getText();
		System.out.println(text);
		
		Assert.assertEquals(text, "Product Comparison");
		logger.info(".......................test pass............................");
		
		
	}
}
