package org.dec_26_24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.utilities.ConfigReader;
import org.utilities.GenericUtility;

import java.io.FileInputStream;
import java.util.Properties;

public class ActtimeLoginEx2 {
    public static void main(String[] args) {
        System.out.println("** Program Starts **");

        ConfigReader cr = new ConfigReader();

        String browserName = cr.getPropData("bName");
        String url = cr.getPropData("URL");
        String uName = cr.getPropData("uName");
        String pwd = cr.getPropData("pwd");

        GenericUtility gu = new GenericUtility();
        WebDriver driver = gu.startUp(browserName, url);

        driver.findElement(By.id("username")).sendKeys(uName);
        driver.findElement(By.cssSelector(".textField.pwdfield")).sendKeys(pwd);
        driver.findElement(By.cssSelector("#loginButton>div")).click();

        System.out.println("** Program Ends **");
    }

}
