package stepDefinitions;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class GoogleSearchSteps {
	WebDriver driver = null;

@Given("browser is open")
public void browser_is_open() {
    System.out.println("Inside Steps - browser is open");
    System.setProperty("WebDriver.chrome.driver", "C:/deplaced/CUCUMBER/Drivers/chromedriver.exe");
     driver = new ChromeDriver();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}

@And("user is on google search page")
public void user_is_on_google_search_page() {
	System.out.println("Inside Steps - user is on google search page");
	driver.get("https://www.google.fr/");
	driver.manage().window().maximize();
	driver.findElement(By.id("L2AGLb")).click();
}

@When("user enters a text in search box")
public void user_enters_a_text_in_search_box() {
	System.out.println("Inside Steps - user enters a text ");
	driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("Automation step by step");
}

@And("hits enter")
public void hits_enter()  {
	System.out.println("Inside Steps - user hits enter");
	driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys(Keys.ENTER);
}

@Then("user is navigated to search results")
public void user_is_navigated_to_search_results() {
	System.out.println("Inside Steps - user is navigated to search results");
	driver.getPageSource().contains("Online Courses");
	
	driver.quit();
}


}
