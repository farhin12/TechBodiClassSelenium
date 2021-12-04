package AlertInSelenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotClassExample {
	public static void main(String[] args) throws InterruptedException, AWTException {
	System.setProperty("webdriver.chrome.driver","D:\\Techbodi\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();

	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	//Specify the file location
	StringSelection sel = new StringSelection("C:\\Users\\User\\Downloads\\Resume.docx");
	
	//Copy to clipboard
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel, null);
	System.out.println("selection"+sel);
	
	//Open naukri.com
	driver.get("https://www.naukri.com/account/register/basicdetails");
	
//Click on upload resume button
	driver.findElement(By.xpath("//button[@class='uploadResume resman-btn-primary resman-btn-small']")).click();
	Thread.sleep(2000);
	//Create Object for Robot Class
	Robot robot = new Robot();
	Thread.sleep(2000);
	
	//press Enter
	robot.keyPress(KeyEvent.VK_ENTER);
	//Release Enter
	robot.keyRelease(KeyEvent.VK_ENTER);
	//Press CTRL+V
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_V);
	//Release CTRL+V
	robot.keyRelease(KeyEvent.VK_CONTROL);
	robot.keyRelease(KeyEvent.VK_V);
	Thread.sleep(2000);
	
	//Press Enter
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
	
	
	
	
	
	
}
}