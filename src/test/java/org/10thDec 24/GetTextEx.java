package org.dec_10_24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.GenericUtility;

public class GetTextEx {
    public static void main(String[] args) {
        String bName = "ch";
        String url = "http://localhost:82/login.do";
        GenericUtility gu = new GenericUtility();
        WebDriver driver = gu.startUp(bName, url);


        System.out.println(driver.findElement(By.id("headerContainer")).getText());
        System.out.println("** Program Ends **");
    }

}
