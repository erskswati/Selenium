package pack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test5 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://online.actitime.com/wipro/");
		driver.findElement(By.id("username")).sendKeys("skswati26");
		driver.findElement(By.name("pwd")).sendKeys("TUPybE5U");
		driver.findElement(By.id("loginButton")).click();
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String homeTitle = driver.getTitle();
		System.out.println(homeTitle);
		
		driver.findElement(By.id("logoutLink")).click();
	}

}
