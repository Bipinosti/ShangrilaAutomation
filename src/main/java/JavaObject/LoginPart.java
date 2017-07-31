package JavaObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by bipin on 27-Jul-17.
 */
public class LoginPart {
    public void Login(WebDriver driver) throws InterruptedException {
        //Login Part
        LoginPage loginPage = new LoginPage(driver);
        WebElement clientselect = driver.findElement(By.id("client_id"));
        Select selcectclient = new Select(clientselect);
        selcectclient.selectByValue("3");
        loginPage.dataclear();
        loginPage.setUsername("admin");
        loginPage.setPassword("admin");
        loginPage.Login();
        Thread.sleep(5000);

    }
}
