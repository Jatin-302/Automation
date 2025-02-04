package org.dec_10_24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.utilities.GenericUtility;

import java.time.Duration;

public class FluentEaitEx1 {
    public static void main(String[] args) {
        String bName = "ff";
        String url = "http://localhost:82/login.do";
        GenericUtility gu = new GenericUtility();
        WebDriver driver = gu.startUp(bName, url);
        driver.findElement(By.name("username")).sendKeys("admin");
        driver.findElement(By.name("pwd")).sendKeys("manager");
        driver.findElement(By.id("loginButton")).click();

        //using fluent wait by using explicit wait syntax:
        //way 1:
        FluentWait<WebDriver> fw = new FluentWait<WebDriver>(driver);
        fw.withTimeout(Duration.ofSeconds(10));
        fw.pollingEvery(Duration.ofMillis(200));
        fw.ignoring(Exception.class);
        fw.until(ExpectedConditions.visibilityOfElementLocated(By.id("logoutLink")));

        //way 2:
        FluentWait<WebDriver> fw2 = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofMillis(200))
                .ignoring(Exception.class);
        fw2.until(ExpectedConditions.visibilityOfElementLocated(By.id("logoutLink")));

        //way 3:
        new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10))
            .pollingEvery(Duration.ofMillis(200)).ignoring(Exception.class)
            .until(ExpectedConditions.visibilityOfElementLocated(By.id("logoutLink")));

        driver.findElement(By.id("logoutLink")).click();

        System.out.println("** Program Ends **");
    }

}
