package org.dec_10_24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.utilities.GenericUtility;

import java.time.Duration;
import java.util.function.Function;

public class FluentEaitEx2 {
    public static void main(String[] args) {
        String bName = "ch";
        String url = "http://localhost:93/login.do";
        GenericUtility gu = new GenericUtility();
        WebDriver driver = gu.startUp(bName, url);
        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.cssSelector(".textField.pwdfield")).sendKeys("manager");
        driver.findElement(By.cssSelector("#loginButton>div")).click();

        //using fluent wait by using its own syntax:
        FluentWait<WebDriver> fw = new FluentWait<WebDriver>(driver);
        fw.withTimeout(Duration.ofSeconds(10));
        fw.pollingEvery(Duration.ofMillis(200));
        fw.ignoring(Exception.class);
        fw.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.id("logoutLink"));
            }
        });


        driver.findElement(By.id("logoutLink")).click();

        System.out.println("** Program Ends **");
    }

}
