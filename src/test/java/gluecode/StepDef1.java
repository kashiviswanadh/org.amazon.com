package gluecode;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.HomePage;
import pages.LoginPage;
import pages.LogoutPage;
import pages.SearchProduct;


public class StepDef1 
{


	// Define wait object 
	public RemoteWebDriver driver;
	public HomePage obj= new HomePage();
	public LoginPage obj2;
	public SearchProduct obj3;
	public LogoutPage obj4;
	
	@Given("I want to open {string} broswer") 
	
	public void method1(String bn)
	{
		
		obj.Browserlunch(bn);
		
	}
	@When("I want to Launch a site {string}") 
	public void method2(String url)throws Exception
	{
		obj.Launchsite();
	}
	@Then("do login using {string} and {string} credentials")
	public void method3(String x,String y)throws Exception
	{
		
		obj2.moveToSiginElement(driver);
		Thread.sleep(3000);
		obj2.clickLoginButton();
		obj2.fillUserId(x);
		obj2.clickNextButton();
		obj2.fillPassword(y);
		obj2.clickSubmitButton();
		
		
	}
	@Then ("Search for perticular product {string}")
	 public void methd4(String product)throws Exception
	 {
		 obj3.fillSearchBox(product);
		 obj3.clickOnSubmit();
		 obj3.clickOnItem();
		 Thread.sleep(5000);
	 }
	 @When ("do logout")
	 public void method5()throws Exception
	 {
		 obj4.moveToLogout(driver);
		 Thread.sleep(5000);
		 obj4.clickOnLogout();
	 }
	
	
	
	
}
