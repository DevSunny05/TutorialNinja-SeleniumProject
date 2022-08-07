package com.tutorialsNinja.testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.tutorialsNinja.pageObject.LoginPage;

public class TC_LoginTest_002 extends BaseClass {

	@Test(priority = 0)
	public void TC_LF_001() {
		driver.get(baseURL);
		logger.info("URL is open");
		LoginPage lp = new LoginPage(driver);
		lp.setUserId(userId);
		logger.info("Enter user name");
		lp.setPassword(password);
		logger.info("Enter password");
		lp.clickLogin();
		logger.info("Click on login button.");

		if (driver.getTitle().equals("My Account")) {
			Assert.assertTrue(true);
			logger.info("Login test passed.");
		} else {
			Assert.assertTrue(false);
			logger.info("Login test failed.");
		}

		lp.clicklogout();
	}

	@Test(priority = 1)
	public void TC_LF_002() {
		driver.get(baseURL);
		logger.info("URL is open");
		LoginPage lp = new LoginPage(driver);
		lp.setUserId(userId1);
		logger.info("Enter user name");
		lp.setPassword(password1);
		logger.info("Enter password");
		lp.clickLogin();
		logger.info("Click on login button.");

		boolean warningMsg = driver.findElement(By.xpath(
				"//div[text()='  Warning: Your account has exceeded allowed number of login attempts. Please try again in 1 hour.']"))
				.isDisplayed();
		if (warningMsg == true) {
			Assert.assertTrue(true);
			logger.info("Login test passed.");
		} else {
			Assert.assertTrue(false);
			logger.info("Login test failed.");
		}

	}

	@Test(priority = 2)
	public void TC_LF_003() {
		driver.get(baseURL);
		logger.info("URL is open");
		LoginPage lp = new LoginPage(driver);
		lp.setUserId(userId1);
		logger.info("Enter user name");
		lp.setPassword(password);
		logger.info("Enter password");
		lp.clickLogin();
		logger.info("Click on login button.");

		boolean warningMsg = driver.findElement(By.xpath(
				"//div[text()=' Warning: Your account has exceeded allowed number of login attempts. Please try again in 1 hour.']"))
				.isDisplayed();
		if (warningMsg == true) {
			Assert.assertTrue(true);
			logger.info("Login test passed.");
		} else {
			Assert.assertTrue(false);
			logger.info("Login test failed.");
		}

//		
	}

	@Test(priority = 3)
	public void TC_LF_004() {
		driver.get(baseURL);
		logger.info("URL is open");
		LoginPage lp = new LoginPage(driver);
		lp.setUserId(userId);
		logger.info("Enter user name");
		lp.setPassword(password1);
		logger.info("Enter password");
		lp.clickLogin();
		logger.info("Click on login button.");

		boolean warningMsg = driver
				.findElement(By.xpath("//div[text()='  Warning: No match for E-Mail Address and/or Password.']"))
				.isDisplayed();
		if (warningMsg == true) {
			Assert.assertTrue(true);
			logger.info("Login test passed.");
		} else {
			Assert.assertTrue(false);
			logger.info("Login test failed.");
		}

	}

	@Test(priority = 4)
	public void TC_LF_005() {
		driver.get(baseURL);
		logger.info("URL is open");
		LoginPage lp = new LoginPage(driver);
		lp.setUserId(userId2);
		logger.info("Enter user name");
		lp.setPassword(password2);
		logger.info("Enter password");
		lp.clickLogin();
		logger.info("Click on login button.");

		boolean warningMsg = driver
				.findElement(By.xpath("//div[text()='Warning: No match for E-Mail Address and/or Password.']"))
				.isDisplayed();
		if (warningMsg == true) {
			Assert.assertTrue(true);
			logger.info("Login test passed.");
		} else {
			Assert.assertTrue(false);
			logger.info("Login test failed.");
		}

//		
	}

	@Test(priority = 5)
	public void TC_LF_006() {
		driver.get(baseURL);
		logger.info("URL is open");
		LoginPage lp = new LoginPage(driver);
		lp.forgotPassword();
		logger.info("click on forgot password.");

		if (driver.getTitle().equals("Forgot Your Password?")) {
			Assert.assertTrue(true);
			logger.info("Login test passed.");
		} else {
			Assert.assertTrue(false);
			logger.info("Login test failed.");
		}

	}

	@Test(priority = 6)
	public void TC_LF_007() {
		driver.get(baseURL);
		logger.info("URL is open");
		Actions action = new Actions(driver);
		LoginPage lp = new LoginPage(driver);
		lp.setUserId(userId);
		action.sendKeys(Keys.TAB);
		lp.setPassword(password);
		action.sendKeys(Keys.TAB);
		lp.clickLogin();

		if (driver.getTitle().equals("My Account")) {
			Assert.assertTrue(true);
			logger.info("Login test passed.");
		} else {
			Assert.assertTrue(false);
			logger.info("Login test failed.");
		}

		lp.clicklogout();
	}

	
	@Test(priority = 7)
	public void TC_LF_008() {
		driver.get(baseURL);
		logger.info("URL is open");
		
		LoginPage lp = new LoginPage(driver);
		String placeholder=lp.getAttributeUserId();
		System.out.println(placeholder);
		if(placeholder.isEmpty()) {
			Assert.assertFalse(true);
			logger.info("Login test pass");
		}else {
			Assert.assertFalse(false);
			logger.info("login tert fail");
		}
		
	}
	
	@Test(priority = 8)
	public void TC_LF_009() {
		driver.get(baseURL);
		logger.info("URL is open");
		LoginPage lp = new LoginPage(driver);
		lp.setUserId(userId);
		logger.info("Enter user name");
		lp.setPassword(password);
		logger.info("Enter password");
		lp.clickLogin();
		logger.info("Click on login button.");
		
		driver.navigate().back();
		
		
		String login=lp.getAttributeLogoutBtn();
		System.out.println(login);

		

		lp.clicklogout();
	}

}
