package org.dec_19_24;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.GenericUtility;

public class WO_Select_Ex2 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("** Program Starts **");
        String bName = "ch";
        String url = "https://demoqa.com/select-menu";
        GenericUtility gu = new GenericUtility();
        WebDriver driver = gu.startUp(bName, url);

        WebElement ddlEle = driver.findElement(By.cssSelector("#withOptGroup div[class*='placeholder']"));
        ddlEle.click();
        driver.findElement(By.cssSelector("#withOptGroup input")).sendKeys("Group 2, option 2");
        Thread.sleep(2000);
        WebElement ele = driver.findElement(By.xpath("//div[text()='Group 2, option 2']"));
        //way 1: try to click normally
        //ele.click();        //ERROR
        //way 2: click by Javascript
        //gu.clickByJS(driver, ele);    //NOT WORKING
        //way 3: click by active WebElement
        //driver.switchTo().activeElement().sendKeys(Keys.ARROW_DOWN);
        driver.switchTo().activeElement().sendKeys(Keys.ENTER);

        System.out.println("** Program Ends **");
    }
}
