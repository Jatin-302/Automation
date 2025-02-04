package org.dec_16_24;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.utilities.GenericUtility;

public class AlertsEx1 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("** Program Starts **");
        String bName = "ch";
        String url = "https://demoqa.com/alerts";
        GenericUtility gu = new GenericUtility();
        WebDriver driver = gu.startUp(bName, url);

        driver.findElement(By.id("promtButton")).click();

        Alert alt = driver.switchTo().alert();
        String txt = alt.getText();
        System.out.println("Alert text : " + txt);

        alt.sendKeys("Morning Automation Batch...!!!");

        alt.accept();
        //alt.dismiss();

        System.out.println("** Program Ends **");
    }

}
