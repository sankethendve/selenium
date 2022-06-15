package AssertionTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class OrangeHrmLogin {
	WebDriver driver;
  @BeforeTest
  public void setProperty() {
	  System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	  
  }
  @BeforeMethod
  public void launchBrowser() {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
	  driver.get("https://opensource-demo.orangehrmlive.com/");
	  
  }
  @Test
  public void testCase() {
	  SoftAssert softAssert = new SoftAssert();
	  String actualLoginpageTitle = driver.getTitle();
	  softAssert.assertEquals(actualLoginpageTitle,"OrrangeHrm");
	  driver.findElement(By.name("txtUsername")).sendKeys("Admin");
	  driver.findElement(By.name("txtPassword")).sendKeys("admin123");
  }
}
