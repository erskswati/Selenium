package pack1;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test14 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement untxbx = driver.findElement(By.xpath("//input[@id='email']"));
		  Point p = untxbx.getLocation();
		  int x = p.getX();
		  int y = p.getY();
		  System.out.println("x-coodrinate-"+x);
		  System.out.println("y-coodrinate-"+y);
		  driver.close();
	}
		  
		 
	

}
