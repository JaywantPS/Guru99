package utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	Properties properties;
	
	String path ="config.properties";//if you want you can also give relative path
	
	public ReadConfig() throws Exception {
		properties=new Properties();
		FileInputStream file=new FileInputStream(path);
		properties.load(file);		
	}
	
	public String getBaseUrl() {
		String value=properties.getProperty("baseUrl");
		if(value!=null)
			return value;
		else
			throw new RuntimeException("url is not specified in config file");
	}
	
	public String getBrowser() {
		String value=properties.getProperty("browser");
		if(value!=null)
			return value;
		else
			throw new RuntimeException("browser is not specified in config file");
	}

}
