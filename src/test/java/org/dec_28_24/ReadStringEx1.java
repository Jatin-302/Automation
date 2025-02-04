package org.dec_28_24;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;

public class ReadStringEx1 {
    public static void main(String[] args) {
        System.out.println("** Program Starts **");
        try {
            FileInputStream fis = new FileInputStream("./src/test/resources/ExcelFilesData/TestData.xlsx");
            Workbook wb = WorkbookFactory.create(fis);
            Sheet s = wb.getSheet("OnlyStringTypes");
            Row r = s.getRow(1);        //only particular row number '1'
            Cell c = r.getCell(0);      //only particular cell number '0'
            String value = c.getStringCellValue();
            System.out.println(value);
            System.out.println("**************");

            //Print data of all cells for particular row number 1
            int lastCellNum = r.getLastCellNum();
            for(int i=0; i<lastCellNum; i++) {
                Cell c1 = r.getCell(i);      //points to EACH cell number 'i'
                String value1 = c1.getStringCellValue();
                System.out.println(value1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("** Program Ends **");
    }
}
