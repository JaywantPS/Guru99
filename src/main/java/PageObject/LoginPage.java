package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	@FindBy(xpath="//input[@type='email']")private WebElement email;
	@FindBy(xpath="//input[@type='password']")private WebElement password;
	@FindBy(xpath="//button[@type='submit']")private WebElement submit;
	@FindBy(xpath="//a[text()='Logout']")private WebElement logout;
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void enterEmailID(String emailID) {
		email.clear();
		email.sendKeys(emailID);
	}
	public void enterPassword(String pass) {
		password.clear();
		password.sendKeys(pass);
	}
	public void clickOnLogin() {
		
		submit.click();
	}
	public void clickOnLogout() {
		
	}

}


