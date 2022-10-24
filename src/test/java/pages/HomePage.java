package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
@FindBy(xpath="//div[@class='nav-line-1-container']/parent::a") public WebElement signIn;
	
	//constructor method
	
		public HomePage(RemoteWebDriver driver)
		{
			// connect "driver" object to above defined locators
			PageFactory.initElements(driver,this);
		}
		// operational and observation 
		public void moveToSiginElement(RemoteWebDriver driver)
		{
			Actions act =new Actions(driver);
			act.moveToElement(signIn).perform();
		}
}
