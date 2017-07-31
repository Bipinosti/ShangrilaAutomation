package tests;

import org.openqa.selenium.*;

import static org.openqa.selenium.Keys.ENTER;


/**
 * Created by anupam on 11/16/2016.
 */

public class LocationHierarchy {
    public void locationhierarchy(WebDriver driver) throws InterruptedException {
        driver.get("http://localhost:12441/#locationhierarchy");
        //driver.manage().window().maximize();
        Thread.sleep(3000);
        WebElement locationhierarchycode=driver.findElement(By.name("code"));
        locationhierarchycode.sendKeys("dfdf");
        locationhierarchycode.sendKeys(ENTER);
        locationhierarchycode.clear();
        locationhierarchycode.sendKeys(ENTER);
        Thread.sleep(5000);
        WebElement treesearch=driver.findElement(By.id("loc_treePanel"));
        System.out.println ("Doggg");
        WebElement locationfilterserch= driver.findElements(By.className("x-tree-icon-parent")).get(0);
        JavascriptExecutor js=((JavascriptExecutor) driver);
        //js.executeScript("arguments[0].click();alert('hello!!');alert(arguments[0].innerHTML)",locationfilterserch);
        js.executeScript("arguments[0].click();",locationfilterserch);
        Thread.sleep(2000);
        WebElement treeiconclick=driver.findElements(By.className("x-tree-expander")).get(0);
        js.executeScript("arguments[0].click();",treeiconclick);
        System.out.println("Here it goes");
        Thread.sleep(4000);
        WebElement firstlocationclick=driver.findElements(By.className("x-tree-node-text ")).get(1);
        js.executeScript("arguments[0].click();",firstlocationclick);
        Thread.sleep(3000);
        WebElement firstlocationclick1=driver.findElements(By.className("x-tree-node-text ")).get(2);
        js.executeScript("arguments[0].click();",firstlocationclick1);

        Thread.sleep(3000);
        WebElement firstlocationclick2=driver.findElements(By.className("x-tree-node-text ")).get(3);
        js.executeScript("arguments[0].click();",firstlocationclick2);

        Thread.sleep(3000);
        WebElement firstlocationclick3=driver.findElements(By.className("x-tree-node-text ")).get(4);
        js.executeScript("arguments[0].click();",firstlocationclick3);

        Thread.sleep(3000);
        WebElement firstlocationclick4=driver.findElements(By.className("x-tree-node-text")).get(5);
        js.executeScript("arguments[0].click();",firstlocationclick4);

        /*//Thread.sleep(2000);
       // driver.findElement(By.id("loc_treeButton")).click();
        //WebElement treefilterserch=driver.findElement(By.name("searchtree_name"));
        treefilterserch.sendKeys("bhojpur");
        Thread.sleep(3000);
        treefilterserch.sendKeys(ENTER);
        Thread.sleep(5000);
        treefilterserch.clear();
        treefilterserch.sendKeys(ENTER);
*/




        /*WebElement locationhierarchycode=driver.findElement(By.name("name_multi"));
        locationhierarchycode.sendKeys("dfdf");
        locationfilterserch.sendKeys(ENTER);*/



        }

}
