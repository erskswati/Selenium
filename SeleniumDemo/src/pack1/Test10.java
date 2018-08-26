package pack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test10
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("file:///E:/HTML%20Code/Link5.html");
		String txtbxVal = driver.findElement(By.id("a1")).getAttribute("value");
		System.out.println(txtbxVal);
		Thread.sleep(2000);
		driver.findElement(By.id("a1")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("a1")).sendKeys("webdriver");
		Thread.sleep(2000);
		
		
		
	}

}
