package javaProperties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class JavaPropertiesFile {

	public static void main(String[] args) throws IOException {
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\javaProperties\\object.properties");
		prop.load(fis);
		
		System.out.println(prop.getProperty("Name"));
		System.out.println(System.getProperty("user.dir"));
		
	}

}
