package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class RunTimePollymorphism {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(10000);
		driver.get("https://www.google.com/");
		String sourcCodeOfTheWebPage = driver.getPageSource();
		System.out.println(sourcCodeOfTheWebPage);
	}

}
