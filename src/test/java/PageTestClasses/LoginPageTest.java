package PageTestClasses;

import org.testng.annotations.Test;

import PageClasses.LoginPage;

public class LoginPageTest extends LoginPage {

	@Test
	public static void loginPageMethodExecution() throws InterruptedException {
		
		loginPageMethod();
		Thread.sleep(5000);
	}
	
	
}
