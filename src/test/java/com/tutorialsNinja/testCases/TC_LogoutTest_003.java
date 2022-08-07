package com.tutorialsNinja.testCases;

import org.openqa.selenium.By;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.tutorialsNinja.pageObject.LoginPage;
import com.tutorialsNinja.pageObject.LogoutPage;

public class TC_LogoutTest_003 extends BaseClass {

//	@Test(priority=0)
	public void TC_LO_001() throws InterruptedException {

		driver.get(baseURL);
		logger.info("URL is open");
		LoginPage lp = new LoginPage(driver);
		lp.setUserId(userId);
		logger.info("Enter user name");
		lp.setPassword(password);
		logger.info("Enter password");
		lp.clickLogin();
		logger.info("Click on login button.");

		LogoutPage lop = new LogoutPage(driver);

		Thread.sleep(2000);
		lop.clickMyAccount();
		logger.info("click on myAccount");
		Thread.sleep(2000);
		lop.clickLogout();
		logger.info("click on logout");

		lop.clickContinue();
		logger.info("click on continue button");

		if (driver.getTitle().equals("Your Store")) {
			Assert.assertTrue(true);
			logger.info("Login test passed.");
		} else {
			Assert.assertTrue(false);
			logger.info("Login test failed.");
		}

	}

//	@Test(priority=1)
	public void TC_LO_002() throws InterruptedException {

		driver.get(baseURL);
		logger.info("URL is open");
		LoginPage lp = new LoginPage(driver);
		lp.setUserId(userId);
		logger.info("Enter user name");
		lp.setPassword(password);
		logger.info("Enter password");
		lp.clickLogin();
		logger.info("Click on login button.");

		LogoutPage lop = new LogoutPage(driver);
		logger.info("Click on logout button");

		String logout = driver.findElement(By.xpath("//*[contains(text(),'Logout')][@class='list-group-item']"))
				.getText();
		System.out.println(logout);

		lop.logoutRightColumn();

		lop.clickContinue();
		logger.info("click on continue button");

		if (driver.getTitle().equals("Your Store")) {
			Assert.assertTrue(true);
			logger.info("Login test passed.");
		} else {
			Assert.assertTrue(false);
			logger.info("Login test failed.");
		}

	}

//	@Test(priority=2)
	public void TC_LO_003() throws InterruptedException {

		driver.get(baseURL);
		logger.info("URL is open");
		LoginPage lp = new LoginPage(driver);
		lp.setUserId(userId);
		logger.info("Enter user name");
		lp.setPassword(password);
		logger.info("Enter password");
		lp.clickLogin();
		logger.info("Click on login button.");

		driver.close();
		logger.info("browser close.");

		driver.get(baseURL);
		logger.info("URL is open");

		LogoutPage lop = new LogoutPage(driver);

		String logout = driver.findElement(By.xpath("//*[contains(text(),'Logout')][@class='list-group-item']"))
				.getText();
//		System.out.println(logout);

		if (logout == "Logout") {
			Assert.assertTrue(true);
			logger.info("Login test passed.");
		} else {
			Assert.assertTrue(false);
			logger.info("Login test failed.");
		}

	}

//	@Test(priority=3)
	public void TC_LO_004() throws InterruptedException {

		driver.get(baseURL);
		logger.info("URL is open");
		LoginPage lp = new LoginPage(driver);
		lp.setUserId(userId);
		logger.info("Enter user name");
		lp.setPassword(password);
		logger.info("Enter password");
		lp.clickLogin();
		logger.info("Click on login button.");

		LogoutPage lop = new LogoutPage(driver);

		Thread.sleep(2000);
		lop.clickMyAccount();
		logger.info("click on myAccount");
		Thread.sleep(2000);
		lop.clickLogout();
		logger.info("click on logout");

		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		String logout = driver.findElement(By.xpath("//*[contains(text(),'Logout')][@class='list-group-item']"))
				.getText();

//		lop.clickContinue();
//		logger.info("click on continue button");

		if (logout == "Logout") {
			Assert.assertFalse(true);
			logger.info("Login test fail.");
		} else {
			Assert.assertFalse(false);
			logger.info("Login test pass.");
		}

	}

	@Test(priority = 4)
	public void TC_LO_005() throws InterruptedException {

		driver.get(baseURL);
		logger.info("URL is open");
		LoginPage lp = new LoginPage(driver);

		lp.clickMyAccount();
		logger.info("click on myAccount");

		String login = driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a")).getText();
		System.out.println(login);

		Thread.sleep(2000);

		Assert.assertEquals(login, "Login");
		logger.info("Login test pass.");

	}
	
	@Test(priority = 5)
	public void TC_LO_006() throws InterruptedException {

		driver.get(baseURL);
		logger.info("URL is open");
		LoginPage lp = new LoginPage(driver);

		
		String login = driver.findElement(By.xpath("//*[@class='list-group-item'][contains(text(),'Login')]")).getText();
		System.out.println(login);

		Thread.sleep(2000);

		Assert.assertEquals(login, "Login");
		logger.info("Login test pass.");

	}
	
	@Test(priority = 6)
	public void TC_LO_007() throws InterruptedException {

		driver.get(baseURL);
		logger.info("URL is open");
		LoginPage lp = new LoginPage(driver);

		
		String login = driver.findElement(By.xpath("//*[@class='list-group-item'][contains(text(),'Login')]")).getText();
		System.out.println(login);

		Thread.sleep(2000);

		Assert.assertEquals(login, "Login");
		logger.info("Login test pass.");

	}
	

	@Test(priority = 7)
	public void TC_LO_009() throws InterruptedException {

		driver.get(baseURL);
		logger.info("URL is open");
		LoginPage lp = new LoginPage(driver);
		
		lp.setUserId(userId);
		logger.info("Enter user name");
		lp.setPassword(password);
		logger.info("Enter password");
		lp.clickLogin();
		logger.info("Click on login button.");

		LogoutPage lop = new LogoutPage(driver);

		Thread.sleep(2000);
		lop.clickMyAccount();
		logger.info("click on myAccount");
		Thread.sleep(2000);
		lop.clickLogout();
		logger.info("click on logout");

		lop.clickContinue();
		logger.info("click on continue button");
		
		
		lp.clickMyAccount();
		lp.loginDropDown();
		
		
		lp.setUserId(userId);
		logger.info("Enter user name");
		lp.setPassword(password);
		logger.info("Enter password");
		lp.clickLogin();
		logger.info("Click on login button.");

		
		String login = driver.findElement(By.xpath("//*[@class='list-group-item'][contains(text(),'Login')]")).getText();
		System.out.println(login);

		Thread.sleep(2000);

		Assert.assertEquals(login, "Login");
		logger.info("Login test pass.");

	}
	
	
	

}
