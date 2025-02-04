package org.dec_26_24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.utilities.GenericUtility;

import java.io.FileInputStream;
import java.util.Properties;

public class ActtimeLoginEx1 {
    public static void main(String[] args) {
        System.out.println("** Program Starts **");
        try {
            FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\ConfigurationDetails\\Config.properties");
            Properties prop = new Properties();
            prop.load(fis);
            String browserName = prop.getProperty("bName");
            System.out.println("browserName : " + browserName);

            String url = prop.getProperty("URL");
            System.out.println("URL : " + url);

            String uName = prop.getProperty("uName");
            System.out.println("UserName : " + uName);

            String pwd = prop.getProperty("pwd");
            System.out.println("Password : " + pwd);

            GenericUtility gu = new GenericUtility();
            WebDriver driver = gu.startUp(browserName, url);

            driver.findElement(By.id("username")).sendKeys(uName);
            driver.findElement(By.cssSelector(".textField.pwdfield")).sendKeys(pwd);
            driver.findElement(By.cssSelector("#loginButton>div")).click();

        } catch(Exception e) {
            e.printStackTrace();
        }
        System.out.println("** Program Ends **");
    }

}
