package org.org.dec_11_24;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.GenericUtility;

public class ClearSendKeysEx {
    public static void main(String[] args) throws InterruptedException {
        String bName = "ch";
        String url = "https://demoqa.com/webtables";
        GenericUtility gu = new GenericUtility();
        WebDriver driver = gu.startUp(bName, url);

        driver.findElement(By.xpath("//div[text()='Cierra']/following-sibling::div//span[@title='Edit']/*")).click();
        WebElement firstname = driver.findElement(By.id("firstName"));
        //way 1:
//        firstname.clear();      //clears the text field on WebPage
//        firstname.sendKeys("Akshay");

        //way 2:
        firstname.click();
        Thread.sleep(2000);
        firstname.sendKeys(Keys.chord(Keys.CONTROL,"a"));
        Thread.sleep(2000);
        firstname.sendKeys(Keys.DELETE);        //delete the selected text
        Thread.sleep(2000);
        firstname.sendKeys("Akshay");
        System.out.println("** Program Ends **");
    }

}
