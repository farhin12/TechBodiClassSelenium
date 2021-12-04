package checkBox;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxExample {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Techbodi\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://omayo.blogspot.com/");
		List<WebElement> totalcheckbox = driver.findElements(By.name("accessories"));
		
		for(int i=0;i<=totalcheckbox.size()-1;i++) {
			System.out.println(totalcheckbox.get(i).getAttribute("value"));
			totalcheckbox.get(i).click();
			
		}
	}

}
