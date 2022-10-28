package PageObject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
	@FindBy(xpath="//input[@id='SearchEmail']")private WebElement searchEmail;
	@FindBy(xpath="//button[@id='search-customers']")private WebElement searchButton;
	@FindBy(xpath="//table//tbody//tr//td")private List<WebElement> tData;
	//@FindBy(xpath="")private WebElement k;
	//@FindBy(xpath="")private WebElement k;
	//@FindBy(xpath="")private WebElement k;
	public SearchPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void enterEmailInSearchEmail(String email) {
		searchEmail.sendKeys(email);
	}
	public void clickOnSearchButton() {
		searchButton.click();
	}
	public void searchCustomerByEmail(String email) {
		int NoOfData=tData.size();
		
		System.out.println(NoOfData);
		
		for(int j=0;j<NoOfData;j++) {
			
			String data=tData.get(j).getText();
			
			if(data==email) {
			System.out.println("Test is Pass");
			}
		
		}
		
	}
}

