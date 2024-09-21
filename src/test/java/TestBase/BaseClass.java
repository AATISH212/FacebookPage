package TestBase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
public class BaseClass
{
	
	public  WebDriver driver;	
	public  String broweser="chrome";
	public String url="https://www.facebook.com/";
	
	@BeforeTest
	
	public void setUp() throws InterruptedException
	{
		if(broweser.equals("chrome"))
		{
			driver= new ChromeDriver();
		}
	
	driver.get(url);
	driver.manage().window().maximize();
	//Thread.sleep(2000);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
		
	@AfterTest
	
	 public void closeBroweser()
	 {
		//driver.close();
	 }	 
	 
	
	
	
	
	
	
}