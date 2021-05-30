package com.qa.az.testCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.az.base.TestBase;
import com.qa.az.pages.HomePage;
import com.qa.az.pages.SignOnPage;

public class SignOnPageTest extends TestBase{
	
	SignOnPage sp;
	HomePage homePage;
	
	public SignOnPageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setUp()
	{
		initilization();
		 sp=new SignOnPage();
	}
	
	@Test(priority = 1)
	public void validateSignOnPageTitleTest()
	{
		String title=sp.validateSignOnPageTitle();
		Assert.assertEquals(title, "Welcome: Mercury Tours");
	}
	
	@Test(priority = 2)
	public void loginTest()
	{
		homePage=sp.login(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		if(driver!=null)
		{
			driver.quit();
		}
	}

}
