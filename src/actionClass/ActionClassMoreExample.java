package actionClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionClassMoreExample {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\Techbodi\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		
		WebElement txtUsername = driver.findElement(By.id("email"));
		//WebElement txtUsername = driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']"));
		Actions builder = new Actions(driver);
		Action seriesOfActions = builder
				.moveToElement(txtUsername)
				.click()
		.keyDown(txtUsername, Keys.SHIFT)
		.sendKeys(txtUsername, "farhin")
		.keyUp(txtUsername,Keys.SHIFT)
		.doubleClick(txtUsername)
		.contextClick().build();
		
		seriesOfActions.perform();
		
				
				
				
				
		
		
		
		
		
}
}