package Com.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class LoginPom 

{
	
	@FindBy(how=How.XPATH,using="/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input")
	private WebElement txt_email;


    @FindBy(how=How.XPATH,using="/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[2]/div/input")
    private WebElement txt_password;
    
    
    @FindBy(how=How.XPATH,using="/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button")
    private WebElement login_btn;
    
	public WebElement gettxt_email() {
	return txt_email;
	}
	
	public WebElement gettxt_password() {
		return txt_password;
	}
	
	public WebElement getlogin_btn() {
		return login_btn;

	}
}