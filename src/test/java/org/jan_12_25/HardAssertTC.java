package org.jan_12_25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.utilities.ConfigReader;
import org.utilities.GenericUtility;

import java.util.Properties;

public class HardAssertTC {
    WebDriver driver;
    Properties prop;

    @BeforeMethod
    public void initBrowser() {
        ConfigReader cr = new ConfigReader();
        prop = cr.getPropObj();
        GenericUtility gu = new GenericUtility();
        driver = gu.startUp(prop.getProperty("bName"), prop.getProperty("URL"));
    }
    @AfterMethod
    public void closeBrowser() {
        driver.quit();
    }
    @Test
    public void verifyLoginPageTitle() {
        System.out.println("Login Page title test case started.");
        String actTitle = driver.getTitle();
        String expTitle = "actiTIME - Login123";
        Assert.assertEquals(actTitle, expTitle, "Login title is changed.");
        /*if(expTitle.equals(actTitle)) {
            System.out.println("Login title is as expected.");
        } else {
            System.out.println("Login title is NOT as expected.");
        }*/
        System.out.println("Login Page title test case executed.");
    }
    @Test
    public void verifyLoginPageURL() {
        System.out.println("Login Page URL test case started.");
        String actURL = driver.getCurrentUrl();
        String expURL = "http://localhost:93/login.do";
        Assert.assertEquals(actURL, expURL, "Login URL is changed.");
        /*if(expURL.equals(actURL)) {
            System.out.println("Login URL is as expected.");
        } else {
            System.out.println("Login URL is NOT as expected.");
        }*/
        System.out.println("Login Page URL test case executed.");
    }
    @Test
    public void verifyLoginFunctionality() {
        System.out.println("Login functionality test case started.");
        driver.findElement(By.id("username")).sendKeys(prop.getProperty("uName"));
        driver.findElement(By.cssSelector(".textField.pwdfield")).sendKeys(prop.getProperty("pwd"));
        driver.findElement(By.cssSelector("#loginButton>div")).click();
        WebElement ttTab = driver.findElement(By.xpath("//a[@class='content selected tt']/div[text()='TIME-TRACK']"));
        Assert.assertTrue(ttTab.isDisplayed(), "Time-Track tab is not displayed.");
        /*if(ttTab.isDisplayed()) {
            System.out.println("Dashboard page is displayed.");
        } else {
            System.out.println("Dashboard page is NOT displayed.");
        }*/
        driver.findElement(By.id("logoutLink")).click();
        System.out.println("Login functionality test case executed.");
    }
}
