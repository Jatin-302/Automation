package org.basicPrograms2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.utilities.GenericUtility;

import java.time.Duration;

public class ExplicitWaitEx1 {
    public static void main(String[] args) {
        String bName = "ch";
        String url = "http://localhost:93/login.do";
        GenericUtility gu = new GenericUtility();
        WebDriver driver = gu.startUp(bName, url);
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.cssSelector(".textField.pwdfield")).sendKeys("manager");
        driver.findElement(By.cssSelector("#loginButton>div")).click();

        //WebElement logoutEle = driver.findElement(By.id("logoutLink"));

        WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(10));
        wt.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("logoutLink"))));


        driver.findElement(By.id("logoutLink")).click();

        System.out.println("** Program Ends **");
    }

}
