package org.jan_03_25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.utilities.ConfigReader;
import org.utilities.GenericUtility;

import java.util.Properties;

public class With_AnnotationsTC {
    WebDriver driver;           //global object
    Properties prop;

    @BeforeMethod
    public void initBrowser() {
        //Read the Properties file
        ConfigReader cr = new ConfigReader();
        prop = cr.getPropObj();

        //Launch the browser & URL
        GenericUtility gu = new GenericUtility();
        driver = gu.startUp(prop.getProperty("bName"), prop.getProperty("URL"));
    }
    @AfterMethod
    public void closeBrowser() {
        //close the browser
        driver.quit();
    }
    @Test
    public void verifyLoginPageTitle() {
        //get the actual title
        String actTitle = driver.getTitle();
        //verify the title
        String expTitle = "actiTIME - Login";
        if(expTitle.equals(actTitle)) {
            System.out.println("Login title is as expected.");
        } else {
            System.out.println("Login title is NOT as expected.");
        }
    }
    @Test
    public void verifyLoginPageURL() {
        //get the actual URL
        String actURL = driver.getCurrentUrl();
        //verify the title
        String expURL = "http://localhost:93/login.do";
        if(expURL.equals(actURL)) {
            System.out.println("Login URL is as expected.");
        } else {
            System.out.println("Login URL is NOT as expected.");
        }
    }
    @Test
    public void verifyLoginFunctionality() {
        //Enter user name
        driver.findElement(By.id("username")).sendKeys(prop.getProperty("uName"));
        //Enter password
        driver.findElement(By.cssSelector(".textField.pwdfield")).sendKeys(prop.getProperty("pwd"));
        //Click on login button
        driver.findElement(By.cssSelector("#loginButton>div")).click();

        //verify dashboard page is displayed
        //way 1:
        WebElement ttTab = driver.findElement(By.xpath("//a[@class='content selected tt']/div[text()='TIME-TRACK']"));
        if(ttTab.isDisplayed()) {
            System.out.println("Dashboard page is displayed.");
        } else {
            System.out.println("Dashboard page is NOT displayed.");
        }
        //way 2:
        /*List<WebElement> ttTab = driver.findElements(By.xpath("//a[@class='content selected tt']/div[text()='TIME-TRACK']"));
        if(!ttTab.isEmpty()) {
            System.out.println("Dashboard page is displayed.");
        } else {
            System.out.println("Dashboard page is NOT displayed.");
        }*/

        //logout
        driver.findElement(By.id("logoutLink")).click();
    }
}
