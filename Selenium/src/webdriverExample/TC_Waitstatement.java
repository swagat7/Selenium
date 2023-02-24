package webdriverExample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC_Waitstatement {

	public static void main(String[] args)throws Exception 
	{
    System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\Selenium\\Driver\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("http://183.82.103.245/nareshit/login.php");
    //login button condition
    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(4));
    wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.name("Submit"))));
    driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
    driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
    driver.findElement(By.name("Submit")).click();
    //wait until emp: info page
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
    System.out.println("Login completed");
    driver.findElement(By.linkText("Logout"));
    Thread.sleep(3000);
    driver.close();

	}

}
