package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage_PF {
	
	@FindBy(id="react-burger-menu-btn")
	@CacheLookup
	WebElement Btn_shop;
	
    WebDriver driver;
	
	public HomePage_PF(WebDriver driver) {
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	public void checkLogoutIsDisplayed() {
		
		Btn_shop.click();
		
		}

}
