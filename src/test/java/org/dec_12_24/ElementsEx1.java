package org.dec_12_24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.GenericUtility;

import java.util.List;

public class ElementsEx1 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("** Program Starts **");
        String bName = "ch";
        String url = "http://localhost:93/login.do";
        GenericUtility gu = new GenericUtility();
        WebDriver driver = gu.startUp(bName, url);

        //WebElement ele = driver.findElement(By.id("username123"));

        List<WebElement> allEles = driver.findElements(By.id("username123"));
        System.out.println("size = " + allEles.size());     //0
        System.out.println("isEmpty = " + allEles.isEmpty());     //true
        System.out.println("** Program Ends **");
    }

}
