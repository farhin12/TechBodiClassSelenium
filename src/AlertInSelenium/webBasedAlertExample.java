package AlertInSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webBasedAlertExample {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\Techbodi\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://chandanachaitanya.github.io/selenium-practice-site/");
		driver.findElement(By.xpath("//button[@id='confirmBox']")).click();;
		Thread.sleep(5000);
		Alert al = driver.switchTo().alert();
		System.out.println(al.getText());
		
		al.accept();
		
		//al.dismiss();
		
	
		
		
	

}
}