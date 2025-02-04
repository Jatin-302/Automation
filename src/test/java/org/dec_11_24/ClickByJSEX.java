package org.org.dec_11_24;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.GenericUtility;

public class ClickByJSEX {
    public static void main(String[] args) throws InterruptedException {
        String bName = "ch";
        String url = "https://demoqa.com/radio-button";
        GenericUtility gu = new GenericUtility();
        WebDriver driver = gu.startUp(bName, url);

        WebElement yesRadioBtn = driver.findElement(By.id("yesRadio"));
        //yesRadioBtn.click();      //won't work, below is alternative using javascript

        JavascriptExecutor js = (JavascriptExecutor)driver;
        //type casting, so js will perform operation on same browser
        js.executeScript("arguments[0].click();",yesRadioBtn);

        System.out.println("Clicked on Yes radio button.");
        System.out.println("** Program Ends **");
    }

}
