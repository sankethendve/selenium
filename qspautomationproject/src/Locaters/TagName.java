package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/webhp?tab=rw");
		driver.findElement(By.tagName("input")).sendKeys("sanket");
		Thread.sleep(10000);
		driver.switchTo().activeElement();
		driver.get("https://www.facebook.com");
		Thread.sleep(3000);
		driver.close();
		
		
	}

}
