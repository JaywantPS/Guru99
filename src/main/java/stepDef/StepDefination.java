package stepDef;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import PageObject.AddNewCustomerPage;
import PageObject.LoginPage;
import PageObject.SearchPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.ReadConfig;
import utilities.Screenshot;


public class StepDefination extends BaseClass {
	
	@Before
	public void setup() throws Exception {
		//log=LogManager.getLogger("StepDefination");
		readConfig=new ReadConfig();
		String browser=readConfig.getBrowser();
		
		switch(browser)
		{
		case "chrome" :
		 WebDriverManager.chromedriver().setup();
		    driver=new ChromeDriver();		   
		   
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		
		}
	}
	
	
	@Given("User Launch Chrome Browser")
	public void user_launch_chrome_browser() {
	   
	    
	    lp=new LoginPage(driver);
	    ancp=new AddNewCustomerPage(driver);
	    sp=new SearchPage(driver);
	    //log.info("Chrome Brower launched");
	    
	}

	@When("User opens URL {string}")
	public void user_opens_url(String url) {
	    driver.get("https://admin-demo.nopcommerce.com/login");
	}

	@When("User enters Email as {string} and password as {string}")
	public void user_enters_email_as_and_password_as(String Email, String password) {
		lp.enterEmailID(Email);
		lp.enterPassword(password);	    
	}

	@When("user click on login")
	public void user_click_on_login() {
	   lp.clickOnLogin();
	   
	}

	@Then("user on page have Title {string}")
	public void user_on_page_have_title(String expectedTitle) {
	    String actualTitle=driver.getTitle();
	    System.out.println(actualTitle);
	    if(actualTitle==expectedTitle) {
	    	Assert.assertTrue(true);
	    }
	    else 
	    {
	    	System.out.println("Test is Fail");
	    	Assert.assertTrue(false);
	    }
	}    
	
	@When("user click on Customer menu")
	public void user_click_on_customer_menu() {
	   ancp.clickOnCustomerDropdown();
	 
	}

	@When("Click on customers Menu Item")
	public void click_on_customers_menu_item() {
	    ancp.clickOnCustomers();
	}

	@When("Enter customer Email {string}")
	public void enter_customer_email(String email) {
	    sp.enterEmailInSearchEmail("arthur_holmes@nopCommerce.com");
	}

	@When("Click on search button")
	public void click_on_search_button() {
	    sp.clickOnSearchButton();
	}

	@Then("User should found Email in the search table")
	public void user_should_found_email_in_the_search_table() {
	   sp.searchCustomerByEmail("arthur_holmes@nopCommerce.com");
	}


	
	///////////////----Add New Customer Steps----////////////////////////
	
	@When("click on customer menu Item")
	public void click_on_customer_menu_item() {
	    ancp.clickOnCustomers();
	}

	@When("click on Add New button")
	public void click_on_add_new_button() {
	    ancp.clickAddNew();
	}

	@Then("user can view Add New Customer page")
	public void user_can_view_add_new_customer_page() {
	    String actualTitle=driver.getTitle();
	    String expectedTitle="";
	    if(actualTitle==expectedTitle) {
	    	System.out.println("Test is Passed");
	    }
	    else {
	    	System.out.println("Test is Failed");
	    }
	}

	@When("user enter customer info")
	public void user_enter_customer_info() {
	    ancp.enterEmail(generateEmail()+"@gmail.com");
	}

	@When("click on save button")
	public void click_on_save_button() {
	    ancp.clickOnSave();
	}

	@Then("user can view confirmation massege {string}")
	public void user_can_view_confirmation_massege(String string) {
	    WebElement body=driver.findElement(By.tagName("body"));
	    String bodyText= body.getText();
	    if(bodyText.contains("New customer login successfully")) {
	    	System.out.println("Test is Passed");
	    }
	    else {
	    	System.out.println("Test is Failed");
	    }
	}

	@Then("close browser")
	public void close_browser() {
	    driver.close();
	}
	
	///////////-----Search Customer-----////////////////
	
	@When("User open URL {string}")
	public void user_open_url(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User enter Email as {string} and Password as {string}")
	public void user_enter_email_as_and_password_as(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Click on login")
	public void click_on_login() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User can view Dashboard {string}")
	public void user_can_view_dashboard(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
    @After
	public void tearDown(Scenario sc) throws Exception {
		System.out.println("Tear Down method executed");
		if(sc.isFailed()==true) {
		Screenshot.getScAs("LoginValidCre");
		}
		driver.quit();
	}
	
	
	//////////---Login Valid Cre-----////////////////////
	@When("user click on logout")
	public void user_click_on_logout() {
	    lp.clickOnLogout();
	}

	@Then("User close the broser")
	public void user_close_the_broser() {
	    driver.close();
	}

}
