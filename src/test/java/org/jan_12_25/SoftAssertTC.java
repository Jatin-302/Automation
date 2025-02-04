package org.jan_12_25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.utilities.ConfigReader;
import org.utilities.GenericUtility;

import java.util.Properties;

public class SoftAssertTC {

    @Test
    public void verifyLoginPageTitle() {
        System.out.println("Test Case started.");
        int a = 10, b= 20;
        int sum = a+b;
        ConfigReader cr = new ConfigReader();
        Properties prop = cr.getPropObj();
        GenericUtility gu = new GenericUtility();
        WebDriver driver = gu.startUp(prop.getProperty("bName"), prop.getProperty("URL"));
        System.out.println("Login Page Title & URL test case started.");
        SoftAssert sa = new SoftAssert();
        String actTitle = driver.getTitle();
        String expTitle = "actiTIME - Login123";
        sa.assertEquals(actTitle, expTitle, "Login title is changed.");
        /*if(expTitle.equals(actTitle)) {
            System.out.println("Login title is as expected.");
        } else {
            System.out.println("Login title is NOT as expected.");
        }*/

        String actURL = driver.getCurrentUrl();
        String expURL = "http://localhost:93/login.do123";
        sa.assertEquals(actURL, expURL, "Login URL is changed.");
        driver.quit();
        sa.assertAll();
        /*if(expURL.equals(actURL)) {
            System.out.println("Login URL is as expected.");
        } else {
            System.out.println("Login URL is NOT as expected.");
        }*/
        System.out.println("Login Page Title & URL test case executed.");
    }
}
