package org.dec_20_24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.utilities.GenericUtility;

import java.util.Arrays;
import java.util.List;

public class W_Single_Select_Ex1 {
    public static void main(String[] args) {
        System.out.println("** Program Starts **");
        String bName = "ch";
        String url = "https://demoqa.com/select-menu";
        GenericUtility gu = new GenericUtility();
        WebDriver driver = gu.startUp(bName, url);

        //step 1: identify the dropdown element
        WebElement ddlEle = driver.findElement(By.id("oldSelectMenu"));

        //step 2: create object of 'Select' class by passing above ele
        Select sel = new Select(ddlEle);

        //get the selected option from dropdown
        WebElement selectedOption = sel.getFirstSelectedOption();
        String selectedColor = selectedOption.getText();
        if(selectedColor.equals("Red")) {
            System.out.println("Red Color is selected by default.");
        } else {
            System.out.println("Red Color is not selected by default.");
        }

        //get all options from dropdown
        List<WebElement> allOptions = sel.getOptions();
        int numOfColors = allOptions.size();
        System.out.println("number of colors : " + numOfColors);    //write similar if-else

        //verify all colors with expected
        String[] expectedColorsAr = {"Red","Blue","Green","Yellow","Purple",
                "Black","White","Voilet","Indigo","Magenta","Aqua"};
        List<String> actualColors = gu.getAllTextFromList(allOptions);

        //convert both in same type
        //converting array into list
        List<String> expectedColors = Arrays.asList(expectedColorsAr);
        if(expectedColors.equals(actualColors)) {
            System.out.println("Dropdown contains expected colors.");
        } else {
            System.out.println("Dropdown does not contain expected colors.");
        }
        System.out.println("** Program Ends **");
    }
}
