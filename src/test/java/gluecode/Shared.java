package gluecode;

import org.openqa.selenium.remote.RemoteWebDriver;

import io.cucumber.java.Scenario;
import pages.HomePage;
import pages.LoginPage;
import pages.LogoutPage;
import pages.SearchProduct;



public class Shared 
{
	//declare common objects
		public RemoteWebDriver driver;
		public HomePage obj1;
		public LoginPage obj2;
		public SearchProduct obj3;
		public LogoutPage obj4;
		public Scenario s; //to customize results file
		
}
