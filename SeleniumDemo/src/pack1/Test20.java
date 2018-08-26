package pack1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test20 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("file:///E:/HTML%20Code/Link6.html");
		//WebElement checkbox1 = driver.findElement(By.xpath("//div[2]"));
		List<WebElement> allcheckbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
		int count = allcheckbox.size();
		System.out.println("total no. of checkbox=" +count);
		
		Thread.sleep(2000);
		allcheckbox.get(0).click();
		Thread.sleep(2000);
		allcheckbox.get(1).click();
		Thread.sleep(2000);
		allcheckbox.get(2).click();
		Thread.sleep(2000);
		
		//driver.close();
	}
		
}
	


