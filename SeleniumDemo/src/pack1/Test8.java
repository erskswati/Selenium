//without using implicit and explicit wait:
package pack1;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test8 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://online.actitime.com/wipro/");
		driver.findElement(By.id("username")).sendKeys("skswati26");
		driver.findElement(By.name("pwd")).sendKeys("TUPybE5U");
		driver.findElement(By.id("loginButton")).click();
		while (true) {
			try
			{
				driver.findElement(By.id("logoutLink")).click();
				break;
				
		          	} 
			catch (NoSuchElementException e) 
			  {
				// TODO: handle exception
			     }
			 }
		}
	}
