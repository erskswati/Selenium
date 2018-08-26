package pack3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://online.actitime.com/wipro/");
		LoginPO loginpo=new LoginPO(driver);
		loginpo.unTxtBx().sendKeys("skswati26");
		loginpo.pwTxtBx().sendKeys("sk123");
		loginpo.loginBtn().click();
		//loginpo.loginToHome("skswati26", "TUPybE5U");
	}
		
}
