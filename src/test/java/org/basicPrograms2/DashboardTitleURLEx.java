package org.basicPrograms2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.utilities.GenericUtility;

import java.time.Duration;

public class DashboardTitleURLEx {
    public static void main(String[] args) {
        String bName = "ch";
        String url = "http://localhost:93/login.do";
        GenericUtility gu = new GenericUtility();
        WebDriver driver = gu.startUp(bName, url);
        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.cssSelector(".textField.pwdfield")).sendKeys("manager");
        driver.findElement(By.cssSelector("#loginButton>div")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.titleContains("Enter Time-Track"));
        //waits for partial title matching

        //OR
        wait.until(ExpectedConditions.titleIs("actiTIME - Enter Time-Track"));
        //wait for exact title matching

        //Title
        String expTitle = "actiTIME - Enter Time-Track";
        String actTitle = driver.getTitle();
        if(expTitle.equals(actTitle)) {
            System.out.println("Dashboard Title as expected.");
        } else {
            System.out.println("Dashboard Title not as expected.");
        }
        //URL

        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlContains("submit_tt.do"));
        //matches for partial URL
        //OR
        wait.until(ExpectedConditions.urlToBe("http://localhost:93/user/submit_tt.do"));
        //wait for exact URL
        //OR
        //wait.until(ExpectedConditions.urlMatches(""));

        String expURL = "http://localhost:93/user/submit_tt.do";
        String actURL = driver.getCurrentUrl();
        if(expURL.equals(actURL)) {
            System.out.println("Dashboard URL as expected.");
        } else {
            System.out.println("Dashboard URL not as expected.");
        }
        System.out.println("** Program Ends **");
    }

}
