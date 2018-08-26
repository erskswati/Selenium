package pack2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://online.actitime.com/wipro/");
		ActiTimeLogin login=new ActiTimeLogin(driver);
		//login.setUsername("skswati26");
		//login.setPassword("TUPybE5U");
		//login.clickLogin();
		login.loginToHome("skswati26", "TUPybE5U");
		ActiTimeHome home=new ActiTimeHome(driver);
		home.clickLogout();
	}


}
