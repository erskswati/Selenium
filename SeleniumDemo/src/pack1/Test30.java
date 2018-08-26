package pack1;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test30 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
	    // System.out.println(driver.getTitle());	
		String mtitle = driver.getTitle();
		Set<String> allwindowhandle = driver.getWindowHandles();
		for(String s: allwindowhandle)
		{
			driver.switchTo().window(s);
			String title = driver.getTitle();
			if(mtitle.equalsIgnoreCase(title)) {
				System.out.println("the title of main browser =" +title);
			}
				else
				{
					System.out.println("the title of child browser = " +title);
					driver.close();
					
				}
			}
			
		}
		
	}
	


