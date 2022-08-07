package com.tutorialsNinja.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.tutorialsNinja.pageObject.LoginPage;
import com.tutorialsNinja.pageObject.LogoutPage;
import com.tutorialsNinja.utilities.XLUtils;

public class TC_LoginTestDD_002 extends BaseClass {

	@Test(dataProvider="LoginData")
	public void loginDDT(String uid, String pw) throws InterruptedException {
		
		driver.get(baseURL);
		LoginPage lp = new LoginPage(driver);

		lp.clickMyAccount();
		logger.info("click on my account");
		lp.loginDropDown();
		logger.info("click on login drop down");

		lp.setUserId(uid);
		logger.info("Enter usr id");
		lp.setPassword(pw);
		logger.info("Enter usr password");
		lp.clickLogin();
		logger.info("click login");
		
		Thread.sleep(3000);

		if (isWarning() == true) {
			driver.switchTo().defaultContent();
			Assert.assertTrue(false);
		} else {
			LogoutPage lo = new LogoutPage(driver);
			Assert.assertTrue(true);
			lo.logoutRightColumn();
			logger.info("click on logout");
			lo.clickContinue();
			logger.info("Click on continue");
			driver.switchTo().defaultContent();
			
		}
	}

	public boolean isWarning() {

		String warning = driver.findElement(By.xpath("//*[@id=\"account-login\"]/div[1]")).getText();
		if (warning.equals(" Warning: No match for E-Mail Address and/or Password.")) {
			return true;

		} else {
			return false;
		}

	}

	@DataProvider(name = "LoginData")
	String[][] getData() throws IOException {
		String path = System.getProperty("user.dir")
				+ "//src//test//java//com//tutorialsNinja//testData//LoginData.xlsx";

		int rownum = XLUtils.getRowCount(path, "Sheet1");
		int colcount = XLUtils.getCellCount(path, "Sheet1", rownum);

		String logindata[][] = new String[rownum][colcount];

		for (int i = 1; i <= rownum; i++) {
			for (int j = 0; j < colcount; j++) {
				logindata[i - 1][j] = XLUtils.getCellData(path, "Sheet1", i, j);
			}
		}
		return logindata;
	}
}
