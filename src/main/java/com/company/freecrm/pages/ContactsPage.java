package com.company.freecrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.company.freecrm.testbase.Test_Base;

public class ContactsPage extends Test_Base {

	public ContactsPage()  {
		//super();
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//a [contains(text(), 'New Contact')]")
	WebElement linknewContact;
	@FindBy(xpath = "//select [@name='title' ]")
	WebElement selectTitle;
	@FindBy(xpath = "//input [@id='first_name']")
	WebElement firstName;
	@FindBy(xpath = "//input [@id='surname']")
	WebElement surName;
	@FindBy(xpath = "//div [@id='existingCampaignLayer']//input [@type='submit' and @ value='Save' ]")
	WebElement saveButton;

	public void getInfo(String title, String fName, String lName) {

		selectTitle.sendKeys(title);
		firstName.sendKeys(fName);
		surName.sendKeys(lName);
		saveButton.click();
	}
}
