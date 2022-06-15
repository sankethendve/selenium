package findElementsMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElements1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		Timeouts implicitlyWait = driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.switchTo().activeElement().sendKeys("virat kohli");
		
		

	}

}
