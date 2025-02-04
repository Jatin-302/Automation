package org.dec_30_24;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeEx {
    public static void main(String[] args) {
        //way 1:
        //JODA API: introduced from Java 8 and onwards
        //used for date and/or time

        //way 2: by using SimpleDateFormat and Date class
        Date d = new Date();    //returns Current Date & time in default format
        //imported from java.util package
        System.out.println(d);

        //To format above date & time as per our requirement,
        //we have SimpleDateFormat class

        //Sample Date & time formats reference:
        //https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss:S");

        //we neeed to actually format the date in 'd' object
        String dt = sdf.format(d);
        System.out.println(dt);

    }
}
