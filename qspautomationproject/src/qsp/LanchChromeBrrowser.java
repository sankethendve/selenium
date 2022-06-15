package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class LanchChromeBrrowser {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();//open the browser
		driver.manage().window().maximize();//maximise the browser
		driver.get("https://www.instagram.com");// launc te web  application
		Thread.sleep(10000);//provide the delay of the sec 
		driver.close();//close the windows
		
	}
}
