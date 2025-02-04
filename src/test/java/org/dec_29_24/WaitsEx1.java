package org.dec_29_24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitsEx1 {

    public void waitForNumberOfWindows(WebDriver driver, int time, int numOfWins) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.numberOfWindowsToBe(numOfWins));
    }

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ID_VALUE")));

    }
    public void test(WebDriver driver, int time, By obj) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(obj)));
    }

    public void waitForVisibilityByObj(WebDriver driver, int time, By obj) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.visibilityOfElementLocated(obj));
    }
    public void waitForVisibilityByType(WebDriver driver, int time, String locatorType, String expression) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        if (locatorType.equalsIgnoreCase("id")) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(expression)));
        } else if (locatorType.equalsIgnoreCase("css")) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(expression)));
        } else if (locatorType.equalsIgnoreCase("xpath")) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(expression)));
        } else {        //write if-else for remaining locator type

        }
    }
}










