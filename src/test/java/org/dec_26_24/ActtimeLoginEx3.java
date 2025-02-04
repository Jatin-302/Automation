package org.dec_26_24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.utilities.ConfigReader;
import org.utilities.GenericUtility;

import java.util.Properties;

public class ActtimeLoginEx3 {
    public static void main(String[] args) {
        System.out.println("** Program Starts **");

        ConfigReader cr = new ConfigReader();
        Properties prop = cr.getPropObj();

        /*String browserName = prop.getProperty("bName");
        String url = prop.getProperty("URL");
        String uName = prop.getProperty("uName");
        String pwd = prop.getProperty("pwd");*/

        GenericUtility gu = new GenericUtility();
        WebDriver driver = gu.startUp(prop.getProperty("bName"), prop.getProperty("URL"));

        driver.findElement(By.name("username")).sendKeys(prop.getProperty("uName"));
        driver.findElement(By.cssSelector(".textField.pwdfield")).sendKeys(prop.getProperty("pwd"));
        driver.findElement(By.cssSelector("#loginButton>div")).click();

        System.out.println("** Program Ends **");
    }

}
