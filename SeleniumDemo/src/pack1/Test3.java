package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 
{
	public static void main(String[] args) throws InterruptedException
	  {
		  //set properties for browser
		  System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		  WebDriver driver = new ChromeDriver(); //launch browser
		  driver.manage().window().maximize(); //maximize the browser
		  driver.get("file:///E:/HTML%20Code/Link1.html");
		  //driver.findElement(By.id("a2")).click();
		 // driver.findElement(By.className("c3")).click();
		 // driver.findElement(By.name("n2")).click();
		  //driver.findElement(By.linkText("MyInstagramLink")).click();
		  //Through Css selector 
		  //driver.findElement(By.cssSelector("a#a1")).click(); //for id
		 // driver.findElement(By.cssSelector("a.c2")).click(); //for class
		  //driver.findElement(By.cssSelector("a[class ='c3']")).click(); //for attribute
		  //driver.findElement(By.cssSelector("a[class ='c2'][name='n2'][id='a2']")).click(); //for multiple attribute
		  driver.findElement(By.cssSelector("a[href*='instagram']")).click(); //for * contains
		  
		  
		  
	  }

}
