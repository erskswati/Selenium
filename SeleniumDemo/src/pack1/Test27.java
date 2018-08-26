package pack1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test27 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("file:///E:/HTML%20Code/Link4.html");
		List<WebElement> allcontents = driver.findElements(By.xpath("//td"));
		//System.out.println(allcontents.get(0).getText());
		
for(int i=0;i<allcontents.size();i++)
{
	System.out.println(allcontents.get(i).getText());
	
}

driver.close();
	}


}
