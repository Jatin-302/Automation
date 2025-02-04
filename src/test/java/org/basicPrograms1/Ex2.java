package org.basicPrograms1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ex2 {
    public static void main(String[] args) {
        System.out.println("** Program Starts **");

        String browserName = "ch";
        Ex2 obj = new Ex2();
        obj.startUp(browserName);

        System.out.println("** Program Ends **");
    }

    public void startUp(String bName) {
        if(bName.equalsIgnoreCase("ch") || bName.equalsIgnoreCase("chrome")) {
            WebDriver driver = new ChromeDriver();

        } else if(bName.equalsIgnoreCase("edge")) {
            WebDriver driver = new EdgeDriver();

        } else if(bName.equalsIgnoreCase("ff") || bName.equalsIgnoreCase("firefox")) {
            WebDriver driver = new FirefoxDriver();

        } else {
            System.out.println("Invalid Browser name...!!!");
        }
    }
}
