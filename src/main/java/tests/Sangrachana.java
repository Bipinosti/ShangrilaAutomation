package tests;

import JavaObject.LoginPart;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;

import static org.openqa.selenium.Keys.ENTER;

/**
 * Created by bipin on 30-Jul-17.
 */
public class Sangrachana {
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
    public  void constructiontype() throws InterruptedException, AWTException {
        LoginPart lp = new LoginPart();
        lp.Login(driver);

        //open  acquisitiontype Master Page
        driver.get("http://localhost:12441/#constructiontype");
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
        WebElement grid2 = driver.findElement(By.id("constructionType_list_grid"));
        Thread.sleep(500);
        WebElement viewIcon = grid2.findElements(By.className("fa-eye")).get(0);
        JavascriptExecutor js2 = ((JavascriptExecutor) driver);
        js2.executeScript("arguments[0].click();", viewIcon);
        WebElement win1 = driver.findElement(By.id("master_construction_ConstructionTypeFormWindow"));
        Thread.sleep(7000);
        WebElement Closebutton = driver.findElement(By.id("button-1121"));
        Closebutton.click();
        Thread.sleep(2000);

        //Edit  entry
        WebElement grid = driver.findElement(By.id("constructionType_list_grid"));
        WebElement editIcon = grid.findElements(By.className("fa-pencil-square-o")).get(0);

        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("arguments[0].click();", editIcon);
        WebElement win = driver.findElement(By.id("master_construction_ConstructionTypeFormWindow"));
        Thread.sleep(7000);
        WebElement newwin = driver.findElement(By.id("master_construction_ConstructionTypeFormWindow"));


        newwin.findElement(By.name("description")).sendKeys("df");
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
        WebElement newwin1 = driver.findElement(By.id("master_construction_ConstructionTypeFormWindow"));
        newwin1.findElement(By.name("code")).clear();
        newwin1.findElement(By.name("code")).sendKeys("197");
        newwin1.findElement(By.name("name_np")).sendKeys("had");
        newwin1.findElement(By.name("name_en")).sendKeys("had1");
        newwin1.findElement(By.name("description")).sendKeys("had");
        newwin1.findElement(By.name("max_life_years")).sendKeys("5");
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
        WebElement grid1 = driver.findElement(By.id("constructionType_list_grid"));
        WebElement deleteicon = grid1.findElements(By.className("fa-trash-o")).get(0);
        JavascriptExecutor js1 = ((JavascriptExecutor) driver);
        js1.executeScript("arguments[0].click();", deleteicon);
        WebElement deleteokbutton = driver.findElement(By.id("button-1014-btnWrap"));
        Thread.sleep(3000);
        deleteokbutton.click();
        Thread.sleep(15000);
        //LocationHierarchy b=new LocationHierarchy();
    }

    @Test
    public  void constructionexclusionreason() throws InterruptedException, AWTException {
        LoginPart lp = new LoginPart();
        lp.Login(driver);

        //open  acquisitiontype Master Page
        driver.get("http://localhost:12441/#constructionexclusionreason");
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
        WebElement grid2 = driver.findElement(By.id("ConstructExclusionReasonListGrid"));
        Thread.sleep(500);
        WebElement viewIcon = grid2.findElements(By.className("fa-eye")).get(0);
        JavascriptExecutor js2 = ((JavascriptExecutor) driver);
        js2.executeScript("arguments[0].click();", viewIcon);
        WebElement win1 = driver.findElement(By.id("ConstructExclusionReasonFormView"));
        Thread.sleep(7000);
        WebElement Closebutton = driver.findElement(By.id("button-1119"));
        Closebutton.click();
        Thread.sleep(2000);

        //Edit  entry
        WebElement grid = driver.findElement(By.id("ConstructExclusionReasonListGrid"));
        WebElement editIcon = grid.findElements(By.className("fa-pencil-square-o")).get(1);

        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("arguments[0].click();", editIcon);
        WebElement win = driver.findElement(By.id("ConstructExclusionReasonFormView"));
        Thread.sleep(7000);
        WebElement newwin = driver.findElement(By.id("ConstructExclusionReasonFormView"));


        newwin.findElement(By.name("description")).sendKeys("df");
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
        WebElement newwin1 = driver.findElement(By.id("ConstructExclusionReasonFormView"));
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
        WebElement grid1 = driver.findElement(By.id("ConstructExclusionReasonListGrid"));
        WebElement deleteicon = grid1.findElements(By.className("fa-trash-o")).get(1);
        JavascriptExecutor js1 = ((JavascriptExecutor) driver);
        js1.executeScript("arguments[0].click();", deleteicon);
        WebElement deleteokbutton = driver.findElement(By.id("button-1014-btnWrap"));
        Thread.sleep(3000);
        deleteokbutton.click();
        Thread.sleep(15000);
       // floordamagetype();
    }

