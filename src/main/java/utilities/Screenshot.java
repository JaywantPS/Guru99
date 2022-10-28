package utilities;

import java.io.File;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import stepDef.BaseClass;

public class Screenshot extends BaseClass {
	
	public static void getScAs(String fileName) throws Exception {	
	TakesScreenshot ts=(TakesScreenshot)driver;
    File souce=ts.getScreenshotAs(OutputType.FILE);
    File target=new File("F:\\EclipseWSpace\\nopCommerceCu\\Screenshot\\"+fileName+".png");
    FileHandler.copy(souce, target);
	}
}
