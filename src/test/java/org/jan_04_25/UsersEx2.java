package org.jan_04_25;

import org.testng.annotations.*;

public class UsersEx2 {

	@BeforeTest
	public void readQaEnvironmentDetails() {
		System.out.println("Read QA Environment Details");
	}
	@AfterTest
	public void closeClearQaObjectDetails() {
		System.out.println("Clear/Close QA Environment Details");
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

}
