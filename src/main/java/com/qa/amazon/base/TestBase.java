package com.qa.amazon.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.qa.amazon.utils.Testutils;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;

public TestBase()  {
	
	try {prop=new Properties();
		FileInputStream file=new FileInputStream("C:\\Users\\Ankit Rawat\\eclipse-workspace\\Amazon_Project\\src\\main\\java\\com\\qa\\amazon\\config\\config.properties");
		prop.load(file);
	} catch (FileNotFoundException e) 
	{
		
		e.printStackTrace();
	} catch (IOException e) 
	{
		e.printStackTrace();
	}}
	 public static void initalization() {
		 String BrowserName=prop.getProperty("Browser");
	 if(BrowserName.equalsIgnoreCase("Chrome")) {
		 System.setProperty("Webddriver.chrome.driver","D:\\chromedriver.exe");
		 driver=new ChromeDriver();
	 }else  if(BrowserName.equalsIgnoreCase("FF")) {
		 System.setProperty("Webddriver.gicko.driver","D:\\gickodriver.exe");
		 driver=new FirefoxDriver();}
	 else{
		 System.out.println("wrong browser");
	 }
	 driver.manage().window().maximize();
	 driver.manage().deleteAllCookies();
	 driver.manage().timeouts().implicitlyWait(Testutils.IMPLCIT_WAIT,TimeUnit.SECONDS);
	 driver.manage().timeouts().pageLoadTimeout(Testutils.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
	 
	 
}
}