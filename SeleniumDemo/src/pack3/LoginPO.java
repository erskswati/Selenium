package pack3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class LoginPO
{
	public LoginPO(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		}
	@FindBy(xpath="//input[@name='username']")
	private WebElement unTxtBx;
	public WebElement unTxtBx() 
	{
		return unTxtBx;
		}
	@FindBy(xpath="//input[@name='pwd']")
	private WebElement pwTxtBx;
	public WebElement pwTxtBx() 
	{
		return pwTxtBx;
		}
	@FindBy(xpath="//a[@id='loginButton']")
	private WebElement loginBtn;
	public WebElement loginBtn() 
	{
		return loginBtn;
		}
	public void loginToHome(String un,String pw)
	{
		unTxtBx.sendKeys(un);
		unTxtBx.sendKeys(pw);
		loginBtn.click();
		}
	}
