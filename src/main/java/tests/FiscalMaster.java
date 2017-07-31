package tests;

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
public class FiscalMaster{

    public WebDriver driver;

    @Before

    public void setup () throws InterruptedException {
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
    public  void fiscalmastertest() throws InterruptedException, AWTException {
        //Login Part
        LoginPart lp = new LoginPart();
        lp.Login(driver);
        Thread.sleep(3000);
        //Close Of LoginPart
        //driver.navigate().to(driver.getCurrentUrl());
        //driver.manage().window().maximize();
        //Thread.sleep(3000);

        //open  Fiscal Master Page
        driver.get("http://localhost:12441/#fiscalmaster");
        Thread.sleep(15000);

        //codefield area
        WebElement codefield = driver.findElement(By.name("code"));
        codefield.sendKeys(ENTER);
        codefield.sendKeys("2074/2075");
        Thread.sleep(1000);
        codefield.sendKeys(ENTER);
        codefield.clear();
        codefield.sendKeys(ENTER);
        Thread.sleep(5000);

        //View form detail
        WebElement grid2 = driver.findElement(By.id("fiscalYear-list-grid"));
        WebElement viewIcon = grid2.findElements(By.className("fa-eye")).get(0);
        JavascriptExecutor js2 = ((JavascriptExecutor) driver);
        js2.executeScript("arguments[0].click();", viewIcon);
        WebElement win1 = driver.findElement(By.id("master_general_FiscalYearFormWindow"));
        Thread.sleep(15000);
        WebElement Closebutton = driver.findElement(By.id("button-1143-btnEl"));
        Closebutton.click();
        Thread.sleep(2000);


        //Edit form fill up

        WebElement grid = driver.findElement(By.id("fiscalYear-list-grid"));
        WebElement editIcon = grid.findElements(By.className("fa-pencil-square-o")).get(0);

        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("arguments[0].click();", editIcon);
        WebElement win = driver.findElement(By.id("master_general_FiscalYearFormWindow"));
        Thread.sleep(7000);

        WebElement savebutton = win.findElements(By.className("fa-floppy-o")).get(0);
        js.executeScript("arguments[0].click();", savebutton);
        Thread.sleep(4000);
        WebElement okbutton = driver.findElement(By.id("button-1014-btnInnerEl"));
        okbutton.click();
        Thread.sleep(5000);

        //New Data Entry
        Actions action = new Actions(driver);
        action.keyDown(Keys.CONTROL).sendKeys(String.valueOf('\u0041')).keyUp(Keys.CONTROL).sendKeys(Keys.DELETE).perform();
        Thread.sleep(4000);
        WebElement newwin = driver.findElement(By.id("master_general_FiscalYearFormWindow"));
        newwin.findElement(By.name("code")).sendKeys("2074/2075");
        Thread.sleep(2000);
        newwin.findElement(By.name("code")).sendKeys(ENTER);
        Thread.sleep(4000);
        // newwin.findElement(By.name("description")).sendKeys("dfdf");
        //Thread.sleep(3000);
        WebElement fiscalsavebutton = newwin.findElements(By.className("fa-floppy-o")).get(0);
        js.executeScript("arguments[0].click();", fiscalsavebutton);
        WebElement newmodeokbutton = driver.findElement(By.id("button-1014-btnWrap"));
        newmodeokbutton.click();
        Thread.sleep(3000);
        WebElement validationmessage = driver.findElement(By.id("button-1013"));
        validationmessage.click();
        newwin.findElement(By.name("code")).clear();
        newwin.findElement(By.name("code")).sendKeys("2069/2070");
        newwin.findElement(By.name("code")).sendKeys(ENTER);
        newwin.findElement(By.name("description")).sendKeys("had");
        newwin.findElement(By.name("display_order")).sendKeys("2");
        Thread.sleep(2000);
        WebElement editfiscalsavebutton = newwin.findElements(By.className("fa-floppy-o")).get(0);
        js.executeScript("arguments[0].click();", editfiscalsavebutton);
        WebElement newmodeokbutton1 = driver.findElement(By.id("button-1014-btnWrap"));
        newmodeokbutton1.click();
        Thread.sleep(3000);
        WebElement grid1 = driver.findElement(By.id("master_general_FiscalYearFormWindow"));
        WebElement deleteicon = grid1.findElements(By.className("fa-trash-o")).get(1);
        JavascriptExecutor js1 = ((JavascriptExecutor) driver);
        js1.executeScript("arguments[0].click();", deleteicon);
        WebElement deleteokbutton = driver.findElement(By.id("button-1014-btnWrap"));
        Thread.sleep(3000);
        deleteokbutton.click();
        Thread.sleep(20000);
        //LocationHierarchy b=new LocationHierarchy();
        //b.locationhierarchy(driver);
    }
    @Test
    public void organazationstaff ()  throws InterruptedException, AWTException {

        LoginPart lp = new LoginPart();
        lp.Login(driver);

        //open  organazationstaff Master Page
        driver.get("http://localhost:12441/#organazationstaff");
        Thread.sleep(5000);

        //code field area
        WebElement codefield = driver.findElement(By.name("code"));
        WebElement staffselect = driver.findElement(By.name("org_id"));
        staffselect.clear();
        codefield.sendKeys(ENTER);
        codefield.sendKeys("02");
        Thread.sleep(1000);
        codefield.sendKeys(ENTER);
        codefield.clear();
        codefield.sendKeys(ENTER);
        Thread.sleep(3000);

        //View form detail
        WebElement grid2 = driver.findElement(By.id("staff-list-grid"));
        WebElement viewIcon = grid2.findElements(By.className("fa-eye")).get(0);
        JavascriptExecutor js2 = ((JavascriptExecutor) driver);
        js2.executeScript("arguments[0].click();", viewIcon);
        WebElement win1 = driver.findElement(By.id("staffFormView"));
        Thread.sleep(7000);
        WebElement Closebutton = driver.findElement(By.id("button-1126-btnEl"));
        Closebutton.click();
        Thread.sleep(2000);

        JavascriptExecutor js = ((JavascriptExecutor) driver);
        //Edit form fill up
       /* WebElement grid = driver.findElement(By.id("staff-list-grid-body"));
        WebElement editIcon = grid.findElements(By.className("fa-pencil-square-o")).get(0);



        //String str = editIcon.getAttribute("class");
        //System.out.println(str+"what");
        js.executeScript("arguments[0].click();", editIcon);
        WebElement win = driver.findElement(By.id("staffFormView"));
        win.findElement(By.name("code")).sendKeys("5");
        Thread.sleep(5000);
        WebElement savebutton = win.findElements(By.className("fa-floppy-o")).get(0);
        js.executeScript("arguments[0].click();", savebutton);
        Thread.sleep(4000);
        WebElement okbutton = driver.findElement(By.id("button-1014-btnWrap"));
        okbutton.click();
        Thread.sleep(5000);*/


        //New Data Entry
        Actions action = new Actions(driver);
        action.keyDown(Keys.CONTROL).sendKeys(String.valueOf('\u0041')).keyUp(Keys.CONTROL).sendKeys(Keys.DELETE).perform();
        Thread.sleep(4000);
        WebElement newwin = driver.findElement(By.id("staffFormView"));

        //test entry
        /*
        newwin.findElement(By.name("code")).sendKeys("02");
        Thread.sleep(2000);
        WebElement fiscalsavebutton = newwin.findElements(By.className("fa-floppy-o")).get(0);
        js.executeScript("arguments[0].click();", fiscalsavebutton);
        WebElement newmodeokbutton = driver.findElement(By.id("button-1014-btnWrap"));
        newmodeokbutton.click();
        Thread.sleep(3000);

        WebElement validationmessage = driver.findElement(By.id("button-1013"));
        validationmessage.click();*/

        newwin.findElement(By.name("code")).clear();
        newwin.findElement(By.name("code")).sendKeys("197");
        WebElement innerstaffselect = driver.findElement(By.name("org_id"));
/*        Select selcectclient1 = new Select(innerstaffselect);
        selcectclient1.selectByValue("3");*/
        newwin.findElement(By.name("name_np")).sendKeys("had");
        newwin.findElement(By.name("name_en")).sendKeys("had1");
        newwin.findElement(By.name("description")).sendKeys("had");
        newwin.findElement(By.name("display_order")).sendKeys("2");
        Thread.sleep(2000);
        WebElement editfiscalsavebutton = newwin.findElements(By.className("fa-floppy-o")).get(0);
        js.executeScript("arguments[0].click();", editfiscalsavebutton);
        WebElement newmodeokbutton1 = driver.findElement(By.id("button-1014-btnWrap"));
        newmodeokbutton1.click();
        Thread.sleep(3000);
        WebElement grid1 = driver.findElement(By.id("staff-list-grid"));
        WebElement deleteicon = grid1.findElements(By.className("fa-trash-o")).get(2);
        staffselect.clear();
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
    public void acquisitiontype ()  throws InterruptedException, AWTException {

        LoginPart lp = new LoginPart();
        lp.Login(driver);

        //open  acquisitiontype Master Page
        driver.get("http://localhost:12441/#acquisitiontype");
        Thread.sleep(5000);

        //code field area
        WebElement codefield = driver.findElement(By.name("code"));
        WebElement staffselect = driver.findElement(By.name("name___multi"));
        codefield.sendKeys(ENTER);
        codefield.sendKeys("2");
        Thread.sleep(1500);
        codefield.sendKeys(ENTER);
        codefield.clear();
        codefield.sendKeys(ENTER);
        Thread.sleep(3000);

        //View form detail
        WebElement grid2 = driver.findElement(By.id("acquisition-list-grid-body"));
        WebElement viewIcon = grid2.findElements(By.className("fa-eye")).get(0);
        JavascriptExecutor js2 = ((JavascriptExecutor) driver);
        js2.executeScript("arguments[0].click();", viewIcon);
        WebElement win1 = driver.findElement(By.id("acquisitionFormView"));
        Thread.sleep(7000);
        WebElement Closebutton = driver.findElement(By.id("button-1119-btnEl"));
        Closebutton.click();
        Thread.sleep(2000);

         //Edit  entry
        WebElement grid = driver.findElement(By.id("acquisition-list-grid-body"));
        WebElement editIcon = grid.findElements(By.className("fa-pencil-square-o")).get(0);

        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("arguments[0].click();", editIcon);
        WebElement win = driver.findElement(By.id("acquisitionFormView"));
        Thread.sleep(7000);
        WebElement newwin = driver.findElement(By.id("acquisitionFormView"));


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
        WebElement newwin1 = driver.findElement(By.id("acquisitionFormView"));
        newwin1.findElement(By.name("code")).clear();
        newwin1.findElement(By.name("code")).sendKeys("197");
        newwin1.findElement(By.name("name_np")).sendKeys("had");
        newwin1.findElement(By.name("name_en")).sendKeys("had1");
        newwin1.findElement(By.name("description")).sendKeys("had");
        newwin1.findElement(By.name("display_order")).sendKeys("2");
        Thread.sleep(2000);
        newwin1.findElement(By.id("button-1152-btnEl")).click();
       /* WebElement editacqsavebutton = newwin.findElements(By.className("fa-floppy-o")).get(0);
        js.executeScript("arguments[0].click();", editacqsavebutton);*/
        WebElement newmodeokbutton1 = driver.findElement(By.id("button-1014-btnWrap"));
        newmodeokbutton1.click();
        Thread.sleep(3000);

        //Deletion Part
        WebElement grid1 = driver.findElement(By.id("acquisition-list-grid"));
        WebElement deleteicon = grid1.findElements(By.className("fa-trash-o")).get(1);
        staffselect.clear();
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
    public void documenttype()  throws InterruptedException, AWTException {

        LoginPart lp = new LoginPart();
        lp.Login(driver);

        //open  acquisitiontype Master Page
        driver.get("http://localhost:12441/#documenttype");
        Thread.sleep(5000);

        //code field area
        WebElement codefield = driver.findElement(By.name("code"));
        codefield.sendKeys(ENTER);
        codefield.sendKeys("2");
        Thread.sleep(1500);
        codefield.sendKeys(ENTER);
        codefield.clear();
        codefield.sendKeys(ENTER);
        Thread.sleep(3000);

        //View form detail
        WebElement grid2 = driver.findElement(By.id("document-list-grid-body"));
        WebElement viewIcon = grid2.findElements(By.className("fa-eye")).get(0);
        JavascriptExecutor js2 = ((JavascriptExecutor) driver);
        js2.executeScript("arguments[0].click();", viewIcon);
        WebElement win1 = driver.findElement(By.id("documentFormView"));
        Thread.sleep(7000);
        WebElement Closebutton = driver.findElement(By.id("button-1120"));
        Closebutton.click();
        Thread.sleep(2000);

        //Edit  entry
        WebElement grid = driver.findElement(By.id("document-list-grid-body"));
        WebElement editIcon = grid.findElements(By.className("fa-pencil-square-o")).get(0);

        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("arguments[0].click();", editIcon);
        WebElement win = driver.findElement(By.id("documentFormView"));
        Thread.sleep(7000);
        WebElement newwin = driver.findElement(By.id("documentFormView"));


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
        WebElement newwin1 = driver.findElement(By.id("documentFormView"));
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
        WebElement grid1 = driver.findElement(By.id("document-list-grid"));
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
