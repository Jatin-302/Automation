package org.basicPrograms2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.utilities.GenericUtility;

public class ActtimeLoginEx1 {
    public static void main(String[] args) {
        String bName = "ch";
        String url = "http://localhost:82/login.do";
        ActtimeLoginEx1 obj = new ActtimeLoginEx1();
        obj.elementPractice(bName, url);
    }

    public void elementPractice(String bName, String url) {
        System.out.println("** Program Starts **");
        GenericUtility gu = new GenericUtility();

        WebDriver driver = gu.startUp(bName, url);

//        By userNameObj = By.id("username");
//        WebElement userNameField = driver.findElement(userNameObj);
//
//        By pwdObj = By.cssSelector(".textField.pwdfield");
//        WebElement passwordField = driver.findElement(pwdObj);
//
//        By loginObj = By.cssSelector("#loginButton>div");
//        WebElement loginBtn = driver.findElement(loginObj);
        //*********************************

//        WebElement userNameField = driver.findElement(By.id("username"));
//        userNameField.sendKeys("admin");
//
//        WebElement passwordField = driver.findElement(By.cssSelector(".textField.pwdfield"));
//        passwordField.sendKeys("manager");
//
//        WebElement loginBtn = driver.findElement(By.cssSelector("#loginButton>div"));
//        loginBtn.click();

        //*****************************************************

        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.cssSelector(".textField.pwdfield")).sendKeys("manager");
        driver.findElement(By.cssSelector("#loginButton>div")).click();

        System.out.println("** Program Ends **");
    }
}
