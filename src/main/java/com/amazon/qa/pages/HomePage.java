package com.amazon.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.qa.base.TestBase;

public class HomePage extends TestBase
{

	@FindBy(xpath="//a[contains(text(),'Baby')]")
	WebElement babyLink;
	
	@FindBy(xpath="//a[text()='Amazon Pay']")
	WebElement payLink;
	
	//Initializing the pageObjects using constructor
	
	public HomePage()
	{
		PageFactory.initElements(driver,this);
	}
	
	//Creating Methods
	
	public String verifyHomePageTitle()
	{
		return driver.getTitle();
	}
	
	public BabyPage clickOnBabyLink()
	{
		babyLink.click();
		return new BabyPage();
	}
	
	public PayPage clickOnPayLink()
	{
		payLink.click();
		return new PayPage();
	}
}

