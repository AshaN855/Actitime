package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy (name = "username")
	private WebElement unTextBox;
	
	@FindBy (name = "pwd")
	private WebElement pwdTextBox;
	
	@FindBy (xpath = "//a[@id='loginButton']")
	private WebElement loginBtn;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);	
	}
	
	public void setUserName(String un) {
		unTextBox.sendKeys(un);
	}
	public void setPassWord(String pw) {
		pwdTextBox.sendKeys(pw);
	}
	public void clickOnLogin()
	{
		loginBtn.click();
	}
}
