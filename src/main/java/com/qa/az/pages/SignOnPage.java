package com.qa.az.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.az.base.TestBase;

public class SignOnPage extends TestBase{
	
	//PageFactory-OR
	@FindBy(name="userName")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//input[@name='submit']")
	WebElement submitBtn;
	
	//PageFactory Initilization:
	public SignOnPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//Action Methods:
	public String validateSignOnPageTitle()
	{
		return driver.getTitle();
	}
	
	public HomePage login(String un, String pwd)
	{
		username.sendKeys(un);
		password.sendKeys(pwd);
		submitBtn.click();
		
		return new HomePage();
	}

}
