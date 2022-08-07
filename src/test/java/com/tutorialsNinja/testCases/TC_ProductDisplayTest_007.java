package com.tutorialsNinja.testCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.tutorialsNinja.pageObject.ProductDisplayPage;
import com.tutorialsNinja.pageObject.SearchPage;

public class TC_ProductDisplayTest_007 extends BaseClass {
	
	@Test(priority=0)
	public void TC_002_DP() {
		driver.get(baseURL);
		logger.info("URL is open.");
		
		SearchPage sp=new SearchPage(driver);
		sp.searchProduct("iMac");
		sp.clickSearchIcon();
		
		ProductDisplayPage pdp=new ProductDisplayPage(driver);
		pdp.clickDisplayProduct();
		
		String name=driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div[2]/h1")).getText();
		Assert.assertEquals(name, "iMac");
		logger.info("test pass.");
		
	}
	
	@Test(priority=1)
	public void TC_003_DP() {
		driver.get(baseURL);
		logger.info("URL is open.");
		
		SearchPage sp=new SearchPage(driver);
		sp.searchProduct("iMac");
		sp.clickSearchIcon();
		
		ProductDisplayPage pdp=new ProductDisplayPage(driver);
		pdp.clickDisplayProduct();
		
		String name=driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div[2]/ul[1]/li[3]")).getText();
		System.out.println(name);
		if(name.equals("Availability: Out Of Stock")) {
			Assert.assertTrue(true);
		}else if(name.equals("Availability: Available")) {
			Assert.assertTrue(true);
		}else {
			Assert.assertTrue(false);
		}
		
		
	}
	
	@Test(priority=2)
	public void TC_004_DP() {
		driver.get(baseURL);
		logger.info("URL is open.");
		
		SearchPage sp=new SearchPage(driver);
		sp.searchProduct("iMac");
		sp.clickSearchIcon();
		
		ProductDisplayPage pdp=new ProductDisplayPage(driver);
		pdp.clickDisplayProduct();
		
		String price=driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div[2]/ul[2]/li[1]/h2")).getText();
		String priceWithoutTax=driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div[2]/ul[2]/li[2]")).getText();
		System.out.println(price);
		System.out.println(priceWithoutTax);
		if(price.equals("$122.00") && priceWithoutTax.equals("Ex Tax: $100.00")) {
			Assert.assertTrue(true);
		}else {
			Assert.assertTrue(false);
		}
		
		
	}
	
	@Test(priority=3)
	public void TC_005_DP() {
		driver.get(baseURL);
		logger.info("URL is open.");
		
		SearchPage sp=new SearchPage(driver);
		sp.searchProduct("iMac");
		sp.clickSearchIcon();
		
		ProductDisplayPage pdp=new ProductDisplayPage(driver);
		pdp.clickDisplayProduct();
		
		String quantity=driver.findElement(By.xpath("//*[@id='input-quantity']")).getAttribute("value");
		System.out.println(quantity);
		if(quantity.equals("1")) {
			Assert.assertTrue(true);
		}else {
			Assert.assertTrue(false);
		}
		
		pdp.clearProductQuantity();
		pdp.productQuantity("2");
		System.out.println(quantity);
		
		pdp.addToCart();
		
		String successMsg=driver.findElement(By.xpath("//*[@id=\"product-product\"]/div[1]")).getText();
		if(successMsg.equals("Success: You have added iMac to your shopping cart!")) {
			Assert.assertTrue(true);
		}
		
	}
	
	@Test(priority=4)
	public void TC_006_DP() {
		driver.get(baseURL);
		logger.info("URL is open.");
		
		SearchPage sp=new SearchPage(driver);
		sp.searchProduct("iMac");
		logger.info("product add to search box");
		sp.clickSearchIcon();
		logger.info("click on search.");
		
		ProductDisplayPage pdp=new ProductDisplayPage(driver);
		pdp.clickDisplayProduct();
		logger.info("click on product display.");
		
		String quantity=driver.findElement(By.xpath("//*[@id='input-quantity']")).getAttribute("value");
		
		
		pdp.clearProductQuantity();
		logger.info("clear quantity.");
		pdp.productQuantity("-1");
		logger.info("add quantity");
		System.out.println(quantity);
		
		pdp.addToCart();
		logger.info("add to cart");
		
		String successMsg=driver.findElement(By.xpath("//*[@id=\"product-product\"]/div[1]")).getText();
		if(successMsg.equals("Success: You have added iMac to your shopping cart!")) {
			Assert.assertTrue(true);
			logger.info("test pass");
		}
		
	}

}
