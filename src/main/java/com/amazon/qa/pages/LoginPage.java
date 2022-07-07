package com.amazon.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.qa.base.TestBase;

public class LoginPage extends TestBase {
	// Page Factory===OR
	@FindBy(xpath = "//a[@id='nav-link-accountList']")
	WebElement signInClick;

	@FindBy(xpath = "//input[@name='email']")
	WebElement username;

	@FindBy(xpath = "//input[@type='submit']")
	WebElement Continue;

	@FindBy(xpath = "//input[@name='password']")
	WebElement password;

	@FindBy(xpath = "//input[@id='signInSubmit']")
	WebElement signinBtn;

	@FindBy(xpath = "//span[@class='nav-sprite nav-logo-base']")
	WebElement amazonLogo;

	// Initializing the page Objects
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	// Actions
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}

	public boolean validateAmazonImage() {
		return amazonLogo.isDisplayed();

	}

	public HomePage login(String us, String pwd) {
		signInClick.click();
		username.sendKeys(us);
		Continue.click();
		password.sendKeys(pwd);
		signinBtn.click();
		return new HomePage();

	}
}