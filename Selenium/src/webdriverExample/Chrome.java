package webdriverExample;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
public class Chrome {

	public static void main(String[] args)throws Exception
	{
	System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\Selenium\\Driver\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("http://183.82.103.245/nareshit/login.php");
	Thread.sleep(4000);
	driver.close();
	}

}
