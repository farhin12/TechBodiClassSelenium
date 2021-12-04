package ScreenShot;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenShotExample {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\Techbodi\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://chandanachaitanya.github.io/selenium-practice-site/");
		Thread.sleep(2000);
		
		TakesScreenshot scrshot = ((TakesScreenshot)driver);
		File cpFile = scrshot.getScreenshotAs(OutputType.FILE);
		
		//Take current date and time
		SimpleDateFormat formatter = new 	SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date = new Date();
		String abc = formatter.format(date).toString().replace("/","");
		String exactpathfilename=abc.replace(" ", "").replace(":", "");
		System.out.println(exactpathfilename);
		
		String CapturePath = "D:\\Techbodi\\Techbodi\\"+exactpathfilename+".png";
	
		try {
			//save the screenshot taken in destination path
			FileUtils.copyFile(cpFile, new File(CapturePath));
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
		

}
}