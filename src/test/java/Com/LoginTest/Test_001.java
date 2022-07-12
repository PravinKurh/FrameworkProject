package Com.LoginTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Com.PageObject.LoginPom;
import Com.Utility.BaseClass;
import Com.Utility.Library;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_001 extends BaseClass
{
	
    @Test    
     public void verifyLoginPage() throws InterruptedException
     {
     //setup called from baseclass  
     
     // identifty element
   
    	LoginPom login = PageFactory.initElements(driver, LoginPom.class);
        
        Library.custom_Keys(login.gettxt_email(), excel.getDataProvider("Sheet1", 0, 0));
        Library.custom_Keys(login.gettxt_password(),excel.getDataProvider("Sheet1", 0, 1));
        
        Library.click_btn(login.getlogin_btn());
     
//        txt_email.sendKeys("pravinkurhade111@gmail.com");
//        txt_password.sendKeys("Shambho@123#");
        
       
        
        Thread.sleep(10000);
     

     
     
     }
 
}
