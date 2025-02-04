package org.dec_31_24;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public class WriteEx {
    public static void main(String[] args) {
        System.out.println("** Program Starts **");
        try {
            FileInputStream fis = new FileInputStream("./src/test/resources/ExcelFilesData/TestData.xlsx");
            Workbook wb = WorkbookFactory.create(fis);
            Sheet s = wb.getSheet("TC_ExecutionReport");

            //write data in particular cell
            s.getRow(1).createCell(3).setCellValue("PASS");
            s.getRow(2).createCell(3).setCellValue("SKIP");
            s.getRow(3).createCell(3).setCellValue("FAIL");

            FileOutputStream fos = new FileOutputStream("./src/test/resources/ExcelFilesData/TestData.xlsx");
            wb.write(fos);
            wb.close();
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("** Program Ends **");
    }
}
