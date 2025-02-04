package org.basicPrograms2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.utilities.GenericUtility;

public class DashboardTitleURLEx2 {
    public static void main(String[] args) {
        String bName = "ch";
        String url = "http://localhost:93/login.do";
        GenericUtility gu = new GenericUtility();
        WebDriver driver = gu.startUp(bName, url);
        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.cssSelector(".textField.pwdfield")).sendKeys("manager");
        driver.findElement(By.cssSelector("#loginButton>div")).click();

        gu.waitForTitleContains(driver, 10, "Enter Time-Track");
        //Title
        String expTitle = "actiTIME - Enter Time-Track";
        String actTitle = driver.getTitle();
        if(expTitle.equals(actTitle)) {
            System.out.println("Dashboard Title as expected.");
        } else {
            System.out.println("Dashboard Title not as expected.");
        }
        //URL
        gu.waitForURLContains(driver, 10, "submit_tt.do");
        
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
