package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pagefactory.HomePage_PF;
import pagefactory.LoginPage_PF;

public class MultipleLogin_PF {

	WebDriver driver = null;
	WebDriver tdriver;
	
	public LoginPage_PF login;
	 HomePage_PF home ;

	@Given("chrome browser is open")
	public void chrome_browser_is_open() {
		System.out.println("Inside step - Browser is open");
		System.out.println("Page factory");
        System.setProperty("webdriver.chrome.driver", "C:\\deplaced\\CUCUMBER\\Drivers\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

	}

	@And("user is on saucedemo page")
	public void user_is_on_saucedemo_page() {
		System.out.println("Inside step - User is on saucedemo page");
		driver.get("https://www.saucedemo.com/");
	}

	@When("^user enters (.*) and (.*)$")
	public void user_enters_username_as_and_password_as(String username, String password) {
		System.out.println("Inside step - User enters a valid credentials ");
		login = new LoginPage_PF(driver);
		login.enterUserName(username);
		login.enterPassword(password);

		// driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(username);
		// driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);

	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
		System.out.println("Inside step - User clicks on login button");

		login.clickOnLogin();
		// driver.findElement(By.id("login-button")).click();

	}

	@Then("user is navigated to swag labs page")
	public void user_is_navigated_to_swag_labs_page() throws InterruptedException {
		

		System.out.println("Inside step - User is navigated to Swag Labs");
		home = new  HomePage_PF(driver);
		home.checkLogoutIsDisplayed();

		Thread.sleep(2000);
		driver.quit();

	}

}
