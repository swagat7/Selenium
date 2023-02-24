package webdriverExample;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class TC_MouseOver 
    {
     static String url = "http://183.82.103.245/nareshit/login.php";
     static String username = "nareshit";
     static String password = "nareshit";
	public static void main(String[] args) throws Exception
	{
	System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\Selenium\\Driver\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.navigate().to(url);
	Thread.sleep(3000);
	driver.findElement(By.name("txtUserName")).sendKeys(username);
	driver.findElement(By.name("txtPassword")).sendKeys(password);
	Thread.sleep(3000);
	driver.findElement(By.name("Submit")).click();
	System.out.println("Login Completed");
	driver.getTitle();
	//Mouseover
	Actions ac = new Actions(driver);
	ac.moveToElement(driver.findElement(By.linkText("PIM"))).perform();
	Thread.sleep(4000);
	System.out.println("mouse over completed");
	//Click on sub Menue
	driver.findElement(By.linkText("Add Employee")).click();
	Thread.sleep(3000);
	driver.findElement(By.linkText("Logout")).click();
	driver.close();
	
		
	}

}
