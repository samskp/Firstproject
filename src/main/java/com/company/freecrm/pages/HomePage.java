package com.company.freecrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.company.freecrm.testbase.Test_Base;

public class HomePage extends Test_Base{
	
	@FindBy(xpath = "//a [contains(text(), 'Contacts')]")  //a [@title='Contacts']
	WebElement linkContacts;
	@FindBy(xpath="//a [@title='New Contact']")
	WebElement newContactLink;
	
	public HomePage()  {
		//super();
		PageFactory.initElements(driver,this );
	}
			
	public ContactsPage  chkContact(){
		driver.switchTo().frame("mainpanel");
		linkContacts.click();
		return new ContactsPage();
	}
	
	public NewContactPage  newContactLink(){
		//driver.switchTo().frame("mainpanel");
		Actions action = new Actions(driver);
		action.moveToElement(linkContacts).build().perform();
		newContactLink.click();
		return new NewContactPage();
	}
}
