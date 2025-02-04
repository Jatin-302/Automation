package org.dec_22_24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.utilities.GenericUtility;

public class ActionsEx2 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("** Program Starts **");
        String bName = "ch";
        String url = "https://demoqa.com/droppable";
        GenericUtility gu = new GenericUtility();
        WebDriver driver = gu.startUp(bName, url);
        gu.scrollByPageDown(driver, 1);
        Thread.sleep(2000);
        WebElement src = driver.findElement(By.id("draggable"));
        //WebElement des = driver.findElement(By.cssSelector("#simpleDropContainer>#droppable"));

        Actions act = new Actions(driver);
        //act.dragAndDrop(src,des).perform();       //performs drag and drop for source to destination

        //performs drag and drop for source by x an//performs drag and drop for source by x and y pixelsd y pixels
        act.dragAndDropBy(src, 280, 70).perform();

        System.out.println("** Program Ends **");
    }
}
