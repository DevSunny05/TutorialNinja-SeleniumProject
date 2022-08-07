package com.tutorialsNinja.testCases;

import java.io.*;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.tutorialsNinja.utilities.ReadConfig;


public class BaseClass {
	
	ReadConfig readconfig=new ReadConfig();
	
	public String baseURL=readconfig.getApplicationURL();
	public String userId=readconfig.getUserId();
	public String userId1=readconfig.getUserId1();
	public String userId2=readconfig.getUserId2();
	public String password=readconfig.getPassword();
	public String password1=readconfig.getPassword1();
	public String password2=readconfig.getPassword2();
	public static WebDriver driver;
	public static Logger logger;
	
	@Parameters("browser")
	@BeforeTest
	public void setup(String br) {
		
		logger=Logger.getLogger("TutorialsNinja");
		PropertyConfigurator.configure("Log4j.properties");
		
		if(br.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",readconfig.getChromePath());
			driver=new ChromeDriver();
		}else if(br.equals("edge")) {
			System.setProperty("webdriver.edge.driver", readconfig.getEdgePath());
			driver=new EdgeDriver();
		}
		
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@AfterTest
	public void tearDown() {
		driver.close();
		
		
	}
	
	public void captureScreenShoot(WebDriver driver, String tname) {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File target=new File(System.getProperty("user.dir")+"/Screenshots/"+tname+".png");
//		FileUtils.copyFile(source,target);
		System.out.println("Screeenshot taken....");
		
	}
	
	
	
	
	
	
	
	
	

}