    @Test
    public  void floordamagetype() throws InterruptedException, AWTException {
        LoginPart lp = new LoginPart();
        lp.Login(driver);

        //open  acquisitiontype Master Page
        driver.get("http://localhost:12441/#floordamagetype");
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
        WebElement grid2 = driver.findElement(By.id("floordamageType-list-grid"));
        Thread.sleep(500);
        WebElement viewIcon = grid2.findElements(By.className("fa-eye")).get(0);
        JavascriptExecutor js2 = ((JavascriptExecutor) driver);
        js2.executeScript("arguments[0].click();", viewIcon);
        WebElement win1 = driver.findElement(By.id("floordamageTypeFormView"));
        Thread.sleep(7000);
        WebElement Closebutton = driver.findElement(By.id("button-1119"));
        Closebutton.click();
        Thread.sleep(2000);

        //Edit  entry
        WebElement grid = driver.findElement(By.id("floordamageType-list-grid"));
        WebElement editIcon = grid.findElements(By.className("fa-pencil-square-o")).get(1);

        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("arguments[0].click();", editIcon);
        WebElement win = driver.findElement(By.id("floordamageTypeFormView"));
        Thread.sleep(7000);
        WebElement newwin = driver.findElement(By.id("floordamageTypeFormView"));


        newwin.findElement(By.name("description")).sendKeys("df");
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
        WebElement newwin1 = driver.findElement(By.id("floordamageTypeFormView"));
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
        WebElement grid1 = driver.findElement(By.id("floordamageType-list-grid"));
        WebElement deleteicon = grid1.findElements(By.className("fa-trash-o")).get(2);
        JavascriptExecutor js1 = ((JavascriptExecutor) driver);
        js1.executeScript("arguments[0].click();", deleteicon);
        WebElement deleteokbutton = driver.findElement(By.id("button-1014-btnWrap"));
        Thread.sleep(3000);
        deleteokbutton.click();
        Thread.sleep(10000);
        //constructionusetype();
    }
    @Test
    public  void constructionusetype() throws InterruptedException, AWTException {
      LoginPart lp = new LoginPart();
        lp.Login(driver);

        //open  acquisitiontype Master Page
        driver.get("http://localhost:12441/#constructionusetype");
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
        WebElement grid2 = driver.findElement(By.id("constructionUse-list-grid"));
        Thread.sleep(500);
        WebElement viewIcon = grid2.findElements(By.className("fa-eye")).get(0);
        JavascriptExecutor js2 = ((JavascriptExecutor) driver);
        js2.executeScript("arguments[0].click();", viewIcon);
        WebElement win1 = driver.findElement(By.id("constructionUseFormView"));
        Thread.sleep(7000);
        WebElement Closebutton = driver.findElement(By.id("button-1218"));
        Closebutton.click();
        Thread.sleep(2000);

        //Edit  entry
        WebElement grid = driver.findElement(By.id("constructionUse-list-grid"));
        WebElement editIcon = grid.findElements(By.className("fa-pencil-square-o")).get(0);

        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("arguments[0].click();", editIcon);
        WebElement win = driver.findElement(By.id("constructionUseFormView"));
        Thread.sleep(7000);
        WebElement newwin = driver.findElement(By.id("constructionUseFormView"));


        newwin.findElement(By.name("description")).sendKeys("df");
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
        WebElement newwin1 = driver.findElement(By.id("constructionUseFormView"));
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
        WebElement grid1 = driver.findElement(By.id("constructionUse-list-grid"));
        WebElement deleteicon = grid1.findElements(By.className("fa-trash-o")).get(0);
        JavascriptExecutor js1 = ((JavascriptExecutor) driver);
        js1.executeScript("arguments[0].click();", deleteicon);
        WebElement deleteokbutton = driver.findElement(By.id("button-1014-btnWrap"));
        Thread.sleep(3000);
        deleteokbutton.click();
        Thread.sleep(10000);
    }
}

