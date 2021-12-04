package BrowserCommand;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browserCommands {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","D:\\Techbodi\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//get command to invoke browser
		driver.get("http://www.seleniumframework.com/Practiceform/");
		
		//get command to take title of page
		String PageTitle = driver.getTitle();
		System.out.println(PageTitle);
		
		//command to take current URL
		String CurrentTitle = driver.getCurrentUrl();
		System.out.println(CurrentTitle);
		
		//close and quit
		driver.findElement((By.xpath("//button[text()='New Browser Tab']"))).click();
		
		Thread.sleep(3000);
		driver.close();//it will close the current tab
				//driver.quit();//it will close all the tabs
		
	

		
		
		
		
	}

}
