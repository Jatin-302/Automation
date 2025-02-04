package org.dec_23_24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.utilities.GenericUtility;

public class FileUploadSendKeysEx {
    public static void main(String[] args) {
        System.out.println("** Program Starts **");
        String bName = "ch";
        String url = "https://demoqa.com/automation-practice-form";
        GenericUtility gu = new GenericUtility();
        WebDriver driver = gu.startUp(bName, url);
        gu.scrollByPageDown(driver, 1);

        WebElement uploadBtn = driver.findElement(By.id("uploadPicture"));
        //uploadBtn.sendKeys("./FileUploads/UploadData.txt");       //Exception due to Relative path

        String path = System.getProperty("user.dir");
        System.out.println("Path : "+ path);
        uploadBtn.sendKeys(path + "\\FileUploads\\UploadData.txt");    //Absolute Path

        System.out.println("** Program Ends **");
    }
}
