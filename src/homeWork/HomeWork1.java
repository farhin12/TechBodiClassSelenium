package homeWork;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HomeWork1 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","D:\\Techbodi\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		
		/*Actions as = new Actions(driver);
		WebElement element = driver.findElement(By.xpath(""));
		
		as.moveToElement(element).build().perform();*/
        //login
		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("9960416617");
		driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']")).sendKeys("Farhin@123");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
		
		
		
		//choosing product....Mobile
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[3]")).click();
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[4]/div/div[1]/a/div/img[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[2]/div/div/div/a/div[2]/div[1]/div[1]")).click();
		
		driver.findElement(By.xpath("")).click();
		
		
		
		driver.findElement(By.xpath("//div[@class='iucdn_']")).click();
		driver.findElement(By.xpath("//a[@class='_6WOcW9 _2-k99T']")).click();
		driver.findElement(By.xpath("//img[@class='_2r_T1I']")).click();
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
		
	}

}
