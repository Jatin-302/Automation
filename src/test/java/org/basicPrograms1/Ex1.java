package org.basicPrograms1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ex1 {
    public static void main(String[] args) {
        System.out.println("** Program Starts **");

        String browserName = "ch";

        if(browserName.equalsIgnoreCase("ch") || browserName.equalsIgnoreCase("chrome")) {
            WebDriver driver = new ChromeDriver();

        } else if(browserName.equalsIgnoreCase("edge")) {
            WebDriver driver = new EdgeDriver();

        } else if(browserName.equalsIgnoreCase("ff") || browserName.equalsIgnoreCase("firefox")) {
            WebDriver driver = new FirefoxDriver();

        } else {
            System.out.println("Invalid Browser name...!!!");
        }
        System.out.println("** Program Ends **");
    }
}
