package org.milligram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Milligram extends BaseClass {
public static void main(String[] args) throws InterruptedException {
	lunchBrowser();
	lunchUrl("https://milligram.com/new");
	maximize();
	getTitle();
	getUrl();
	WebElement n = driver.findElement(By.xpath("//span[text()='New']"));
	buttonClick(n);
	Thread.sleep(4000);
	WebElement p1 = driver.findElement(By.xpath("//a[contains(text(),'Sustomi - Mesh')]"));
	buttonClick(p1);
WebElement add = driver.findElement(By.xpath("//button[@title='Add to Cart']"));
buttonClick(add);
}  

}
