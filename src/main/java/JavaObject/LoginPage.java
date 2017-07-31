package JavaObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


/**
 * Created by anupam on 9/11/2016.
 */
public class LoginPage {
    WebDriver driver;

    @FindBy(id="username")
    WebElement uname;

    @FindBy(id = "password")
    WebElement passwd;

    @FindBy(id = "SubmitButton")
    WebElement submitButton;

  public LoginPage(WebDriver driver){
      this.driver=driver;
      PageFactory.initElements(driver,this);
  }

   public void setUsername(String username){
       uname.sendKeys(username);
   }
   public void setPassword(String password){
       passwd.sendKeys(password);
   }
   public void Login()
   {
       submitButton.click();
   }
    public void dataclear(){
        uname.clear();
        passwd.clear();

    }
}
