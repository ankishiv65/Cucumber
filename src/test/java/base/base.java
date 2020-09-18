package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {
	public static WebDriver driver;
	public static Properties prop;
	public static WebDriver getdriver() throws IOException {
		 prop=new Properties();
		FileInputStream f1=new FileInputStream("C:\\Users\\Dell\\Downloads\\eclipse_workspace3\\Udemy_Cucumber\\src\\test\\java\\base\\global.properties"); 
		prop.load(f1); 
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver.exe");
	        driver=new ChromeDriver();
	       
	        return driver;
	}
}
