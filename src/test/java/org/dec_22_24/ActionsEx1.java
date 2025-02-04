package org.dec_22_24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.utilities.GenericUtility;

public class ActionsEx1 {
    public static void main(String[] args) {
        System.out.println("** Program Starts **");
        String bName = "ff";
        String url = "http://localhost:82/login.do";
        GenericUtility gu = new GenericUtility();
        WebDriver driver = gu.startUp(bName, url);

        WebElement userNameField = driver.findElement(By.id("username"));

        Actions act = new Actions(driver);
        act.sendKeys(userNameField, "admin").perform();

        WebElement pwdField = driver.findElement(By.cssSelector(".textField.pwdfield"));
        act.sendKeys(pwdField, "manager").perform();

        WebElement loginBtn = driver.findElement(By.cssSelector("#loginButton>div"));
        act.click(loginBtn).perform();

        System.out.println("** Program Ends **");
    }
}
