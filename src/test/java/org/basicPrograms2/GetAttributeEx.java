package org.basicPrograms2;

import org.openqa.selenium.WebDriver;
import org.utilities.GenericUtility;

public class GetAttributeEx {
    public static void main(String[] args) {
        System.out.println("** Program Starts **");
        GenericUtility gu = new GenericUtility();

        WebDriver driver = gu.startUp("ch", "http://localhost:93/login.do");

        System.out.println("** Program Ends **");
    }
}
