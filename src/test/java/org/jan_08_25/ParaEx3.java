package org.jan_08_25;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.utilities.GenericUtility;

public class ParaEx3 {
    @Test
    public void automationtestingEx() {
        System.out.println("** automationtesting Starts **");
        GenericUtility gu = new GenericUtility();
        WebDriver driver = gu.startUp("ch","https://demo.automationtesting.in/Register.html");
        //perform operation using Local WebDriver driver here only.
        System.out.println("** automationtesting Ends **");
        driver.quit();
    }
}
