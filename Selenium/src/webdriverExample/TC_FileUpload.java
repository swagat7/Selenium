package webdriverExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_FileUpload {

	public static void main(String[] args)throws Exception 
	{
	System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\Selenium\\Driver\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("http://183.82.103.245/nareshit/login.php");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("nareshit");
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("nareshit");
	Thread.sleep(2000);
	driver.findElement(By.name("Submit")).click();
	//enter frame
	driver.switchTo().frame("rightMenu");
	driver.findElement(By.xpath("//input[@value='Add']")).click();
	Thread.sleep(3000);
	driver.findElement(By.name("txtEmpLastName")).sendKeys("Mallick");
	driver.findElement(By.name("txtEmpFirstName")).sendKeys("Swagat");
	Thread.sleep(3000);
	WebElement fileinput = driver.findElement(By.name("photofile"));
	fileinput.sendKeys("D:\\Photos\\_DSC0419-1.jpg");
	Thread.sleep(8000);
	System.out.println("File upload completed");
	driver.findElement(By.xpath("//input[@id='btnEdit']")).click();
	Thread.sleep(3000);
	driver.switchTo().defaultContent();
	driver.findElement(By.linkText("Logout")).click();
	driver.close();
	

	}

}
