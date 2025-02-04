package org.dec_30_24;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AllTypesReadingEx {
    public static void main(String[] args) {
        System.out.println("** Program Starts **");
        try {
            FileInputStream fis = new FileInputStream("./src/test/resources/ExcelFilesData/TestData.xlsx");
            Workbook wb = WorkbookFactory.create(fis);
            Sheet s = wb.getSheet("AllDataTypes");
            for(int k=1; k<=s.getLastRowNum(); k++) {
                for(int i=0; i<s.getRow(k).getLastCellNum(); i++) {
                    //System.out.println(s.getRow(k).getCell(i).getStringCellValue());
                    CellType ct = s.getRow(k).getCell(i).getCellType();
                    //System.out.println(ct);
                    switch (ct) {
                        case STRING:
                            System.out.println(s.getRow(k).getCell(i).getStringCellValue());
                            break;
                        case NUMERIC:
                            Cell c = s.getRow(k).getCell(i);
                            if(DateUtil.isCellDateFormatted(c)) {
                                //Prints in default format
                                //System.out.println(s.getRow(k).getCell(i).getDateCellValue());
                                //Format the date in required format
                                Date d = s.getRow(k).getCell(i).getDateCellValue();
                                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                                System.out.println(sdf.format(d));
                            } else {
                                System.out.println((long) s.getRow(k).getCell(i).getNumericCellValue());
                            }
                            break;
                        case FORMULA:
                            System.out.println(s.getRow(k).getCell(i).getCellFormula());
                            break;
                        case BOOLEAN:
                            System.out.println(s.getRow(k).getCell(i).getBooleanCellValue());
                            break;
                        case BLANK:
                        case _NONE:
                        case ERROR:
                            System.out.println("Cell is either Blank/None/Error.");
                        default: System.out.println();
                    }
                }
                System.out.println();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("** Program Ends **");
    }
}
