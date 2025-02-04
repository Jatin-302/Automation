package org.jan_16_25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.GenericUtility;

import java.util.List;

public class HandleStaleElementExceptionEx {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("** Program Starts **");
        String bName = "ch";
        String url = "http://localhost:93/login.do";
        GenericUtility gu = new GenericUtility();
        WebDriver driver = gu.startUp(bName, url);
        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.cssSelector(".textField.pwdfield")).sendKeys("manager");
        driver.findElement(By.cssSelector("#loginButton>div")).click();
        gu.waitForVisibilityByType(driver, 10, "id", "logoutLink");

        List<WebElement> tabNames = driver.findElements(By.cssSelector("#topnav .label"));
        List<WebElement> tabLinks = driver.findElements(By.cssSelector("#topnav td[class^='navItem navCell']>a"));
        System.out.println("*****************");
        //printing tab names as per 'Selected'
        int size = tabNames.size();
        for(int i=0; i<size; i++) {
            WebElement ele = tabLinks.get(i);       //Returns first 'a' tag as WebElement
            String value = ele.getDomAttribute("class");
            WebElement eleName = tabNames.get(i);       //returns first 'div' tag as WebElement
            String name = eleName.getText();
            if(value.contains("selected")) {        //tab is selected
                System.out.println("Selected Tab is : " + name);
            } else {
                //tab is not selected
                System.out.println("NOT Selected Tab is : " + name);
            }
        }
        //*******************************************
        //Click on TASKS tab and again print which tab is selected and which are not.
        //Click on TASKS tab
        driver.findElement(By.cssSelector("a[class$='tasks']")).click();
        //printing tab names as per 'Selected'
        //From line number 45 onwards, we may get 'StaleElementReferenceException'
        for(int i=0; i<tabNames.size(); i++) {
            WebElement ele = tabLinks.get(i);       //Returns first 'a' tag as WebElement
            String value = ele.getDomAttribute("class");
            WebElement eleName = tabNames.get(i);       //returns first 'div' tag as WebElement
            String name = eleName.getText();
            if(value.contains("selected")) {        //tab is selected
                System.out.println("Selected Tab is : " + name);
            } else {
                //tab is not selected
                System.out.println("NOT Selected Tab is : " + name);
            }
        }
        System.out.println("** Program Ends **");
    }

}
