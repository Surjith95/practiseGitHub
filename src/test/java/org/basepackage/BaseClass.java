package org.basepackage;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;

	public static void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	public static void launchurl(String url) {
		driver.get(url);
	}

	public static void closebrowser() {
		driver.close();
	}

	public static String getProperty(String data) {
		Properties prop = new Properties();
		try {
			FileInputStream fis = new FileInputStream(
					"C:\\Users\\Sindhuja\\OneDrive\\Documents\\Projects\\Demo\\src\\test\\resources\\Data.properties");
			prop.load(fis);
		} catch (Exception e) {
			System.out.print(e);
		}
		return prop.getProperty(data);
	}
	
	public static void javaScriptclick(WebElement click) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click;",click);
	}

}
