package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrl {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com");
	//	driver.close();
		//String getpage= driver.getTitle();
		//String geturl= driver.getCurrentUrl();
		//System.out.println(getpage);
		//System.out.println(geturl);
		driver.findElement(By.linkText("open a popp window")).click();

		
	}

}
