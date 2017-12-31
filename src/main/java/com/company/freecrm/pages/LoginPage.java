package com.company.freecrm.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.company.freecrm.testbase.Test_Base;

public class LoginPage extends Test_Base {

	public LoginPage() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "username")
	WebElement userName;

	@FindBy(name = "password")
	WebElement password;

	@FindBy(xpath = "//input[@value='Login' and @type='submit']")
	WebElement loginBtn;

	public HomePage loginWithValidCredentials(String uname, String pass) {
		userName.sendKeys(uname);
		password.sendKeys(pass);
		// loginBtn.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", loginBtn);
		return new HomePage();
	}

	/*public HomePage loginWithInvalidCredencials() {

		return null;
	}*/

}
