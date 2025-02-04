package org.jan_08_25;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.utilities.GenericUtility;

public class ParaEx2 {
    @Test
    public void demoQaEx() {
        System.out.println("** DEMOQA Starts **");
        GenericUtility gu = new GenericUtility();
        WebDriver driver = gu.startUp("ch","https://demoqa.com/");
        //perform operation using Local WebDriver driver here only.
        System.out.println("** DEMOQA Ends **");
        driver.quit();
    }
    @Test
    public void flipkartEx() {
        System.out.println("** Flipkart Starts **");
        GenericUtility gu = new GenericUtility();
        WebDriver driver = gu.startUp("ch","https://www.flipkart.com");
        //perform operation using Local WebDriver driver here only.
        System.out.println("** Flipkart Ends **");
        driver.quit();
    }
}
