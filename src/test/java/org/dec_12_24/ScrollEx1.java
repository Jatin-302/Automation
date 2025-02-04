package org.dec_12_24;

import org.openqa.selenium.*;
import org.utilities.GenericUtility;

public class ScrollEx1 {
    public static void main(String[] args) throws InterruptedException {
        String bName = "ch";
        String url = "https://demoqa.com/automation-practice-form";
        GenericUtility gu = new GenericUtility();
        WebDriver driver = gu.startUp(bName, url);

        WebElement ele = driver.findElement(By.xpath("//html"));
        ele.sendKeys(Keys.PAGE_DOWN);       //scroll 1 page at a time
        System.out.println("** Program Ends **");
    }

}
