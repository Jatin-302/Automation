package org.basicPrograms2;

import org.openqa.selenium.WebDriver;
import org.utilities.GenericUtility;

public class Ex1 {
    public static void main(String[] args) {
        System.out.println("** Program Starts **");
        GenericUtility gu = new GenericUtility();

        WebDriver driver = gu.startUp("ch", "http://localhost:93/login.do");
        String str = driver.getPageSource();
        System.out.println(str);
        System.out.println("** Program Ends **");
    }
}
