package org.dec_22_24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.utilities.GenericUtility;

import java.util.List;

public class W_Multi_Select_Ex4 {
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

        List<WebElement> allOptions = sel.getOptions();
        int numOfOptions = allOptions.size();
        for(int i=0; i<numOfOptions; i++) {
            sel.selectByIndex(i);
        }
        System.out.println("Number of Selected Data : " + sel.getAllSelectedOptions().size());

//        //to deselect the data in dropdown:
//        sel.deselectByVisibleText("Opel");      //deselect by using its text
//        //OR
//        sel.deselectByValue("saab");        //deselect by using value attribute's attribute value
//        //OR
//        sel.deselectByIndex(0);       //deselect by using index

        sel.deselectAll();      //deselects all data from dropdown
        System.out.println("** Program Ends **");
    }
}
