package tests;


import static org.openqa.selenium.Keys.ENTER;

import JavaObject.LoginPage;
import JavaObject.LoginPart;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.JavascriptExecutor;
import java.awt.*;

import static org.openqa.selenium.Keys.ENTER;

/**
 * Created by bipin on 25-Jul-17.
 */
public class Jagga {

    public WebDriver driver;

    @Before

    public void setup() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

        //this.driver=new FirefoxDriver();
        //System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        this.driver = new ChromeDriver();
        //System.setProperty("webdriver.ie.driver","src/main/resources/IEDriverServer.exe");
        //driver=new InternetExplorerDriver();
        driver.get("http://localhost:12441//Home/Login");
        driver.navigate().refresh();
        Thread.sleep(2000);
    }
    @Test
    public  void areaunit() throws InterruptedException, AWTException {
        LoginPart lp = new LoginPart();
        lp.Login(driver);

        //open  acquisitiontype Master Page
        driver.get("http://localhost:12441/#areaunit");
        Thread.sleep(5000);

        //code field area
        WebElement codefield = driver.findElement(By.name("code"));
        codefield.sendKeys(ENTER);
        codefield.sendKeys("4");
        Thread.sleep(1500);
        codefield.sendKeys(ENTER);
        codefield.clear();
        codefield.sendKeys(ENTER);
        Thread.sleep(3000);

        //View form detail
        WebElement grid2 = driver.findElement(By.id("AreaUnit-list-grid"));
        WebElement viewIcon = grid2.findElements(By.className("fa-eye")).get(0);
        JavascriptExecutor js2 = ((JavascriptExecutor) driver);
        js2.executeScript("arguments[0].click();", viewIcon);
        WebElement win1 = driver.findElement(By.id("master_land_AreaUnitFormWindow"));
        Thread.sleep(7000);
        WebElement Closebutton = driver.findElement(By.id("button-1123"));
        Closebutton.click();
        Thread.sleep(2000);

        //Edit  entry
        WebElement grid = driver.findElement(By.id("AreaUnit-list-grid"));
        WebElement editIcon = grid.findElements(By.className("fa-pencil-square-o")).get(0);

        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("arguments[0].click();", editIcon);
        WebElement win = driver.findElement(By.id("master_land_AreaUnitFormWindow"));
        Thread.sleep(7000);
        WebElement newwin = driver.findElement(By.id("master_land_AreaUnitFormWindow"));


        newwin.findElement(By.name("description")).sendKeys("dfdf");
        Thread.sleep(3000);


        WebElement savebutton = win.findElements(By.className("fa-floppy-o")).get(0);
        js.executeScript("arguments[0].click();", savebutton);
        Thread.sleep(4000);
        WebElement okbutton = driver.findElement(By.id("button-1014-btnInnerEl"));
        okbutton.click();
        Thread.sleep(5000);

        //New Data Entry
        Actions action = new Actions(driver);
        action.keyDown(Keys.CONTROL).sendKeys(String.valueOf('\u0041')).keyUp(Keys.CONTROL).sendKeys(Keys.DELETE).perform();
        Thread.sleep(5000);
        WebElement newwin1 = driver.findElement(By.id("master_land_AreaUnitFormWindow"));
        newwin1.findElement(By.name("code")).clear();
        newwin1.findElement(By.name("code")).sendKeys("197");
        newwin1.findElement(By.name("sq_feet_per_unit")).sendKeys("3");
        newwin1.findElement(By.name("name_np")).sendKeys("had");
        newwin1.findElement(By.name("name_en")).sendKeys("had1");
        newwin1.findElement(By.name("description")).sendKeys("had");
        newwin1.findElement(By.name("display_order")).sendKeys("2");
        Thread.sleep(2000);
        newwin1.findElement(By.className("fa-floppy-o")).click();
        /*WebElement editacqsavebutton = newwin.findElements(By.className("fa-floppy-o")).get(0);
        js.executeScript("arguments[0].click();", editacqsavebutton);*/
        WebElement newmodeokbutton1 = driver.findElement(By.id("button-1014"));
        newmodeokbutton1.click();
        Thread.sleep(3000);

       //Deletion Part
        codefield.sendKeys(ENTER);
        WebElement grid1 = driver.findElement(By.id("AreaUnit-list-grid-body"));
        WebElement deleteicon = grid1.findElements(By.className("fa-trash-o")).get(1);
        JavascriptExecutor js1 = ((JavascriptExecutor) driver);
        js1.executeScript("arguments[0].click();", deleteicon);
        WebElement deleteokbutton = driver.findElement(By.id("button-1014-btnWrap"));
        Thread.sleep(3000);
        deleteokbutton.click();
        Thread.sleep(15000);
        //LocationHierarchy b=new LocationHierarchy();
        //b.locationhierarchy(driver);

    }

    @Test
    public  void landnature() throws InterruptedException, AWTException {
        LoginPart lp = new LoginPart();
        lp.Login(driver);

        //open  acquisitiontype Master Page
        driver.get("http://localhost:12441/#landnature");
        Thread.sleep(5000);

        //code field area
        WebElement codefield = driver.findElement(By.name("code"));
        codefield.sendKeys(ENTER);
        codefield.sendKeys("8");
        Thread.sleep(1500);
        codefield.sendKeys(ENTER);
        codefield.clear();
        codefield.sendKeys(ENTER);
        Thread.sleep(3000);

        //View form detail
        WebElement grid2 = driver.findElement(By.id("landnature-list-grid"));
        WebElement viewIcon = grid2.findElements(By.className("fa-eye")).get(0);
        JavascriptExecutor js2 = ((JavascriptExecutor) driver);
        js2.executeScript("arguments[0].click();", viewIcon);
        WebElement win1 = driver.findElement(By.id("landnatureFormView"));
        Thread.sleep(7000);
        WebElement Closebutton = driver.findElement(By.id("button-1119"));
        Closebutton.click();
        Thread.sleep(2000);

        //Edit  entry
        WebElement grid = driver.findElement(By.id("landnature-list-grid"));
        WebElement editIcon = grid.findElements(By.className("fa-pencil-square-o")).get(0);

        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("arguments[0].click();", editIcon);
        WebElement win = driver.findElement(By.id("landnatureFormView"));
        Thread.sleep(7000);
        WebElement newwin = driver.findElement(By.id("landnatureFormView"));


        newwin.findElement(By.name("description")).sendKeys("dfdf");
        Thread.sleep(3000);


        WebElement savebutton = win.findElements(By.className("fa-floppy-o")).get(0);
        js.executeScript("arguments[0].click();", savebutton);
        Thread.sleep(4000);
        WebElement okbutton = driver.findElement(By.id("button-1014-btnInnerEl"));
        okbutton.click();
        Thread.sleep(5000);

        //New Data Entry
        Actions action = new Actions(driver);
        action.keyDown(Keys.CONTROL).sendKeys(String.valueOf('\u0041')).keyUp(Keys.CONTROL).sendKeys(Keys.DELETE).perform();
        Thread.sleep(5000);
        WebElement newwin1 = driver.findElement(By.id("landnatureFormView"));
        newwin1.findElement(By.name("code")).clear();
        newwin1.findElement(By.name("code")).sendKeys("197");
        newwin1.findElement(By.name("name_np")).sendKeys("had");
        newwin1.findElement(By.name("name_en")).sendKeys("had1");
        newwin1.findElement(By.name("description")).sendKeys("had");
        newwin1.findElement(By.name("display_order")).sendKeys("2");
        Thread.sleep(2000);
        newwin1.findElement(By.className("fa-floppy-o")).click();
        /*WebElement editacqsavebutton = newwin.findElements(By.className("fa-floppy-o")).get(0);
        js.executeScript("arguments[0].click();", editacqsavebutton);*/
        WebElement newmodeokbutton1 = driver.findElement(By.id("button-1014"));
        newmodeokbutton1.click();
        Thread.sleep(3000);

        //Deletion Part
        codefield.sendKeys(ENTER);
        Thread.sleep(3000);
        WebElement grid1 = driver.findElement(By.id("landnature-list-grid"));
        WebElement deleteicon = grid1.findElements(By.className("fa-trash-o")).get(1);
        JavascriptExecutor js1 = ((JavascriptExecutor) driver);
        js1.executeScript("arguments[0].click();", deleteicon);
        WebElement deleteokbutton = driver.findElement(By.id("button-1014-btnWrap"));
        Thread.sleep(3000);
        deleteokbutton.click();
        Thread.sleep(15000);
        //LocationHierarchy b=new LocationHierarchy();
        //b.locationhierarchy(driver);

    }
    @Test
    public  void landquality() throws InterruptedException, AWTException {
        LoginPart lp = new LoginPart();
        lp.Login(driver);

        //open  acquisitiontype Master Page
        driver.get("http://localhost:12441/#landquality");
        Thread.sleep(5000);

        //code field area
        WebElement codefield = driver.findElement(By.name("code"));
        codefield.sendKeys(ENTER);
        codefield.sendKeys("4");
        Thread.sleep(1500);
        codefield.sendKeys(ENTER);
        codefield.clear();
        codefield.sendKeys(ENTER);
        Thread.sleep(3000);

        //View form detail
        WebElement grid2 = driver.findElement(By.id("landquality-list-grid"));
        WebElement viewIcon = grid2.findElements(By.className("fa-eye")).get(0);
        JavascriptExecutor js2 = ((JavascriptExecutor) driver);
        js2.executeScript("arguments[0].click();", viewIcon);
        WebElement win1 = driver.findElement(By.id("landqualityFormView"));
        Thread.sleep(7000);
        WebElement Closebutton = driver.findElement(By.id("button-1119"));
        Closebutton.click();
        Thread.sleep(2000);

       /* //Edit  entry
        WebElement grid = driver.findElement(By.id("landquality-list-grid"));
        WebElement editIcon = grid.findElements(By.className("fa-pencil-square-o")).get(0);

        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("arguments[0].click();", editIcon);
        WebElement win = driver.findElement(By.id("landqualityFormView"));
        Thread.sleep(7000);
        WebElement newwin = driver.findElement(By.id("landqualityFormView"));


        newwin.findElement(By.name("description")).sendKeys("dfdf");
        Thread.sleep(3000);


        WebElement savebutton = win.findElements(By.className("fa-floppy-o")).get(0);
        js.executeScript("arguments[0].click();", savebutton);
        Thread.sleep(4000);
        WebElement okbutton = driver.findElement(By.id("button-1014-btnInnerEl"));
        okbutton.click();
        Thread.sleep(5000);*/

        //New Data Entry
        Actions action = new Actions(driver);
        action.keyDown(Keys.CONTROL).sendKeys(String.valueOf('\u0041')).keyUp(Keys.CONTROL).sendKeys(Keys.DELETE).perform();
        Thread.sleep(5000);
        WebElement newwin1 = driver.findElement(By.id("landqualityFormView"));
        newwin1.findElement(By.name("code")).clear();
        newwin1.findElement(By.name("code")).sendKeys("197");
        newwin1.findElement(By.name("name_np")).sendKeys("had");
        newwin1.findElement(By.name("name_en")).sendKeys("had1");
        newwin1.findElement(By.name("description")).sendKeys("had");
        newwin1.findElement(By.name("display_order")).sendKeys("2");
        Thread.sleep(2000);
        newwin1.findElement(By.className("fa-floppy-o")).click();
        /*WebElement editacqsavebutton = newwin.findElements(By.className("fa-floppy-o")).get(0);
        js.executeScript("arguments[0].click();", editacqsavebutton);*/
        WebElement newmodeokbutton1 = driver.findElement(By.id("button-1014"));
        newmodeokbutton1.click();
        Thread.sleep(3000);

        //Deletion Part
        codefield.sendKeys(ENTER);
        Thread.sleep(3000);
        WebElement grid1 = driver.findElement(By.id("landquality-list-grid"));
        WebElement deleteicon = grid1.findElements(By.className("fa-trash-o")).get(1);
        JavascriptExecutor js1 = ((JavascriptExecutor) driver);
        js1.executeScript("arguments[0].click();", deleteicon);
        WebElement deleteokbutton = driver.findElement(By.id("button-1014-btnWrap"));
        Thread.sleep(3000);
        deleteokbutton.click();
        Thread.sleep(15000);
        //LocationHierarchy b=new LocationHierarchy();
        //b.locationhierarchy(driver);
    }
    @Test
    public  void landuse() throws InterruptedException, AWTException {
        LoginPart lp = new LoginPart();
        lp.Login(driver);

        //open  acquisitiontype Master Page
        driver.get("http://localhost:12441/#landuse");
        Thread.sleep(5000);

        //code field area
        WebElement codefield = driver.findElement(By.name("code"));
        codefield.sendKeys(ENTER);
        codefield.sendKeys("8");
        Thread.sleep(1500);
        codefield.sendKeys(ENTER);
        codefield.clear();
        codefield.sendKeys(ENTER);
        Thread.sleep(3000);

        //View form detail
        WebElement grid2 = driver.findElement(By.id("landuse-list-grid"));
        WebElement viewIcon = grid2.findElements(By.className("fa-eye")).get(0);
        JavascriptExecutor js2 = ((JavascriptExecutor) driver);
        js2.executeScript("arguments[0].click();", viewIcon);
        WebElement win1 = driver.findElement(By.id("landuseFormView"));
        Thread.sleep(7000);
        WebElement Closebutton = driver.findElement(By.id("button-1119"));
        Closebutton.click();
        Thread.sleep(2000);

        //Edit  entry
        WebElement grid = driver.findElement(By.id("landuse-list-grid"));
        WebElement editIcon = grid.findElements(By.className("fa-pencil-square-o")).get(0);

        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("arguments[0].click();", editIcon);
        WebElement win = driver.findElement(By.id("landuseFormView"));
        Thread.sleep(7000);
        WebElement newwin = driver.findElement(By.id("landuseFormView"));


        newwin.findElement(By.name("description")).sendKeys("dfdf");
        Thread.sleep(3000);


        WebElement savebutton = win.findElements(By.className("fa-floppy-o")).get(0);
        js.executeScript("arguments[0].click();", savebutton);
        Thread.sleep(4000);
        WebElement okbutton = driver.findElement(By.id("button-1014-btnInnerEl"));
        okbutton.click();
        Thread.sleep(5000);

        //New Data Entry
        Actions action = new Actions(driver);
        action.keyDown(Keys.CONTROL).sendKeys(String.valueOf('\u0041')).keyUp(Keys.CONTROL).sendKeys(Keys.DELETE).perform();
        Thread.sleep(5000);
        WebElement newwin1 = driver.findElement(By.id("landuseFormView"));
        newwin1.findElement(By.name("code")).clear();
        newwin1.findElement(By.name("code")).sendKeys("197");
        newwin1.findElement(By.name("name_np")).sendKeys("had");
        newwin1.findElement(By.name("name_en")).sendKeys("had1");
        newwin1.findElement(By.name("description")).sendKeys("had");
        newwin1.findElement(By.name("display_order")).sendKeys("2");
        Thread.sleep(2000);
        newwin1.findElement(By.className("fa-floppy-o")).click();
        /*WebElement editacqsavebutton = newwin.findElements(By.className("fa-floppy-o")).get(0);
        js.executeScript("arguments[0].click();", editacqsavebutton);*/
        WebElement newmodeokbutton1 = driver.findElement(By.id("button-1014"));
        newmodeokbutton1.click();
        Thread.sleep(3000);

        //Deletion Part
        codefield.sendKeys(ENTER);
        Thread.sleep(3000);
        WebElement grid1 = driver.findElement(By.id("landuse-list-grid"));
        WebElement deleteicon = grid1.findElements(By.className("fa-trash-o")).get(1);
        JavascriptExecutor js1 = ((JavascriptExecutor) driver);
        js1.executeScript("arguments[0].click();", deleteicon);
        WebElement deleteokbutton = driver.findElement(By.id("button-1014-btnWrap"));
        Thread.sleep(3000);
        deleteokbutton.click();
        Thread.sleep(15000);
        //LocationHierarchy b=new LocationHierarchy();
        //b.locationhierarchy(driver);

    }

    @Test
    public  void locationfactor() throws InterruptedException, AWTException {
        LoginPart lp = new LoginPart();
        lp.Login(driver);

        //open  acquisitiontype Master Page
        driver.get("http://localhost:12441/#locationfactor");
        Thread.sleep(5000);

        //code field area
        WebElement codefield = driver.findElement(By.name("code"));
        codefield.sendKeys(ENTER);
        codefield.sendKeys("8");
        Thread.sleep(1500);
        codefield.sendKeys(ENTER);
        codefield.clear();
        codefield.sendKeys(ENTER);
        Thread.sleep(3000);

        //View form detail
        WebElement grid2 = driver.findElement(By.id("locationfactor-list-grid"));
        WebElement viewIcon = grid2.findElements(By.className("fa-eye")).get(0);
        JavascriptExecutor js2 = ((JavascriptExecutor) driver);
        js2.executeScript("arguments[0].click();", viewIcon);
        WebElement win1 = driver.findElement(By.id("locationfactorFormView"));
        Thread.sleep(7000);
        WebElement Closebutton = driver.findElement(By.id("button-1119"));
        Closebutton.click();
        Thread.sleep(2000);

        //Edit  entry
        WebElement grid = driver.findElement(By.id("locationfactor-list-grid"));
        WebElement editIcon = grid.findElements(By.className("fa-pencil-square-o")).get(0);

        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("arguments[0].click();", editIcon);
        WebElement win = driver.findElement(By.id("locationfactorFormView"));
        Thread.sleep(7000);
        WebElement newwin = driver.findElement(By.id("locationfactorFormView"));


        newwin.findElement(By.name("description")).sendKeys("dfdf");
        Thread.sleep(3000);


        WebElement savebutton = win.findElements(By.className("fa-floppy-o")).get(0);
        js.executeScript("arguments[0].click();", savebutton);
        Thread.sleep(4000);
        WebElement okbutton = driver.findElement(By.id("button-1014-btnInnerEl"));
        okbutton.click();
        Thread.sleep(5000);

        //New Data Entry
        Actions action = new Actions(driver);
        action.keyDown(Keys.CONTROL).sendKeys(String.valueOf('\u0041')).keyUp(Keys.CONTROL).sendKeys(Keys.DELETE).perform();
        Thread.sleep(5000);
        WebElement newwin1 = driver.findElement(By.id("locationfactorFormView"));
        newwin1.findElement(By.name("code")).clear();
        newwin1.findElement(By.name("code")).sendKeys("197");
        newwin1.findElement(By.name("name_np")).sendKeys("had");
        newwin1.findElement(By.name("name_en")).sendKeys("had1");
        newwin1.findElement(By.name("description")).sendKeys("had");
        newwin1.findElement(By.name("display_order")).sendKeys("2");
        Thread.sleep(2000);
        newwin1.findElement(By.className("fa-floppy-o")).click();
        /*WebElement editacqsavebutton = newwin.findElements(By.className("fa-floppy-o")).get(0);
        js.executeScript("arguments[0].click();", editacqsavebutton);*/
        WebElement newmodeokbutton1 = driver.findElement(By.id("button-1014"));
        newmodeokbutton1.click();
        Thread.sleep(3000);

       //Deletion Part
        codefield.sendKeys(ENTER);
        Thread.sleep(3000);
        WebElement grid1 = driver.findElement(By.id("locationfactor-list-grid"));
        WebElement deleteicon = grid1.findElements(By.className("fa-trash-o")).get(3);
        JavascriptExecutor js1 = ((JavascriptExecutor) driver);
        js1.executeScript("arguments[0].click();", deleteicon);
        WebElement deleteokbutton = driver.findElement(By.id("button-1014-btnWrap"));
        Thread.sleep(3000);
        deleteokbutton.click();
        Thread.sleep(15000);
        //LocationHierarchy b=new LocationHierarchy();
        //b.locationhierarchy(driver);

    }

}

