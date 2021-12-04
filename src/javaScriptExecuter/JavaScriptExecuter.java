package javaScriptExecuter;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecuter {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\Techbodi\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://chandanachaitanya.github.io/selenium-practice-site/");
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//Vertical scroll - down by 500 pixel
		js.executeScript("window.scrollBy(0,500)");
		
		//Horizontal scroll
		js.executeScript("window.scrollBy(500,0)");
		
		//Go till last
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(3000);
		
		//Enter text
		js.executeScript("document.getElementById('enterText').value='farhin';");
		
		//Refresh
		js.executeScript("history.go(0)");
		js.executeScript("location.reload()");
		
		//size
		System.out.println(js.executeScript("return window.innerHeight;"));
		System.out.println(js.executeScript("return window.innerWidth;"));
	
		
		
		

}
}