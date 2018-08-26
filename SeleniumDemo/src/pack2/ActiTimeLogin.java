package pack2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ActiTimeLogin 
{
	private WebElement unTxBx;
	private WebElement pwTxBx;
	private WebElement loginBtn;
	
public ActiTimeLogin(WebDriver driver)	
{
	unTxBx=driver.findElement(By.xpath("//input[@name='username']"));
	pwTxBx=driver.findElement(By.xpath("//input[@name='pwd']"));
	loginBtn=driver.findElement(By.xpath("//a[@id='loginButton']"));
}
public void setUsername(String un)
{
	unTxBx.sendKeys(un);
}
public void setPassword(String pw)
{
	pwTxBx.sendKeys(pw);
}
public void clickLogin()
{
	loginBtn.click();
}
public void loginToHome(String un,String pw)
{
	unTxBx.sendKeys(un);
	pwTxBx.sendKeys(pw);
	loginBtn.click();
}
	

}
