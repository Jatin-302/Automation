package org.dec_28_24;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;

public class Ex2 {
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

            //getLastRowNum()
            int lastRowNum = s.getLastRowNum();
            System.out.println("lastRowNum : " + lastRowNum);

            //getPhysicalNumberOfRows()
            int physicalNumberOfRows = s.getPhysicalNumberOfRows();
            System.out.println("physicalNumberOfRows : " + physicalNumberOfRows);

        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("** Program Ends **");
    }
}
