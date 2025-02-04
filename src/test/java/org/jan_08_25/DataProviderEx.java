package org.jan_08_25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.utilities.GenericUtility;

class Parent1 {
    @DataProvider
    public Object[][] getLoginCredentials() {
        Object[][] ar = new Object[4][2];

        ar[0][0] = "admin";		//1st row
        ar[0][1] = "manager";

        ar[1][0] = "admin123";	//2nd row
        ar[1][1] = "manager";

        ar[2][0] = "admin";		//3rd row
        ar[2][1] = "manager123";

        ar[3][0] = "admin123";	//4th row
        ar[3][1] = "manager123";

        return ar;
    }
}
public class DataProviderEx extends Parent1 {
    /*@DataProvider
    public Object[][] getLoginCredentials() {
        Object[][] ar = new Object[4][2];

        ar[0][0] = "admin";		//1st row
        ar[0][1] = "manager";

        ar[1][0] = "admin123";	//2nd row
        ar[1][1] = "manager";

        ar[2][0] = "admin";		//3rd row
        ar[2][1] = "manager123";

        ar[3][0] = "admin123";	//4th row
        ar[3][1] = "manager123";

        return ar;
    }*/

    @Test(dataProvider = "getLoginCredentials")
    public void loginTC(String uName, String pwd) {
        System.out.println("** Program Starts **");
        GenericUtility gu = new GenericUtility();
        WebDriver driver = gu.startUp("ch","http://localhost:93/login.do");
        driver.findElement(By.id("username")).sendKeys(uName);
        driver.findElement(By.cssSelector(".textField.pwdfield")).sendKeys(pwd);
        driver.findElement(By.cssSelector("#loginButton>div")).click();
        gu.waitForVisibilityByType(driver,30,"id","logoutLink");
        driver.findElement(By.id("logoutLink")).click();
        driver.quit();
        System.out.println("** Program Ends **");
    }
}
