package classAssignment1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scenario2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.xpath("//body[@class=\"page-front new-hp-ui with-white-header no-footer-top    p-auto-play   no-ticker\"]")).click();
		Thread.sleep(3000);
		WebElement ref = driver.findElement(By.xpath("//span[@data-p=\"offers,m\"]"));
		Acti+
	}

}
