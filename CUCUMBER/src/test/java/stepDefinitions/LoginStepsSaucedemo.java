package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepsSaucedemo {
	
/*	WebDriver driver;

	@Given("chrome browser is open")
	public void chrome_browser_is_open() {
	   System.out.println("Inside step - Browser is open");
	   
	   driver = new ChromeDriver();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   driver.manage().window().maximize();
	   
	}

	@And("user is on saucedemo page")
	public void user_is_on_saucedemo_page() {
		System.out.println("Inside step - User is on saucedemo page");
		driver.get("https://www.saucedemo.com/");
	}

	@When("user enters username as {string} and password as {string}")
	public void user_enters_username_as_and_password_as(String string, String string2) {
		System.out.println("Inside step - User enters a valid credentials ");
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("performance_glitch_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");

	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
		System.out.println("Inside step - User clicks on login button");
		driver.findElement(By.id("login-button")).click();

	}

	@Then("user is navigated to swag labs page")
	public void user_is_navigated_to_swag_labs_page() {
		System.out.println("Inside step - User is navigated to Swag Labs");
		driver.getPageSource().contains("Sauce Labs Bike Light");
		driver.quit();
		

	}*/

}
