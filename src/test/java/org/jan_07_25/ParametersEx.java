package org.jan_07_25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.utilities.ConfigReader;
import org.utilities.GenericUtility;

import java.util.Properties;

public class ParametersEx {

    @Parameters({"username","password"})
    @Test
    public void verifyLoginFunctionality(String uName, String pwd) {
        ConfigReader cr = new ConfigReader();
        Properties prop = cr.getPropObj();
        GenericUtility gu = new GenericUtility();
        WebDriver driver = gu.startUp(prop.getProperty("bName"), prop.getProperty("URL"));
        driver.findElement(By.id("username")).sendKeys(uName);
        driver.findElement(By.cssSelector(".textField.pwdfield")).sendKeys(pwd);
        driver.findElement(By.cssSelector("#loginButton>div")).click();
        WebElement ttTab = driver.findElement(By.xpath("//a[@class='content selected tt']/div[text()='TIME-TRACK']"));
        if(ttTab.isDisplayed()) {
            Reporter.log("Dashboard page is displayed.");
        } else {
            Reporter.log("Dashboard page is NOT displayed.");
        }
        driver.findElement(By.id("logoutLink")).click();
        driver.quit();
    }
}
