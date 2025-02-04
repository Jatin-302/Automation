package org.dec_18_24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.GenericUtility;

public class FrameEx2 {
    public static void main(String[] args) {
        System.out.println("** Program Starts **");
        String bName = "ch";
        String url = "https://demoqa.com/nestedframes";
        GenericUtility gu = new GenericUtility();
        WebDriver driver = gu.startUp(bName, url);

        WebElement frameEle1 = driver.findElement(By.id("frame1"));       //1st frame web element
        driver.switchTo().frame(frameEle1);

        WebElement frameEle2 = driver.findElement(By.cssSelector("iframe[srcdoc]"));       //2nd frame web element
        driver.switchTo().frame(frameEle2);

        String txt = driver.findElement(By.xpath("//body/p")).getText();
        System.out.println("TEXT : " + txt);

        driver.switchTo().parentFrame();        //immediate parent iframe tag

        driver.switchTo().defaultContent();     //root html
        System.out.println("** Program Ends **");
    }

}
