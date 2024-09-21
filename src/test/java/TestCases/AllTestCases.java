package TestCases;

import org.testng.annotations.Test;

import PageObject.SignUp;
import TestBase.BaseClass;

public class AllTestCases extends BaseClass

{
	@Test(priority=1)
	public void signUp() throws InterruptedException
	
	{
		//Test Case For
		SignUp su = new SignUp(driver);
		su.creatNewAccount();
		su.firstName();
		su.doB();
		su.mon();
		su.year();
		
		
	}
	
	
}
