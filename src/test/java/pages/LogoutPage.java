package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage 
{
	@FindBy(xpath="//div[contains(@class,'nav-line-')]/parent::a")public WebElement moveToLogout;
	@FindBy(xpath="//span[text()='Sign Out']/parent::a")public WebElement logOutbutton;
	
	//constructor method
	
		public LogoutPage(RemoteWebDriver driver)
		{
			// connect "driver" object to above defined locators
			PageFactory.initElements(driver,this);
		}
		public void moveToLogout(RemoteWebDriver driver)
		{
			Actions act = new Actions(driver);
			act.moveToElement(moveToLogout).perform();
			
		}
		public void clickOnLogout()
		{
			logOutbutton.click();
		}
}
