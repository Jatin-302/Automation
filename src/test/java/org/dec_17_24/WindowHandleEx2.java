package org.dec_17_24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.GenericUtility;

import java.util.Iterator;
import java.util.Set;

public class WindowHandleEx2 {
    public static void main(String[] args) {
        System.out.println("** Program Starts **");
        String bName = "ch";
        String url = "https://demoqa.com/browser-windows";
        GenericUtility gu = new GenericUtility();
        WebDriver driver = gu.startUp(bName, url);

        String parentId = driver.getWindowHandle();        //returns current window id, pointed by driver
        System.out.println("Parent Id : " + parentId);

        driver.findElement(By.cssSelector("#tabButton")).click();       //opens new window

        Set<String> allWinIds = driver.getWindowHandles();
        //returns all window ids which are opened by current WebDriver instance

        Iterator<String> itr = allWinIds.iterator();
        while(itr.hasNext()) {
            String winId = itr.next();
            if(winId.equals(parentId)) {
                winId = itr.next();
            }
            driver.switchTo().window(winId);    //switched to New/Child Window
            try {
                WebElement ele = driver.findElement(By.cssSelector("h1[id='sampleHeading']"));
                String txt = ele.getText();
                System.out.println("Text : " + txt);
                driver.close();
                break;
            } catch(Exception e) {
                driver.close();
            }
        }
        //if want to perform some operations on parent window then switch back to it.
        driver.switchTo().window(parentId);
        //perform next steps on parent window
        driver.quit();
        System.out.println("** Program Ends **");
    }

}
