package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class AddNewCustomerPage {
	@FindBy(xpath="(//i[@class='right fas fa-angle-left '])[4]")private WebElement customersdrdown;
	@FindBy(xpath="//a[@href='/Admin/Customer/List']")private WebElement customers;
	@FindBy(xpath="//a[@class='btn btn-primary']")private WebElement addNew;
	@FindBy(xpath="//input[@id='Email']")private WebElement Email;
	@FindBy(xpath="//input[@id='Password']")private WebElement Password;
	@FindBy(xpath="//input[@id='FirstName']")private WebElement FirstName;
	@FindBy(xpath="//input[@id='LastName']")private WebElement LastName;
	@FindBy(xpath="//input[@id='Gender_Male']")private WebElement GenderMale;
	@FindBy(xpath="//input[@id='Gender_Female']")private WebElement GenderFemale;
	@FindBy(xpath="//input[@id='DateOfBirth']")private WebElement DoB;
	@FindBy(xpath="//input[@id='Company']")private WebElement CompanyName;
	@FindBy(xpath="//input[@id='IsTaxExempt']")private WebElement IsTaxExempt;
	@FindBy(xpath="(//div[@role='listbox'])[1]")private WebElement Newletter;
	@FindBy(xpath="(//div[@role='listbox'])[2]")private WebElement CustomerRole;
	@FindBy(xpath="//select[@id='VendorId']")private WebElement ManagerOfVendor;
	@FindBy(xpath="//textarea[@name='AdminComment']")private WebElement AdminComment;
	@FindBy(xpath="(//button[@type='submit'])[2]")private WebElement Save;
	
	public AddNewCustomerPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void clickOnCustomerDropdown() {
		customersdrdown.click();
	}
	public void clickOnCustomers() {
		customers.click();
	}
	public void clickAddNew() {
		addNew.click();
	}	
	public void enterEmail(String email) {
		Email.sendKeys(email);
	}
	public void enterPassword(String password) {
		Password.sendKeys(password);
	}
	public void enterFirstName(String firstName) {
		FirstName.sendKeys(firstName);
	}
	public void enterLastName(String lastName) {
		LastName.sendKeys(lastName);
	
	}
	public void clickOnGenderMale() {
		GenderMale.click();
	}
	public void clickOnGenderFemale() {
		GenderFemale.click();
	}
	public void enterDoB(String dob) {
		DoB.sendKeys(dob);
	}
	public void enterCompanyName(String cName) {
		CompanyName.sendKeys(cName);
	}
	public void enterIsTaxExempt() {
		IsTaxExempt.click();
	}
	public void enterNewsLetter(String newsLetter) {
		Newletter.sendKeys(newsLetter);
	}
	public void enterCustomerRole(String customerRole) {
		CustomerRole.sendKeys(customerRole);
		Select s=new Select(CustomerRole);
		s.selectByValue("Administrator");
	}
	public void enterManagerOfVendor(String managerOfVendor) {
		ManagerOfVendor.sendKeys(managerOfVendor);
	}
	public void enterAdminComment(String adminComment) {
		AdminComment.sendKeys(adminComment);
	}
	public void clickOnSave() {
		Save.click();
	}

}
