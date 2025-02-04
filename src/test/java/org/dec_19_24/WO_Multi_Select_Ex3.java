package org.dec_19_24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.GenericUtility;

public class WO_Multi_Select_Ex3 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("** Program Starts **");
        String bName = "ch";
        String url = "https://demoqa.com/select-menu";
        GenericUtility gu = new GenericUtility();
        WebDriver driver = gu.startUp(bName, url);
        gu.scrollByPageDown(driver, 1);
        Thread.sleep(2000);

        WebElement ddlEle = driver.findElement(By.xpath("//div[text()='Select...']"));
        ddlEle.click();

        driver.findElement(By.xpath("//div[text()='Red']")).click();
        driver.findElement(By.xpath("//div[text()='Black']")).click();


        System.out.println("** Program Ends **");
    }
}
