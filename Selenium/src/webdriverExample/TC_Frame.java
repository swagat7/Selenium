package webdriverExample;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
public class TC_Frame {

	public static void main(String[] args)throws Exception
	{
	System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\Selenium\\Driver\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("http://183.82.103.245/nareshit/login.php");
	Thread.sleep(3000);
	driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
	driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
	driver.findElement(By.name("Submit")).click();
	Thread.sleep(3000);
	System.out.println("Login completed");
	//Enter into the frame
	driver.switchTo().frame("rightMenu");
	driver.findElement(By.xpath("//input[@value='Add']")).click();
	Thread.sleep(3000);
	driver.findElement(By.name("txtEmpFirstName")).sendKeys("swagat");
	driver.findElement(By.name("txtEmpLastName")).sendKeys("mallick");
	driver.findElement(By.id("btnEdit")).click();
	Thread.sleep(4000);
	driver.switchTo().defaultContent();//Exit from frame
	driver.findElement(By.linkText("Logout")).click();
	Thread.sleep(3000);
	driver.close();
	

	}

}
