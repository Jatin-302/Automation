package org.dec_26_24;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesEx1 {
    public static void main(String[] args) {
        System.out.println("** Program Starts **");
        try {
            //Which file need to read, mention in FileInputStream class
            FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\ConfigurationDetails\\Config.properties");

            //Create object of Properties class
            Properties prop = new Properties();

            //Integrate fis with prop by using load method
            prop.load(fis);

            //By using key from properties file, we can get the value
            String browserName = prop.getProperty("bName");
            System.out.println("browserName : " + browserName);
        } catch(Exception e) {
            e.printStackTrace();
        }
        System.out.println("** Program Ends **");
    }
}
