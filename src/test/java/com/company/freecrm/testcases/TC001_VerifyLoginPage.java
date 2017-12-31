package com.company.freecrm.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.company.freecrm.pages.HomePage;
import com.company.freecrm.pages.LoginPage;
import com.company.freecrm.testbase.Test_Base;
import com.company.freecrm.util.TestUtil;
import com.company.freecrm.util.Xls_Reader;

public class TC001_VerifyLoginPage extends Test_Base {

	private  final String sheetName = "logindata";
	LoginPage objLoginPage;
	HomePage objHomePage;
	public TC001_VerifyLoginPage() {
		super();
	}

	@BeforeMethod
	public void setup() {
		init();
	}
	@DataProvider 
	public Object [][]  getLoginData(){
		Object [][] data = TestUtil.getTestData(sheetName);
		return data;
	}
	/*public String[][] getLoginData(){
		String[][] data = Xls_Reader.getCellData("logindata","A",1);
		return data;
	}*/
	/**/
	
	@Test(dataProvider="getLoginData")
	
	public void verifyLoginWithValidCredencials(String uid, String pwd) {
	
		objLoginPage = new LoginPage();
	
		objLoginPage.loginWithValidCredentials(uid , pwd );
	}

	/*
	 * @Test public void verifyLoginWithInvalidCredencials(){
	 * objLoginPage.loginWithInvalidCredencials(); }
	 */
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
