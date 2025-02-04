package org.dec_28_24;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;

public class Ex1 {
    public static void main(String[] args) {
        System.out.println("** Program Starts **");
        try {

            //Excel file need to read
            FileInputStream fis = new FileInputStream("./src/test/resources/ExcelFilesData/TestData.xlsx");

            //Excel file is considered as Workbook
            //Need to create reference of workbook,
            //create is static method in WorkbookFactory class which returns Workbook reference
            Workbook wb = WorkbookFactory.create(fis);

            //methods in Workbook interface:
            int totalSheets = wb.getNumberOfSheets();       //returns count for number of sheets
            System.out.println("Total Sheets : " + totalSheets);

            String sheetName0 = wb.getSheetName(0);     //returns sheet name at 0th index
            System.out.println("0th sheet Name : " + sheetName0);
            System.out.println("**********************");
            for(int i=0; i<totalSheets; i++) {
                String sheetName = wb.getSheetName(i);     //returns sheet name at ith index
                System.out.println("sheet Name at "+i+" : " + sheetName);
            }

            int index = wb.getSheetIndex("OnlyStringTypes");
            System.out.println("index : " + index);

        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("** Program Ends **");
    }
}
