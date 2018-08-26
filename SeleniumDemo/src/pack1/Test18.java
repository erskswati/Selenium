package pack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test18 
{
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./DRIVER/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("file:///E:/HTML%20Code/web.html");
		String link1Txt = driver.findElement(By.className("c2")).getText();
		//String link1Txt = driver.findElement(By.id("a1")).getText();
		//String link2Txt = driver.findElement(By.id("a2")).getText();
		//String link3Txt = driver.findElement(By.id("a3")).getText();
		//String link4Txt = driver.findElement(By.id("a4")).getText();
		System.out.println(link1Txt);
		//System.out.println(link2Txt);
		//System.out.println(link3Txt);
		//System.out.println(link4Txt);
		driver.close();
	}


}
