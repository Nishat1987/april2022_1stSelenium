package launchBrowsernew;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {
 
	 public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\nisha\\Selenium\\firstselenium\\driver\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver(); 
		 driver.get("https://www.selenium.dev/");
		 driver.manage().window().maximize();
		 Thread.sleep(5000);
		 driver.close();

}}
