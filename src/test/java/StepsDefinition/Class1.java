package StepsDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Class1
{
	WebDriver driver;
	
	@Given("^Open firefox and then open application$")
	public void open_firefox_and_then_open_application() throws Throwable 
	{
		System.setProperty("webdriver.gecko.driver","E:\\Desktop and Download Data\\Desktop\\Selenium\\Gecko Driver\\geckodriver-v0.24.0-win64\\geckodriver.exe");

		driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");

	
	}

	@When("^Enter valid username and valid password$")
	public void enter_valid_username_and_valid_password() throws Throwable 
	{
		driver.findElement(By.id("email")).sendKeys("Test1");
		driver.findElement(By.id("pass")).sendKeys("Test1");
	
	}

	@Then("^User should login into facebook$")
	public void user_should_login_into_facebook() throws Throwable 
	{
		driver.findElement(By.xpath("//input[contains(@id,'u_0_')]")).click();
	
	}


}
