package SeleniumPracticePrograms;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.hssf.record.ScenarioProtectRecord;

public class ReadPropertiesFile {

	Properties prop ;
	BufferedReader br ; 
	String propertyfilepath = "C:\\Users\\Prabhat\\eclipse-workspace\\GitPractice\\src\\test\\java\\PropertiesFile\\Configuration.properties" ; 
	
	public void readPropertiesFile() throws IOException
	{
		prop = new Properties();
		br = new BufferedReader(new FileReader(propertyfilepath));
		prop.load(br);
		
		System.out.println(prop.getProperty("username"));
		
		System.out.println(prop.getProperty("password"));
		
		System.out.println(prop.getProperty("url"));
		
		
		
		
	}
	
	
	public static void main(String args[]) throws IOException
	{
		ReadPropertiesFile rpf = new ReadPropertiesFile();
		
		rpf.readPropertiesFile();
		
	}
	
}
