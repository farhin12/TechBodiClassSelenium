package browserInvoke;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowserInvoke {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","D:\\Techbodi\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//driver.close();
	}

}
