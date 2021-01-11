package com.actitime.generics;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.actitime.pom.LoginPage;

public class BaseClass {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static WebDriver driver;
	public FileLib f=new FileLib();
	public WebDriverCommonLib w=new WebDriverCommonLib();
	
	@BeforeTest
	public void openBrowser() throws IOException
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		w.implicitWait(driver);
	}
	
	@BeforeMethod
	public void login() throws IOException
	{
		LoginPage l=new LoginPage(driver);
		driver.get(f.getPropertyValue("url"));
		l.setUserName(f.getPropertyValue("username"));
		l.setPassWord(f.getPropertyValue("password"));
		l.clickOnLogin();
	}
	
//	@AfterMethod
//	public void logout()
//	{
//		l.clickOnLogout();
//	}
	
	@AfterTest
	public void closeBrowser()
	{
		driver.close();
	}
}
