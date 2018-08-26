package pack1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test26 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("file:///E:/HTML%20Code/Link1.html");
		List<WebElement> allLink = driver.findElements(By.xpath("//a"));
		//String url = allLink.get(0).getAttribute("href");
				//System.out.println(url);
		for(int i=0;i<allLink.size();i++)
		{
			String url = allLink.get(i).getAttribute("href");
			System.out.println(url);

		}
				driver.close();
	}

}
