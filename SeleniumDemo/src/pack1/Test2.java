package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 
{
	public static void main(String[] args) throws InterruptedException
	  {
		  //set properties for browser
		  System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		  WebDriver driver = new ChromeDriver(); //launch browser
		  driver.manage().window().maximize(); //maximize the browser
		  driver.get("file:///E:/HTML%20Code/Link3.html");
		  By googleTag = By.tagName("a");
		 WebElement googleLink = driver.findElement(googleTag);
		 googleLink.click();
		 String title = driver.getTitle();
		 if (title.equalsIgnoreCase("Google")) 
		 {
			 System.out.println("Test Pass");
			 }
		 else
		 {
			 System.out.println("Test Fail");
		   }
		  }
	}
