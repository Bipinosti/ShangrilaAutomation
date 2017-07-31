package tests;

import JavaObject.LoginPage;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.JavascriptExecutor;
import java.awt.*;
import org.openqa.selenium.firefox.FirefoxDriver;
//import java.util.List;
//import java.awt.event.KeyEvent;
//import java.util.*;

import static org.openqa.selenium.Keys.ENTER;
//import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by anupam on 9/11/2016.
 */
public class LoginTest {
    WebDriver driver;

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
    public void setusernameonly() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.dataclear();
        loginPage.setUsername("admin");
        loginPage.Login();
    }

    @Test
    public void setpasswordonly() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.dataclear();
        loginPage.setPassword("admin");
        loginPage.Login();
    }


    @Test
    public void setusernameandpasscountry() throws InterruptedException, AWTException {
        LoginPage loginPage = new LoginPage(driver);
        WebElement clientselect = driver.findElement(By.id("client_id"));
        Select selcectclient = new Select(clientselect);
        selcectclient.selectByValue("3");
        loginPage.dataclear();
        loginPage.setUsername("admin");
        loginPage.setPassword("admin");
        loginPage.Login();
        Thread.sleep(3000);
        //driver.navigate().to(driver.getCurrentUrl());
        //driver.manage().window().maximize();
        //Thread.sleep(3000);
        driver.get("http://localhost:12441/#country");
        Thread.sleep(10000);
        //driver.manage().window().maximize();
        //WebElement codefield = driver.findElement(By.name("name___multi"));

        WebElement codefield = driver.findElement(By.name("code"));
        codefield.sendKeys(ENTER);
        codefield.sendKeys("105");
        codefield.sendKeys(ENTER);
        codefield.clear();
        Thread.sleep(3000);
        WebElement grid = driver.findElement(By.id("country-list-grid"));
        WebElement editIcon = grid.findElements(By.className("fa-pencil-square-o")).get(0);


        JavascriptExecutor js = ((JavascriptExecutor) driver);
        //String str = editIcon.getAttribute("class");
        //System.out.println(str+"what");
        js.executeScript("arguments[0].click();", editIcon);
        WebElement win = driver.findElement(By.id("countryFormView"));
        win.findElement(By.name("code")).sendKeys("5");
        Thread.sleep(5000);
        WebElement savebutton = win.findElements(By.className("fa-floppy-o")).get(0);
        js.executeScript("arguments[0].click();", savebutton);
        Thread.sleep(4000);
        WebElement okbutton = driver.findElement(By.id("button-1014-btnWrap"));
        okbutton.click();
        Thread.sleep(5000);
        Actions action = new Actions(driver);
        action.keyDown(Keys.CONTROL).sendKeys(String.valueOf('\u0041')).keyUp(Keys.CONTROL).sendKeys(Keys.DELETE).perform();
        Thread.sleep(4000);
        WebElement newwin = driver.findElement(By.id("countryFormView"));
        newwin.findElement(By.name("code")).sendKeys("001");
        newwin.findElement(By.name("name_np")).sendKeys("dfdf");
        newwin.findElement(By.name("name_en")).sendKeys("name in english");
        Thread.sleep(3000);
        WebElement countrysavebutton = newwin.findElements(By.className("fa-floppy-o")).get(0);
        js.executeScript("arguments[0].click();", countrysavebutton);
        WebElement newmodeokbutton = driver.findElement(By.id("button-1014-btnWrap"));
        newmodeokbutton.click();
        Thread.sleep(3000);
        WebElement validationmessage = driver.findElement(By.id("button-1013"));
        validationmessage.click();
        newwin.findElement(By.name("code")).clear();
        newwin.findElement(By.name("name_np")).clear();
        newwin.findElement(By.name("name_en")).clear();
        newwin.findElement(By.name("code")).sendKeys("00011");
        newwin.findElement(By.name("name_np")).sendKeys("had");
        newwin.findElement(By.name("name_en")).sendKeys("had1");
        newwin.findElement(By.name("display_order")).sendKeys("2");
        Thread.sleep(2000);
        WebElement editcountrysavebutton = newwin.findElements(By.className("fa-floppy-o")).get(0);
        js.executeScript("arguments[0].click();", editcountrysavebutton);
        WebElement newmodeokbutton1 = driver.findElement(By.id("button-1014-btnWrap"));
        newmodeokbutton1.click();
        Thread.sleep(3000);
        WebElement grid1 = driver.findElement(By.id("country-list-grid"));
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

}





























