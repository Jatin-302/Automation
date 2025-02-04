package org.jan17_25;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.utilities.GenericUtility;
import java.util.Iterator;
import java.util.Set;

public class AmazonEx {
    public static void main(String[]args)  {
        String amazonbName="ch";
        String amazonURL ="https://www.amazon.in/";

        GenericUtility gu = new GenericUtility();
        WebDriver driver = gu.startUp(amazonbName,amazonURL);

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 13R");
        driver.findElement(By.id("nav-search-submit-button")).click();
        System.out.println(driver.getTitle());
        String parentid = driver.getWindowHandle();
        System.out.println(parentid);

/*     WAY 1 :
         Add to cart
        driver.findElement(By.cssSelector("#a-autoid-2-announce")).click();

        driver.findElement(By.cssSelector("#nav-cart-count")).click();

       WebElement price = driver.findElement(By.xpath("//span[@id='sc-subtotal-amount-activecart']/span"));
        System.out.println(price.getText());
*/

        /*driver.findElement(By.cssSelector("span.a-icon.a-icon-small-add")).click();
        WebElement price2 = driver.findElement(By.)*/

        // WAY 2 :
        driver.findElement(By.xpath("//span[contains(text(),'256GB Storage Nebula Noir')]")).click();
        System.out.println(driver.getTitle());

        gu.scrollByPageDown(driver,1);

        Set<String> allWinIds = driver.getWindowHandles();
        Iterator<String> itr = allWinIds.iterator();
        while(itr.hasNext()) {
            String childid = itr.next();
            if(childid.equals(parentid)) {
                childid = itr.next();
            }
            driver.switchTo().window(childid);
            System.out.println(childid);
            System.out.println(driver.getTitle());

           WebElement ele= driver.findElement(By.xpath("(//input[@id='add-to-cart-button'])[2]"));
           gu.clickByActions(driver,ele);
           //gu.clickByJS(driver,ele);
            //ele.click();

        }

    }
}
