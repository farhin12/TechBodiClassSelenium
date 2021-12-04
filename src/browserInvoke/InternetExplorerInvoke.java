package browserInvoke;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class InternetExplorerInvoke {
	public static void main(String[] args) {
		System.setProperty("webdriver.internetexplorer.driver","D:\\Techbodi\\IEDriverServer.exe");
		
		WebDriver driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//driver.close();
	}

}
