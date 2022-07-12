package Com.Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass
{
	public static WebDriver driver; 	
	public   static ConfigDataProvider config;
	public static  ExcelDataProvider excel;
	
	@BeforeSuite
	public void startSetUp() throws Exception
	{
		config = new ConfigDataProvider();
		
		 excel = new ExcelDataProvider();
	}
  
	@Parameters({"BrowserName"})
	
	@BeforeMethod  
    public void setUp(String BrowserName)
  {
		if(BrowserName.equalsIgnoreCase("Chrome"))
		{
      WebDriverManager.chromedriver().browserVersion("Version 103.0.5060.114").setup(); 
      
      //Version 103.0.5060.114 (Official Build) (64-bit)
       driver = new ChromeDriver();
       
   
		}
		else if(BrowserName.equalsIgnoreCase("Edge"))
		{
			WebDriverManager.edgedriver().setup();     
			  driver = new EdgeDriver();
		}
		
		
	
		 driver.get(config.getBaseUrl_QA1());
		 driver.manage().window().maximize();	
			}
	
	
  
  
      @AfterMethod
      public void tearDown()
      {
    	  //driver.close();
      }
}