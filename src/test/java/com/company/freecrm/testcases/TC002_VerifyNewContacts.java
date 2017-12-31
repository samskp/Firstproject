package com.company.freecrm.testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.company.freecrm.pages.HomePage;
import com.company.freecrm.pages.LoginPage;
import com.company.freecrm.testbase.Test_Base;

public class TC002_VerifyNewContacts extends Test_Base {
	
	LoginPage objLoginPage;
	HomePage objHomePage;
	
	public TC002_VerifyNewContacts() {
		super();		
	}
	
	@BeforeMethod
	public void setup(){
		init();
		objLoginPage = new LoginPage();		
		objHomePage = objLoginPage.loginWithValidCredentials("samskp","pass123");
	}
	/*@Test
	public void verifyContacts() {
		
		System.out.println("now clicking on contacts");
		
		objHomePage.chkContact();
		
	}*/
	@Test
	public void verifyNewContacts(){
		objHomePage.newContactLink();
	}
	
	@AfterTest
	public void tearDown(){
		driver.quit();
	}
	
}
