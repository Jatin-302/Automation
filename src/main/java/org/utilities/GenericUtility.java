package org.utilities;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class GenericUtility {



    //assignment for remaining actions methods
    public void scrollByActions(WebDriver driver, WebElement ele) {
        Actions act = new Actions(driver);
        act.scrollToElement(ele).perform();
    }
    public void sendKeysByActions(WebDriver driver, WebElement ele, String value) {
        Actions act = new Actions(driver);
        act.sendKeys(ele, value).perform();
    }
    public void clickByActions(WebDriver driver, WebElement ele) {
        Actions act = new Actions(driver);
        act.click(ele).perform();
    }

    public List<String> getAllTextFromList(List<WebElement> allEles) {
        List<String> allText = new ArrayList<String>();
        for(int i=0; i<allEles.size(); i++) {
            allText.add(allEles.get(i).getText());
        }
        return allText;
    }
    public boolean isAlertPresent(WebDriver driver, int time) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
            wait.until(ExpectedConditions.alertIsPresent());
            return true;
        } catch(Exception e) {
            return false;
        }
    }
    public void scrollByJS(WebDriver driver, WebElement ele) {
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView(true)", ele);
    }
    public void scrollByPageUp(WebDriver driver, int numOfScrolls) {
        WebElement ele = driver.findElement(By.xpath("//html"));
        for(int i=1; i<=numOfScrolls; i++) {
            ele.sendKeys(Keys.PAGE_UP);
        }
    }
    public void scrollByPageDown(WebDriver driver, int numOfScrolls) {
        WebElement ele = driver.findElement(By.xpath("//html"));
        for(int i=1; i<=numOfScrolls; i++) {
            ele.sendKeys(Keys.PAGE_DOWN);
        }
    }
    public void clickByJS(WebDriver driver, WebElement ele) {
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", ele);
    }
    public  boolean  isElementPresent(WebDriver driver, By  byObj) {
        try {
            return   driver.findElement(byObj).isDisplayed( );
        } catch(Exception e) {
            return false;
        }
    }
    public void waitForURLContains(WebDriver driver, int time, String partialURL) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.urlContains(partialURL));
    }
    public void waitForURLToBe(WebDriver driver, int time, String exactURL) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.urlToBe(exactURL));
    }
    public void waitForTitleContains(WebDriver driver, int time, String partialTitle) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.titleContains(partialTitle));
    }
    public void waitForTitleIs(WebDriver driver, int time, String exactTitle) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.titleIs(exactTitle));
    }
    public void waitForVisibilityOfEleByObj(WebDriver driver, int time, By obj) {
        WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(time));
        wt.until(ExpectedConditions.visibilityOfElementLocated(obj));
    }

    public void waitForVisibilityByObj(WebDriver driver, int time, String type, String expression) {
        WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(time));
        if(type.equalsIgnoreCase("id")) {
            wt.until(ExpectedConditions.visibilityOfElementLocated(By.id(expression)));
        } else if(type.equalsIgnoreCase("css")) {
            wt.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(expression)));
        } else if(type.equalsIgnoreCase("xpath")) {
            wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(expression)));
        } else if(type.equalsIgnoreCase("class")) {
            wt.until(ExpectedConditions.visibilityOfElementLocated(By.className(expression)));
        } else {        //write for other locator types
            System.out.println("Invalid Locator type...!!!");
        }
    }
    public void waitForVisibilityByType(WebDriver driver, int time, String type, String expression) {
        WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(time));
        if(type.equalsIgnoreCase("id")) {
            wt.until(ExpectedConditions.visibilityOf(driver.findElement(By.id(expression))));
        } else if(type.equalsIgnoreCase("css")) {
            wt.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector(expression))));
        } else if(type.equalsIgnoreCase("xpath")) {
            wt.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(expression))));
        } else if(type.equalsIgnoreCase("class")) {
            wt.until(ExpectedConditions.visibilityOf(driver.findElement(By.className(expression))));
        } else {        //write for other locator types
            System.out.println("Invalid Locator type...!!!");
        }
    }

    public void waitForNumberOfWindows(WebDriver driver, int time, int numOfWindows) {
        WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(time));
        wt.until(ExpectedConditions.numberOfWindowsToBe(numOfWindows));
    }
    //block advertisements
    public void blockAd(WebDriver driver) {
        String pId = driver.getWindowHandle();
        Set<String> allWinIds = driver.getWindowHandles();
        if(allWinIds.size()>1) {
            Iterator<String> itr = allWinIds.iterator();
            String id = itr.next();
            if(id.equals(pId)) {
                id = itr.next();
            }
            driver.switchTo().window(id);
            driver.close();
            driver.switchTo().window(pId);
        }
    }

    public WebDriver startUp(String bName, String url) {
        WebDriver driver = null;
        if(bName.equalsIgnoreCase("ch") || bName.equalsIgnoreCase("chrome")) {
            //WebDriver driver = new ChromeDriver();
            //driver.manage().window().maximize();
            //OR
            ChromeOptions  options = new ChromeOptions();
            options.addArguments("--start-maximized");
            options.addArguments("--disable-notifications");
            options.addExtensions(new File("./AdBlocker/AdBlocker Ultimate.crx"));
            //options.addArguments("--headless");
            driver = new ChromeDriver(options);

        } else if(bName.equalsIgnoreCase("edge")) {
            //WebDriver driver = new EdgeDriver();
            //driver.manage().window().maximize();
            //OR
            EdgeOptions  options = new EdgeOptions();
            options.addArguments("--start-maximized");
            options.addArguments("--start-maximized");
            options.addArguments("--disable-notifications");
            options.addArguments("--headless");
            driver = new EdgeDriver(options);

        } else if(bName.equalsIgnoreCase("ff") || bName.equalsIgnoreCase("firefox")) {
            //WebDriver driver = new FirefoxDriver();
            //driver.manage().window().maximize();
            //OR

            FirefoxOptions  options = new FirefoxOptions();
            options.addArguments("--start-maximized");
            options.addArguments("--start-maximized");
            options.addArguments("--disable-notifications");
            options.addArguments("--headless");
            driver = new FirefoxDriver(options);

        } else {
            System.out.println("Invalid Browser name...!!!");
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        waitForNumberOfWindows(driver,  10, 2);
        blockAd(driver);
        driver.get(url);
        blockAd(driver);

        return driver;
    }
    public void startUp_old(String bName) {
        WebDriver driver = null;
        if(bName.equalsIgnoreCase("ch") || bName.equalsIgnoreCase("chrome")) {
            //WebDriver driver = new ChromeDriver();
            //driver.manage().window().maximize();
            //OR
            ChromeOptions  options = new ChromeOptions();
            options.addArguments("--start-maximized");
            options.addArguments("--disable-notifications");
            //options.addArguments("--headless");

            driver = new ChromeDriver(options);

        } else if(bName.equalsIgnoreCase("edge")) {
            //WebDriver driver = new EdgeDriver();
            //driver.manage().window().maximize();
            //OR
            EdgeOptions  options = new EdgeOptions();
            options.addArguments("--start-maximized");
            options.addArguments("--start-maximized");
            options.addArguments("--disable-notifications");
            options.addArguments("--headless");
            driver = new EdgeDriver(options);

        } else if(bName.equalsIgnoreCase("ff") || bName.equalsIgnoreCase("firefox")) {
            //WebDriver driver = new FirefoxDriver();
            //driver.manage().window().maximize();
            //OR

            FirefoxOptions  options = new FirefoxOptions();
            options.addArguments("--start-maximized");
            options.addArguments("--start-maximized");
            options.addArguments("--disable-notifications");
            options.addArguments("--headless");
            driver = new FirefoxDriver(options);

        } else {
            System.out.println("Invalid Browser name...!!!");
        }
        //driver.manage().window().maximize();
        //OR
        //driver.manage().window().fullscreen();      //full screen
        //driver.manage().window().minimize();

        //driver.manage().window().setSize(new Dimension(500,700));

        driver.get("https://www.google.com");

    }
}
