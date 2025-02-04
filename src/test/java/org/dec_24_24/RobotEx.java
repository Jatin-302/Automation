package org.dec_24_24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.GenericUtility;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class RobotEx {
    public static void main(String[] args) throws InterruptedException, AWTException {
        System.out.println("** Program Starts **");
        String bName = "ch";
        String url = "https://demoqa.com/automation-practice-form";
        GenericUtility gu = new GenericUtility();
        WebDriver driver = gu.startUp(bName, url);
        gu.scrollByPageDown(driver, 1);
        Thread.sleep(2000);
        WebElement uploadBtn = driver.findElement(By.id("uploadPicture"));
        gu.clickByActions(driver, uploadBtn);
        String fileName = System.getProperty("user.dir") + "\\FileUploads\\UploadData.txt";
        Thread.sleep(2000);
        //Following code to copy the String on clipboard
        StringSelection ss = new StringSelection(fileName);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

        //To perform keyboard actions
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_CONTROL);    //press Control Key
        r.keyPress(KeyEvent.VK_V);          //press 'v' Key    - enters data copied from clipboard
        r.keyRelease(KeyEvent.VK_V);        //release 'v' Key
        r.keyRelease(KeyEvent.VK_CONTROL);  //release Control Key

        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
        System.out.println("** Program Ends **");
    }
}







