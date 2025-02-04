package org.dec_22_24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.utilities.GenericUtility;

import java.util.Arrays;
import java.util.List;

public class W_Multi_Select_Ex2 {
    public static void main(String[] args) {
        System.out.println("** Program Starts **");
        String bName = "ch";
        String url = "https://demoqa.com/select-menu";
        GenericUtility gu = new GenericUtility();
        WebDriver driver = gu.startUp(bName, url);

        //step 1: identify the dropdown element
        WebElement ddlEle = driver.findElement(By.id("cars"));
        gu.scrollByJS(driver, ddlEle);
        //step 2: create object of 'Select' class by passing above ele
        Select sel = new Select(ddlEle);

        List<WebElement> allOptions = sel.getOptions();     //returns all Options from DDL
        int expCarsCount = 4;
        int actCarsCount = allOptions.size();       //returns number of options from DDL
        if(expCarsCount == actCarsCount) {
            System.out.println("Number of Cars in dropdown are as expected : " + actCarsCount);
        } else {
            System.out.println("Number of Cars in dropdown are NOT as expected : " + actCarsCount);
        }

        //get all text from dropdown using user defined method
        List<String> actAllCarNames = gu.getAllTextFromList(allOptions);

        String[] expCarAr = {"Volvo","Saab","Opel","Audi"};
        List<String> expCarNames = Arrays.asList(expCarAr); //convert array into list
        if(actAllCarNames.equals(expCarNames)) {
            System.out.println("Expected cars are present in dropdown.");
        } else {
            System.out.println("Expected cars NOT are present in dropdown.");
        }
        System.out.println("** Program Ends **");
    }
}
