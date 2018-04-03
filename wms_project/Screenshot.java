package wms_project;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Screenshot {
	
	static WebDriver driver;
	
	public static void main(String[] args) throws IOException, InterruptedException {
//		System.setProperty("webdriver.ie.driver", "C:\\Program Files (x86)\\Internet Explorer\\iexplore.exe");
//        WebDriver driver = new InternetExplorerDriver();
//		driver.manage().window().maximize();
//		Thread.sleep(3000);
//		driver.navigate().to("https://meanwms.p2staging.us/login");
//		driver.get("https://meanwms.p2staging.us/login");
		
	    File file = new File("C:\\Program Files (x86)\\Internet Explorer\\iexplore.exe");
	    System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
	    System.out.println(System.getProperty("webdriver.ie.driver")); 
	    WebDriver driver = new InternetExplorerDriver();
	    driver.get("http://www.midomi.com");
		
	}	
}
