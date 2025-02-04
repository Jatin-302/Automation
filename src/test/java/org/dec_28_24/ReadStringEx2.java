package org.dec_28_24;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;

public class ReadStringEx2 {
    public static void main(String[] args) {
        System.out.println("** Program Starts **");
        try {
            FileInputStream fis = new FileInputStream("./src/test/resources/ExcelFilesData/TestData.xlsx");
            Workbook wb = WorkbookFactory.create(fis);
            Sheet s = wb.getSheet("OnlyStringTypes");
            int lastRowNum = s.getLastRowNum();
            for(int k=1; k<=lastRowNum; k++) {      //Starting with Row 1
                Row r = s.getRow(k);        //Traverse all Rows
                for(int i=0; i<r.getLastCellNum(); i++) {
                    System.out.println(r.getCell(i).getStringCellValue());
                }
                System.out.println();
            }


            //Row r = s.getRow(1);      //only for Row 1
            ////Prints data for Row number 1
//            for(int i=0; i<r.getLastCellNum(); i++) {
//                System.out.println(r.getCell(i).getStringCellValue());
//            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("** Program Ends **");
    }
}
