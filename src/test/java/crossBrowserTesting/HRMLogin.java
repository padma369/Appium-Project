package crossBrowserTesting;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HRMLogin {
	
	
	//priority
	//
	
	
	@BeforeTest
	public void launchApp() {
		
		System.out.println("launching....");
	}

	@AfterTest
	public void closeApp() {
		
		System.out.println("closing app....");
	}
	
	@Test(priority = 1)
	public void login() {
		
		System.out.println("login test case");
		
	}
	
	@Test(priority = 4)
	public void logout() {
		
		System.out.println("logout test case");
		
	}
	
	@Test(priority = 2)
	public void additems() {
		
		System.out.println("additems test case");
		
	}
	
	@Test(priority = 3)
	public void payment() {
		
		System.out.println("payment test case");
		
	}
	
}
