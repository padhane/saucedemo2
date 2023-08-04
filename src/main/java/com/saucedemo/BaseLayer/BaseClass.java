package com.saucedemo.BaseLayer;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {

	private static ThreadLocal<WebDriver> webdriverthread =new ThreadLocal<WebDriver>();
	
	public WebDriver getDriver()
	{
		return webdriverthread.get();
	}
	
	public void initialization(String browsername)
	{
		WebDriver driver=null;
		
		if(browsername.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if (browsername.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
		}
		else if(browsername.equals("firefox"))
		{
			driver =new FirefoxDriver();
		}
		else if (browsername.equalsIgnoreCase("headless"))
		{
			ChromeOptions opt =new ChromeOptions();
			opt.addArguments("--headless");
			driver=new ChromeDriver(opt);
		}
		else if (browsername.equalsIgnoreCase("incognito"))
		{
			ChromeOptions opt =new ChromeOptions();
			opt.addArguments("--incognito");
			driver=new ChromeDriver(opt);
		}
		else 
		{
			System.err.println("Please mention proper browser name ");
		}
			
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		webdriverthread.set(driver);
		driver.get("https://www.saucedemo.com/");
	}
	
	
}
