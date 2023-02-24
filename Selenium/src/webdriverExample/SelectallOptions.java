package webdriverExample;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class SelectallOptions {
	

	public static void main(String[] args) throws Exception{
		 System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\Selenium\\Driver\\chromedriver_win32\\chromedriver.exe");
		    WebDriver driver = new ChromeDriver();
		    driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		    driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		    driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		    driver.findElement(By.name("Submit")).click();
		    System.out.println("Login completed");
		    Thread.sleep(3000);
		    driver.switchTo().frame("rightMenu");
		    List<WebElement> checkboxes= driver.findElements(By.xpath("//input[@class='checkbox']"));
		    for(int i=0; i<checkboxes.size(); i++)        
		    {
		String value = checkboxes.get(i).getAttribute("value");
		    Thread.sleep(3000);
		    if(checkboxes.get(i).isDisplayed() && checkboxes.get(i).isEnabled())
			{
                   System.out.println("Checkbox is displayed at index : " + i + " Clicking on it now");
                        checkboxes.get(i).click();
			}
		    }
		    driver.switchTo().defaultContent();
		    driver.findElement(By.linkText("Logout")).click();
		    System.out.println("Logout completed");
		    driver.quit();// TODO Auto-generated method stub

	}
	}

