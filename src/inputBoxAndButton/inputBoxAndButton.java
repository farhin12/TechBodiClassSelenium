package inputBoxAndButton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class inputBoxAndButton {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Techbodi\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("abc");
		driver.findElement(By.name("pass")).sendKeys("asd");
		driver.findElement(By.name("login")).click();
		
	}

}
