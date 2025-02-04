package org.dec_17_24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.GenericUtility;

import java.util.Iterator;
import java.util.Set;

public class WindowHandleEx1 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("** Program Starts **");
        String bName = "ch";
        String url = "https://demoqa.com/browser-windows";
        GenericUtility gu = new GenericUtility();
        WebDriver driver = gu.startUp(bName, url);

        String parentId1 = driver.getWindowHandle();        //returns current window id, pointed by driver
        System.out.println("Parent Id1 : " + parentId1);

        driver.findElement(By.cssSelector("#tabButton")).click();       //opens new window

        String parentId2 = driver.getWindowHandle();    //returns current window id, pointed by driver
        System.out.println("Parent Id2 : " + parentId2);

        Set<String> allWinIds = driver.getWindowHandles();
        //returns all window ids which are opened by current WebDriver instance

        Iterator<String> itr = allWinIds.iterator();
        String winId = itr.next();
        if(winId.equals(parentId1)) {
            winId = itr.next();
        }
        driver.switchTo().window(winId);    //switched to New/Child Window

        WebElement ele = driver.findElement(By.cssSelector("h1[id='sampleHeading']"));
        String txt = ele.getText();
        System.out.println("Text : " + txt);

        System.out.println("** Program Ends **");
    }

}
