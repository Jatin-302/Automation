package org.basicPrograms1;

import org.openqa.selenium.WebDriver;
import org.utilities.GenericUtility;

public class Ex4 {
    public static void main(String[] args) {
        System.out.println("** Program Starts **");

        GenericUtility gu = new GenericUtility();
        //WebDriver driver = gu.startUp("ch", "https://www.google.com");
        //WebDriver driver = gu.startUp("ch", "https://demoqa.com/text-box");
        WebDriver driver = gu.startUp("ch", "http://localhost:82/login.do");
        String actTitle = driver.getTitle();
        String expTitle = "actiTIME - Login";
        System.out.println("actTitle : " + actTitle);
        if(actTitle.equals(expTitle)) {
            System.out.println("Title is as expected.");
        } else {
            System.out.println("Title is not as expected.");
        }

        String actURL = driver.getCurrentUrl();
        System.out.println("actURL : " + actURL);
        System.out.println("** Program Ends **");
    }

}
