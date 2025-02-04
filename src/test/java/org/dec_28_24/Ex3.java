package org.dec_28_24;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;

public class Ex3 {
    public static void main(String[] args) {
        System.out.println("** Program Starts **");
        try {
            //Excel file need to read
            FileInputStream fis = new FileInputStream("./src/test/resources/ExcelFilesData/TestData.xlsx");

            //Excel file is considered as Workbook
            //Need to create reference of workbook,
            //create is static method in WorkbookFactory class which returns Workbook reference
            Workbook wb = WorkbookFactory.create(fis);

            //create Sheet reference which points to the particular sheet
            //getSheet method returns reference of Sheet
            Sheet s = wb.getSheet("OnlyStringTypes");

            //create Row reference which points to the particular row
            Row r = s.getRow(1);

            //Returns number of cells present in particular row
            //return last cell number which has data.
            int lastCellNum = r.getLastCellNum();
            System.out.println("lastCellNum : " + lastCellNum);

            //returns number of cells which has actual data not the last cell
            int physicalNumberOfCells = r.getPhysicalNumberOfCells();
            System.out.println("physicalNumberOfCells : " + physicalNumberOfCells);

        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("** Program Ends **");
    }
}
