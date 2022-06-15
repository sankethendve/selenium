package classAssignment1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScenarioNo1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.xpath("//body[@class=\"page-front new-hp-ui with-white-header no-footer-top    p-auto-play   no-ticker\"]")).click();
		Thread.sleep(3000);
		WebElement ref = driver.findElement(By.xpath("//span[@onclick=\"trackGA( 'BsUI', 'MainMenu', 'Offer');\"]"));
		Actions act=new Actions(driver);
		act.moveToElement(ref).perform();
		driver.findElement(By.xpath("//span[@onclick=\"window.location='https://www.bluestone.com/jewellery/filter/10+percent+off+on+making+charge+on+plain+gold.html'\"]")).click();
		//verify te products list display with 10% changing
		Thread.sleep(3000);
		driver.close();
	}

}
