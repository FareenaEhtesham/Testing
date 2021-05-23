package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstSeleniumTest {
	
	public static void main(String[] args) {
		
//		System.setProperty("webdriver.gecko.driver", "/home/fareena/eclipse-workspace/SeleniumTest/geckodriver/geckodriver");
//		WebDriver driver = new FirefoxDriver();
		
		//for Run test in Chrome
		System.setProperty("webdriver.chrome.driver", "/home/fareena/eclipse-workspace/SeleniumTest/chromedriver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.lynda.com/Selenium-tutorials/Mastering-Selenium-Testing-Tools/521207-2.html");
		driver.quit();
	}
}