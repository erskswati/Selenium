package pack1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test23 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("file:///E:/HTML%20Code/Link1.html");
		List<WebElement> allLink = driver.findElements(By.xpath("//a"));
		int count = allLink.size();
		for(int i=0;i<count;i++) {
			Thread.sleep(1000);
			allLink.get(i).click();
			driver.navigate().back();
			Thread.sleep(1000);
			
		}
		
		
	}

}
