package gluecode;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef2 
{
	public Shared sh;
	//Dependency injection via constructor
	public StepDef2(Shared sh)
	{
		this.sh=sh;
	}
	// Define wait object 
	 @Then ("Search for perticular product {string}")
	 public void methd4(String product)throws Exception
	 {
		 sh.obj3.fillSearchBox(product);
		 sh.obj3.clickOnSubmit();
		 sh.obj3.clickOnItem();
		 Thread.sleep(5000);
	 }
	 @When ("do logout")
	 public void method5()throws Exception
	 {
		 sh.obj4.moveToLogout(sh.driver);
		 Thread.sleep(5000);
		 sh.obj4.clickOnLogout();
	 }
}
