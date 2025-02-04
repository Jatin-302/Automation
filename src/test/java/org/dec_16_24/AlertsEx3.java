package org.dec_16_24;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.utilities.GenericUtility;

public class AlertsEx3 {
    public static void main(String[] args) {
        System.out.println("** Program Starts **");
        String bName = "ch";
        String url = "https://demoqa.com/alerts";
        GenericUtility gu = new GenericUtility();
        WebDriver driver = gu.startUp(bName, url);

        driver.findElement(By.id("timerAlertButton")).click();

        //boolean flag = gu.isAlertPresent(driver, 10);
        //if(flag) {      //if(flag == true) {
        if(gu.isAlertPresent(driver, 10)) {
            Alert alt = driver.switchTo().alert();
            String txt = alt.getText();
            System.out.println("Alert text : " + txt);
            alt.accept();
        } else {
            //alert is not displayed
            //OR
            //user already logged in
        }

        System.out.println("** Program Ends **");
    }

}
