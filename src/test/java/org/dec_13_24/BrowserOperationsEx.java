package org.dec_13_24;

import org.openqa.selenium.WebDriver;
import org.utilities.GenericUtility;

public class BrowserOperationsEx {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("** Program Starts **");
        String bName = "ch";
        String url = "http://localhost:93/login.do";
        GenericUtility gu = new GenericUtility();
        WebDriver driver = gu.startUp(bName, url);
        Thread.sleep(2000);
        driver.navigate().to("https://www.google.com");
        Thread.sleep(2000);
        driver.navigate().back();       //navigate back to actitime URL
        Thread.sleep(2000);
        driver.navigate().forward();    //navigate to google again
        Thread.sleep(2000);
        driver.navigate().refresh();    //refresh the page

        System.out.println("** Program Ends **");
    }

}
