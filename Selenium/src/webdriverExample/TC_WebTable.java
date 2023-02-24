package webdriverExample;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_WebTable {

	public static void main(String[] args)throws Exception 
	{	
    System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\Selenium\\Driver\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("file:///D:\\Software Testing\\Selenium\\Driver/WebTable.html");
    int row = driver.findElements(By.xpath("//*[@id='idCourse']/tbody/tr")).size();
    int col = driver.findElements(By.xpath("//*[@id='idCourse']/tbody/tr[1]/td")).size();
    int row_col = driver.findElements(By.xpath("//*[@id='idCourse']/tbody/tr/td")).size();
    System.out.println("Row count"+row);
    System.out.println("Col count"+col);
    System.out.println("Row_col count"+row_col);
    String celldata = driver.findElement(By.xpath("//*[@id='idCourse']/tbody/tr[4]/td[1]")).getText();
    System.out.println(celldata);
    for(int i=1;i<=row;i++){
    	String data = driver.findElement(By.xpath("//*[@id='idCourse']/tbody/tr["+i+"]")).getText();
    	Thread.sleep(3000);
    	System.out.println(data);
    }
    driver.quit();
    }
	}


