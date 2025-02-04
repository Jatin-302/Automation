package org.jan_04_25;

import org.testng.annotations.*;

public class AccountsEx1 {

	@BeforeMethod
	public void login() {
		System.out.println("** Login **");
	}
	@AfterMethod
	public void logout() {
		System.out.println("** Logout **");
	}

	//global object		//null
	@BeforeClass
	public void readAccountsTestData() {
		System.out.println("** Reading ACCOUNTS Test Data **");
		//fis
		//wb
		//sheet
	}
	@AfterClass
	public void clearAccountsTestData() {
		System.out.println("** Clear/Close ACCOUNTS Test Data **");
		//wb.close()
		//fis.close()
	}

	@Test
	public void addAccount() {
		System.out.println("Add Account");
	}
	@Test
	public void updateAccount() {
		System.out.println("Update Account");
	}
	@Test
	public void deleteAccount() {
		System.out.println("Delete Account");
	}
}
