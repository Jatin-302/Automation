package org.jan_04_25;

import org.testng.annotations.*;

public class UsersEx1 {
	@BeforeSuite
	public void init() {
		System.out.println("Initialize Global Objects");
	}
	@AfterSuite
	public void tearDown() {
		System.out.println("Close/Clear Global Objects");
	}
	@Test
	public void addUser() {
		System.out.println("Add User");
	}
	@Test
	public void updateUser() {
		System.out.println("Update User");
	}
	@Test
	public void deleteUser() {
		System.out.println("Delete User");
	}

	@BeforeClass
	public void readUsersTestData() {
		System.out.println("** Reading USERS Test Data **");
		//fis
		//wb
		//sheet
	}
	@AfterClass
	public void clearUsersTestData() {
		System.out.println("** Clear/Close USERS Test Data **");
		//wb.close()
		//fis.close()
	}
}
