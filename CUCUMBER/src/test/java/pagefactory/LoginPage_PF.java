package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_PF {

	@FindBy(id = "user-name")
	@CacheLookup
	WebElement Txt_username;

	@FindBy(id = "password")
	@CacheLookup
	WebElement Txt_password;

	@FindBy(id = "login-button")
	@CacheLookup
	WebElement btn_login;

	
	WebDriver driver;

	public LoginPage_PF(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

	public void enterUserName(String username) {

		Txt_username.sendKeys(username);
	}

	public void enterPassword(String password) {

		Txt_password.sendKeys(password);
	}

	public void clickOnLogin() {

		btn_login.click();
	}

	
}
