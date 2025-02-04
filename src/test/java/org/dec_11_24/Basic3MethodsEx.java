package org.org.dec_11_24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.GenericUtility;

public class Basic3MethodsEx {
    public static void main(String[] args) throws InterruptedException {
        String bName = "ch";
        String url = "https://demoqa.com/radio-button";
        GenericUtility gu = new GenericUtility();
        WebDriver driver = gu.startUp(bName, url);

        WebElement yeslable = driver.findElement(By.cssSelector("label[for='yesRadio']"));
        System.out.println("isDisplayed : " + yeslable.isDisplayed());

        WebElement yesRadioBtn = driver.findElement(By.id("yesRadio"));
        boolean isSelected = yesRadioBtn.isSelected();
        System.out.println("isSelected : " + isSelected);

//        if(!isSelected) {
//            yesRadio.click();
//            System.out.println("Clicked on Yes radio button.");
//        } else {
//            System.out.println("Yes Radio button is already selected.");
//        }

        WebElement noRadoBtn = driver.findElement(By.id("noRadio"));
        System.out.println("isEnabled : " + noRadoBtn.isEnabled());

        System.out.println("** Program Ends **");
    }

}
