package pack2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ActiTimeHome
{
	private WebElement logoutBtn;
	public ActiTimeHome(WebDriver driver)
	{
		logoutBtn=driver.findElement(By.id("logoutLink"));
	}
	public void clickLogout()
	{
		logoutBtn.click();
	}

}
