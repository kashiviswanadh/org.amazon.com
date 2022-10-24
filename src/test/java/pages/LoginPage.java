package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	@FindBy(xpath="//span[text()='Sign in']/parent::a")public WebElement loginInButton;
	@FindBy(xpath="//input[@type='email']")public WebElement userId;
	@FindBy(xpath="//input[@type='submit']")public WebElement clickNext;
	@FindBy(xpath="//input[@type='password']")public WebElement password;
	@FindBy(xpath="//input[@type='submit']")public WebElement nextButton;
	@FindBy(xpath="//div[@class='nav-line-1-container']/parent::a") public WebElement signIn;
	
	
	//constructor method
	
		public LoginPage(RemoteWebDriver driver)
		{
			// connect "driver" object to above defined locators
			PageFactory.initElements(driver,this);
		}
		public void clickLoginButton()
		{
			loginInButton.click();
		}
		public void fillUserId(String x)
		{
			userId.sendKeys(x);
		}
		public void clickNextButton()
		{
			clickNext.click();
		}
		public void fillPassword(String x)
		{
			password.sendKeys(x);
		}
		public void clickSubmitButton()throws Exception
		{
			nextButton.click();
			Thread.sleep(5000);
		}
		public void moveToSiginElement(RemoteWebDriver driver)
		{
			Actions act =new Actions(driver);
			act.moveToElement(signIn).perform();
		}
}
