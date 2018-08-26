package pack1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 
{
  public static void main(String[] args) throws InterruptedException
  {
	  //set properties for browser
	  System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
	  WebDriver driver = new ChromeDriver(); //launch browser
	  driver.manage().window().maximize(); //maximize the browser
	  driver.get("https://www.google.com/"); //navigate to url
	  Thread.sleep(2000); //delay 
      String googleTitle = driver.getTitle(); //get the title of url
      System.out.println(googleTitle);
      Thread.sleep(2000);
	  driver.get("https://www.seleniumhq.org/");
	  Thread.sleep(2000);
	  driver.navigate().to("https://www.seleniumhq.org/download/");
	  Thread.sleep(2000);
	  driver.navigate().back();
	  Thread.sleep(2000);
	  driver.navigate().forward();
	  Thread.sleep(2000);
	  driver.navigate().refresh();
	  Thread.sleep(2000);
	  driver.close();
	  
    }  
 }
