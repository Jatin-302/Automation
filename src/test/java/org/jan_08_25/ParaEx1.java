package org.jan_08_25;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.utilities.GenericUtility;

public class ParaEx1 {
    @Test
    public void googleEx() {
        System.out.println("** Google Starts **");
        GenericUtility gu = new GenericUtility();
        WebDriver driver = gu.startUp("ch","https://www.google.co.in/");
        //perform operation using Local WebDriver driver here only.
        System.out.println("** Google Ends **");
        driver.quit();
    }
    @Test
    public void facebookEx() {
        System.out.println("** Facebook Starts **");
        GenericUtility gu = new GenericUtility();
        WebDriver driver = gu.startUp("ch","https://www.facebook.com");
        //perform operation using Local WebDriver driver here only.
        System.out.println("** Facebook Ends **");
        driver.quit();
    }
}
