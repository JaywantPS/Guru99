package stepDef;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import PageObject.AddNewCustomerPage;
import PageObject.LoginPage;
import PageObject.SearchPage;
import utilities.ReadConfig;

public class BaseClass {
	
	public static WebDriver driver;
	public LoginPage lp;
	public AddNewCustomerPage ancp;
	public SearchPage sp;
	//public static Logger log;
	public ReadConfig readConfig;
	
	public String generateEmail() {
		return(RandomStringUtils.randomAlphabetic(7));
	}
	

}
