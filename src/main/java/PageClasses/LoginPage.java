package PageClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {

public static void loginPageMethod() {
	
	By UserName = By.id("email");
	By Password = By.id("pass");
	
	WebDriver driver;
	WebDriverManager.chromiumdriver().setup();
	
	driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	driver.findElement(UserName).sendKeys("UserName");
	driver.findElement(Password).sendKeys("Password");
	
	
	
	
}

}
