package org.dec_24_24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.GenericUtility;

public class AutoItEx2 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("** Program Starts **");
        String bName = "ch";
        String url = "https://demoqa.com/automation-practice-form";
        GenericUtility gu = new GenericUtility();
        WebDriver driver = gu.startUp(bName, url);
        gu.scrollByPageDown(driver, 1);
        Thread.sleep(2000);
        WebElement uploadBtn = driver.findElement(By.id("uploadPicture"));
        //uploadBtn.click();
        gu.clickByActions(driver, uploadBtn);
        String fileName = System.getProperty("user.dir") + "\\FileUploads\\UploadData.txt";
        try {
            //Runtime.getRuntime().exec(System.getProperty("user.dir") + "\\FileUploads\\UploadEx1.exe");
            Runtime.getRuntime().exec(System.getProperty("user.dir") + "\\FileUploads\\GenericUpload.exe" +" " + fileName);
        } catch (Exception e) {
            e.printStackTrace();        //prints the exception details
            //e.getMessage();     //prints exception message
        }
        System.out.println("** Program Ends **");
    }
}
