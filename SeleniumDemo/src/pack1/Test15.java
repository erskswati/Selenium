package pack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test15 
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
		  Point p = untxbx.getLocation();
		 Point p1 = untxbx1.getLocation();
		  int x = p.getX();
		  int y = p.getY();
		int x1 = p1.getX();
		  int y1 = p1.getY();
		  System.out.println("x-coodrinate-"+x);
		  System.out.println("y-coodrinate-"+y);
		  System.out.println("x1-coodrinate-"+x1);
		  System.out.println("y1-coodrinate-"+y1);
		  if((x!=x1)&&(y==y1))
			  System.out.println("alligned horizently");
		  else
		  System.out.println("not alligned");
		  
	}
}
