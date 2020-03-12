package org.milligram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	static WebDriver driver;
	public static void lunchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PANDI\\eclipse-workspace\\MavenTest\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	public static void lunchUrl(String url) {
		driver.get(url);
		}
	public static void maximize() {
		driver.manage().window().maximize();
	}
	public static void getUrl() {
		String url = driver.getCurrentUrl();
		System.out.println(url);
	}
	public static void getTitle() {
		String title = driver.getTitle();
		System.out.println(title);
	}
	public static void fillText(WebElement e,String value) {
		e.sendKeys(value);
		
	}
	
		public static void buttonClick(WebElement e) {
		e.click();
		
	}
	

}
