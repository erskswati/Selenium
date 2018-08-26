package pack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test13
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("file:///E:/HTML%20Code/Link5.html");
		WebElement txtbx1 = driver.findElement(By.id("a1"));
		WebElement txtbx2 = driver.findElement(By.id("a2"));
		txtbx1.sendKeys(Keys.CONTROL+"a");
	    txtbx1.sendKeys(Keys.CONTROL+"x");
	    txtbx2.sendKeys(Keys.CONTROL+"v");
	   
	}

}
