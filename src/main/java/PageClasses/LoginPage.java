package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {

public static void loginPageMethod() {
	
	WebDriver driver;
	WebDriverManager.chromiumdriver().setup();
	
	driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	
}

}
