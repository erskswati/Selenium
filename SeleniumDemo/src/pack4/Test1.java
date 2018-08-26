package pack4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("file:///E:/HTML%20Code/CHRABX.html");
		ChraPO chrapo = new ChraPO(driver);
		chrapo.chkBx1().click();
		chrapo.chkBx2().click();
		chrapo.chkBx3().click();
        chrapo.chkBx4().click();
        chrapo.chkBx5().click();
      //to find total no. of checkbox  
        System.out.println(chrapo.allchkBx());
        // here we are doing un check the checkbox
        for(int i=0; i<chrapo.allchkBx();i++)
        {
        	chrapo.getAllchkBx(i).click();
        }
       
        System.out.println(chrapo.allChkBx3Size()); // through FINDALL annotation
        Thread.sleep(2000);
        chrapo.getAllchkBx(0).click(); // through FINDALL annotation
        Thread.sleep(2000);
        chrapo.getAllchkBx(1).click(); // through FINDALL annotation
        Thread.sleep(2000);
        chrapo.getAllchkBx(2).click(); // through FINDALL annotation
        Thread.sleep(2000);
        driver.quit();
	}
}
