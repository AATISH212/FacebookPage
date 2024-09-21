package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class SignUp extends BasePage

{

	public SignUp(WebDriver driver)
	{
		super(driver);
	
	}

		@FindBy(xpath="//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")
		WebElement signUp;
		
		@FindBy(xpath="//input[@name='firstname']")
		WebElement firstName;
		
		@FindBy(xpath="//select[@id='day']")
		WebElement dob;
		
		
		@FindBy(xpath="//select[@id='month']")
		WebElement month;
		
		@FindBy(xpath="//select[@id='year']")
		WebElement year;
		
		public void creatNewAccount()
		{
			signUp.click();
			
		}
	
		public void firstName() throws InterruptedException
		{
			firstName.sendKeys("Rajesh");
			Thread.sleep(2000);		
			
		}
		
		public void doB() throws InterruptedException
		{
			
			WebElement Day=driver.findElement(By.id("day"));
			Select se = new Select(Day);
			se.selectByVisibleText("6");
			Thread.sleep(2000);
			
			//se.selectByVisibleText("4");
			//se.selectByValue("5");
			//se.selectByIndex(3);
			
		}
		public void mon() 
		{
			Select mo =new Select(month);
			mo.selectByIndex(3);
			
		}

		public void year() 
		{
		
			Select yr = new Select(year);
			yr.selectByValue("1998");
			
			
		}
	
}
