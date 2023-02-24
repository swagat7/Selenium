package webdriverExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_Verify {

	public static void main(String[] args) throws Exception
	{
	System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\Selenium\\Driver\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("http://183.82.103.245/nareshit/login.php");
	Thread.sleep(3000);
	if(driver.getTitle().equals("OrangeHRM - New Level of HR Management"))
	{
	System.out.println("Matched");
	}
	else
	{
		System.out.println("Not Matched");
		System.out.println(driver.getTitle());
	}
	driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
	driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
	Thread.sleep(3000);
	driver.findElement(By.name("Submit")).click();
	Thread.sleep(3000);
	if(driver.getTitle().equals("HRMS"))
	{
	System.out.println("Matched");
	}
	else
	{
		System.out.println("Not Matched");
		System.out.println(driver.getTitle());
	}
	driver.findElement(By.linkText("Logout")).click();
	Thread.sleep(3000);
	driver.close();
	
	

	}

}
