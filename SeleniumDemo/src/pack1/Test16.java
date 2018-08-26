package pack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test16 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement untxbx = driver.findElement(By.xpath("//input[@id='email']"));
		WebElement untxbx1 = driver.findElement(By.xpath("//input[@id='pass']"));
		Dimension s1 = untxbx.getSize();
		System.out.println(s1.getHeight());
		System.out.println(s1.getWidth());
		Dimension s2 = untxbx1.getSize();
		System.out.println(s2.getHeight());
		System.out.println(s2.getWidth());
		
	}

}
