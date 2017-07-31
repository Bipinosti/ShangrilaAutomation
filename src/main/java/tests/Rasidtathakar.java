package tests;

import JavaObject.LoginPart;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;

import static org.openqa.selenium.Keys.ENTER;

/**
 * Created by bipin on 30-Jul-17.
 */
public class Rasidtathakar {
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
    public  void collectioncounter() throws InterruptedException, AWTException {
        LoginPart lp = new LoginPart();
        lp.Login(driver);

        //open  collectioncounter Master Page
        driver.get("http://localhost:12441/#collectioncounter");
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
        WebElement grid2 = driver.findElement(By.id("counter-list-grid"));
        Thread.sleep(500);
        WebElement viewIcon = grid2.findElements(By.className("fa-eye")).get(0);
        JavascriptExecutor js2 = ((JavascriptExecutor) driver);
        js2.executeScript("arguments[0].click();", viewIcon);
        WebElement win1 = driver.findElement(By.id("counterFormView"));
        Thread.sleep(7000);
        WebElement Closebutton = driver.findElement(By.id("button-1130"));
        Closebutton.click();
        Thread.sleep(2000);

       /* //Edit  entry
        WebElement grid = driver.findElement(By.id("counter-list-grid"));
        WebElement editIcon = grid.findElements(By.className("fa-pencil-square-o")).get(0);

        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("arguments[0].click();", editIcon);
        WebElement win = driver.findElement(By.id("counterFormView"));
        Thread.sleep(7000);
        WebElement newwin = driver.findElement(By.id("counterFormView"));


        newwin.findElement(By.name("description")).sendKeys("df");
        Thread.sleep(3000);


        WebElement savebutton = win.findElements(By.className("fa-floppy-o")).get(0);
        js.executeScript("arguments[0].click();", savebutton);
        Thread.sleep(4000);
        WebElement okbutton = driver.findElement(By.id("button-1014-btnInnerEl"));
        okbutton.click();
        Thread.sleep(5000);
*/
        //New Data Entry
        Actions action = new Actions(driver);
        action.keyDown(Keys.CONTROL).sendKeys(String.valueOf('\u0041')).keyUp(Keys.CONTROL).sendKeys(Keys.DELETE).perform();
        Thread.sleep(5000);
        WebElement newwin1 = driver.findElement(By.id("counterFormView"));
        newwin1.findElement(By.name("code")).clear();

       /* Select select= new Select (newwin1.findElement(By.name("allowed_user_id")));
        select.selectByValue("3");

        Select select1= new Select (newwin1.findElement(By.name("org_id")));
        select1.selectByIndex(Integer.parseInt("3"));*/

        newwin1.findElement(By.name("code")).sendKeys("197");
        newwin1.findElement(By.name("name_np")).sendKeys("had");
        newwin1.findElement(By.name("name_en")).sendKeys("had1");
        newwin1.findElement(By.name("computer_name")).sendKeys("Personal_Computer");
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
        WebElement grid1 = driver.findElement(By.id("counter-list-grid"));
        WebElement deleteicon = grid1.findElements(By.className("fa-trash-o")).get(2);
        JavascriptExecutor js1 = ((JavascriptExecutor) driver);
        js1.executeScript("arguments[0].click();", deleteicon);
        WebElement deleteokbutton = driver.findElement(By.id("button-1014-btnWrap"));
        Thread.sleep(3000);
        deleteokbutton.click();
        Thread.sleep(10000);
    }
    @Test
    public  void receiptType() throws InterruptedException, AWTException {
        LoginPart lp = new LoginPart();
        lp.Login(driver);

        //open  receiptType Master Page
        driver.get("http://localhost:12441/#receiptType");
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
        WebElement grid2 = driver.findElement(By.id("receiptType-list-grid"));
        Thread.sleep(500);
        WebElement viewIcon = grid2.findElements(By.className("fa-eye")).get(0);
        JavascriptExecutor js2 = ((JavascriptExecutor) driver);
        js2.executeScript("arguments[0].click();", viewIcon);
        WebElement win1 = driver.findElement(By.id("receiptTypeFormView"));
        Thread.sleep(7000);
        WebElement Closebutton = driver.findElement(By.id("button-1122"));
        Closebutton.click();
        Thread.sleep(2000);

        //Edit  entry
        WebElement grid = driver.findElement(By.id("receiptType-list-grid"));
        WebElement editIcon = grid.findElements(By.className("fa-pencil-square-o")).get(6);

        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("arguments[0].click();", editIcon);
        WebElement win = driver.findElement(By.id("receiptTypeFormView"));
        Thread.sleep(7000);
        WebElement newwin = driver.findElement(By.id("receiptTypeFormView"));


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
        WebElement newwin1 = driver.findElement(By.id("receiptTypeFormView"));
        newwin1.findElement(By.name("code")).clear();



       /* Select select1= new Select (newwin1.findElement(By.name("tax_type_id")));
        select1.selectByValue("3");*/


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
        WebElement grid1 = driver.findElement(By.id("receiptType-list-grid"));
        WebElement deleteicon = grid1.findElements(By.className("fa-trash-o")).get(4);
        JavascriptExecutor js1 = ((JavascriptExecutor) driver);
        js1.executeScript("arguments[0].click();", deleteicon);
        WebElement deleteokbutton = driver.findElement(By.id("button-1014-btnWrap"));
        Thread.sleep(3000);
        deleteokbutton.click();
        Thread.sleep(10000);
    }
}

