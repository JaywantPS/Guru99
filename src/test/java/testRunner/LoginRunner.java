package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features=".//Feature/LoginValidCre.feature",
		//features=".//Feature/Customer.feature",
		//features= {".//Feature/Customer1.feature",".//Feature/Search_Customer.feature"},
		glue="stepDef",
		//tags="@Sanity",
		dryRun=false,
		monochrome=true,
		plugin= {"pretty","html:CucumberReports/reports_html.html"}	
		)
//if we want to run all feature files then we are not specify specific name like ".//Feature/"

//plugin={"pretty","html:CucumberReports/reports_html.html"}
//plugin={"pretty","json:CucumberReports/reports_json.json"}
//plugin={"pretty","junit:CucumberReports/reports_xml.xml"}
public class LoginRunner {

}
