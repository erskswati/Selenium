package pack1;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test29 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		Thread.sleep(1000);
		Set<String> allwindow = driver.getWindowHandles();
         int count = allwindow.size();
         System.out.println("total no. of browser =" +count);
         for(String s:allwindow) 
         {
        	 driver.switchTo().window(s);
        	 String title = driver.getTitle();
        	 System.out.println(title);
        	 driver.close();
        	 
         }
	}
}
