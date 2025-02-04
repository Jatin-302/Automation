package org.dec_10_24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.GenericUtility;

public class GetAttributeEx {
    public static void main(String[] args) {
        String bName = "ch";
        String url = "http://localhost:93/login.do";
        GenericUtility gu = new GenericUtility();
        WebDriver driver = gu.startUp(bName, url);

        WebElement loginBoxHeader = driver.findElement(By.id("headerContainer"));
        // getAttribute method returns the respective(which we passed as parameter) attribute value
        String value = loginBoxHeader.getAttribute("class");
        System.out.println("value = " + value);
        //OR
        //from Selenium 4.27.0  & onwards, alternative for .getAttribute(String attribName) method
        String value2 = loginBoxHeader.getDomAttribute("class");
        System.out.println(value2);
        System.out.println("** Program Ends **");
    }

}
