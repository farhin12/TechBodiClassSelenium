package browserInvoke;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserInvoke {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver","D:\\Techbodi\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();//here webdriver is interface and chrome driver is its subclass..this is instance
	//We cant create instance of interface so we have to go through its child class 
	
	driver.manage().window().maximize();
	//driver.get("https://www.flipkart.com/");
	driver.get("https://www.facebook.com/");
	driver.close();
	
}
}
