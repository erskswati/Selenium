package pack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test7 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//without implicit wait 
		driver.manage().window().maximize();
		driver.get("https://online.actitime.com/wipro/");
		driver.findElement(By.id("username")).sendKeys("skswati26");
		driver.findElement(By.name("pwd")).sendKeys("TUPybE5U");
		driver.findElement(By.id("loginButton")).click();
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.titleIs("actiTIME - Enter Time-Track"));
		WebElement logout = driver.findElement(By.id("logoutLink"));
	      logout.click();
		//driver.findElement(By.id("logoutLink")).click();
	}
}
