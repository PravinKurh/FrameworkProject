package Com.Utility;

import org.openqa.selenium.WebElement;

public class Library {
	
	public static void custom_Keys(WebElement element, String s)
	
	{
		try {
		     element.sendKeys(s);
	        }
        catch(Exception e)
		{
        System.out.println(e.getMessage());
	}
}
	
	public static void click_btn(WebElement element1)
	
	{
		try {
			element1.click();
		}
		catch(Exception f)
		{
			System.out.println(f.getMessage());
		}
	}
}