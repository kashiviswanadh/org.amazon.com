package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchProduct 
{
	@FindBy(xpath="//input[@type='text']")public WebElement searchBox;
	@FindBy(xpath="//input[@type='submit']")public WebElement submitButton;
	@FindBy(xpath="(//div[contains(@class,'a-section aok')])[1]/child::img")public WebElement selectItem;
	
	//constructor method
	
		public SearchProduct(RemoteWebDriver driver)
		{
			// connect "driver" object to above defined locators
			PageFactory.initElements(driver,this);
		}
		public void fillSearchBox(String x)
		{
			searchBox.sendKeys(x);
		}
		public void clickOnSubmit()
		{
			submitButton.click();
		}
		public void clickOnItem()
		{
			selectItem.click();
		}
		
}
