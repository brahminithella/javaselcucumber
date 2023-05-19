package stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Flipkartloginpage 
{
   WebDriver driver;
		@Given("browser is open")
		public void browser_is_open() {
		   System.out.println("inside step-browser is open");
		   String ProjectPath= System.getProperty("User.dir");
			System.out.println("ProjectPath is:"+ProjectPath);
		   System.setProperty("Webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
		   driver=new ChromeDriver();
		   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	   
	       driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		}

	@And("user is on Flipkart login page")
	public void user_is_on_flipkart_login_page() {
		 driver.get("https://www.flipkart.com");
	}

	@When("user enter valid credentials")
	public void user_enter_valid_credentials() {
		   driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"))
           .sendKeys("chittibrahmi97@gmail.com");
	}
	@When("user enter invalid credentials")
	public void user_enter_invalid_credentials() {
		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"))
        .sendKeys("chittibrahmi@gmail.com");
	}
	@And("user clicks on Request OTP button")
	public void user_clicks_on_request_otp_button() {
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"))
        .click();
	}

	@Then("user should be logged in successfully")
	public void user_should_be_logged_in_successfully() {
	   driver.close();
	}


	@Then("user should see an error message")
	public void user_should_see_an_error_message() {
	  driver.quit();
	}



}
