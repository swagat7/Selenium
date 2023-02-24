package webdriverExample;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_WidowHandler {

	public static void main(String[] args)throws Exception 
	{
	System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\Selenium\\Driver\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("D:\\Software Testing\\Selenium\\Driver\\multiplewindows.html");
	Thread.sleep(2000);
	driver.findElement(By.id("btn2")).click();
	Thread.sleep(3000);
	driver.findElement(By.id("btn3")).click();
	Thread.sleep(3000);
	ArrayList<String> windowinfo = new ArrayList<>(driver.getWindowHandles());
	driver.switchTo().window(windowinfo.get(0));
	Thread.sleep(3000);
	driver.quit();
    
	}

}
