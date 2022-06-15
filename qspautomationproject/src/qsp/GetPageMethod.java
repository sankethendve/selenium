package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageMethod {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Desktop\\wcsm7/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
	}

}
