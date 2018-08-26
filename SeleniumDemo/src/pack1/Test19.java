package pack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test19
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//driver.get("file:///E:/HTML%20Code/Link5.html");
		driver.navigate().to("file:///E:/HTML%20Code/Link5.html");
		WebElement txbx2 = driver.findElement(By.xpath("//input[@id='a2']"));
		String t = txbx2.getAttribute("value");
		if(t.length()==0)
		{
				System.out.println("no value");
		}
			else 
			{
				System.out.println("some value");
		
			}
		driver.close();
		}
	
	}
	


