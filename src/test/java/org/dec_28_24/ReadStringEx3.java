package org.dec_28_24;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;

public class ReadStringEx3 {
    public static void main(String[] args) {
        System.out.println("** Program Starts **");
        try {
            FileInputStream fis = new FileInputStream("./src/test/resources/ExcelFilesData/TestData.xlsx");
            Workbook wb = WorkbookFactory.create(fis);
            Sheet s = wb.getSheet("OnlyStringTypes");
            for(int k=1; k<=s.getLastRowNum(); k++) {
                for(int i=0; i<s.getRow(k).getLastCellNum(); i++) {
                    System.out.println(s.getRow(k).getCell(i).getStringCellValue());
                }
                System.out.println();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("** Program Ends **");
    }
}
