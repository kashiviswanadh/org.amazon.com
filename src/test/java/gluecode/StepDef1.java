package gluecode;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;


public class StepDef1 
{
	public Shared sh;
	//Dependency injection via constructor
	public StepDef1(Shared sh)
	{
		this.sh=sh;
	}
	// Define wait object 
	
	
	@Given("I want to open {string} broswer") 
	
	public void method1(String bn)
	{
		if(bn.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			// define objects 
			sh.driver= new ChromeDriver();
		}
		else
		{
			WebDriverManager.firefoxdriver().setup();
			sh.driver = new FirefoxDriver();
		}
		
		sh.driver.manage().window().maximize();
	}
	@When("I want to Launch a site {string}") 
	public void method2(String url)throws Exception
	{
		sh.driver.get("https://www.amazon.in");
		Thread.sleep(5000);
	}
	@Then ("do login using {string} and {string} credentials")
	public void method3(String uid,String pwd)throws Exception
	{
		sh.obj1.moveToSiginElement(sh.driver);
		Thread.sleep(3000);
		sh.obj2.clickLoginButton();
		sh.obj2.fillUserId(uid);
		sh.obj2.clickNextButton();
		sh.obj2.fillPassword(pwd);
		sh.obj2.clickSubmitButton();
		
	}
	
	
	
	
}
