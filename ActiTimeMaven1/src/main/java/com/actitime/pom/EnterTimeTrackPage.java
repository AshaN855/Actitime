package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnterTimeTrackPage 
{
	//declaration
	@FindBy(xpath = "//a[@class='content tasks']")
	private WebElement tasksTab;
	
	@FindBy (id  = "logoutLink")
	private WebElement logoutLink;
	
	//initialization
	public EnterTimeTrackPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	//utility methods
	public WebElement getTasksTab() {
		return tasksTab;
	}

	public WebElement getLogoutLink() {
		return logoutLink;
	}
}
