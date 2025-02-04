package org.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {
    public Properties getPropObj() {
        try {
            FileInputStream fis = new FileInputStream(System.getProperty("user.dir")
                    + "\\ConfigurationDetails\\Config.properties");
            Properties prop = new Properties();
            prop.load(fis);
            return prop;

        } catch(Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public String getPropData(String key) {
        try {
            FileInputStream fis = new FileInputStream(System.getProperty("user.dir")
                    + "\\ConfigurationDetails\\Config.properties");
            Properties prop = new Properties();
            prop.load(fis);
            return prop.getProperty(key);

        } catch(Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    /*public String test(String key) {
        String value = null;
        try {
            FileInputStream fis = new FileInputStream(System.getProperty("user.dir")
                    + "\\ConfigurationDetails\\Config.properties");
            Properties prop = new Properties();
            prop.load(fis);
            value = prop.getProperty(key);

        } catch(Exception e) {
            e.printStackTrace();
        }
        return value;
    }*/
}
