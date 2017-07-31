package JavaObject;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import tests.LoginTest;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by anupam on 9/13/2016.
 */
public class PageAfterLogin {
    WebDriver driver;
    //LoginTest test=new LoginTest();
    public PageAfterLogin(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public void setup(){
        //this.driver=new FirefoxDriver();
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        driver =new ChromeDriver();
        this.driver.get("http://localhost:14187/#country");
        System.out.println("hell0 ");
    }
//    @Before
//    public  void mousehover(){
//        this.driver.get("http://localhost:14187/#country");
//    }
    public  void alart(){
        System.out.println("hell here");
    }
}
