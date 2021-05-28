package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstSeleniumTest {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "/home/fareena/eclipse-workspace/SeleniumTest/geckodriver/geckodriver");
		WebDriver driver = new FirefoxDriver();
		
		//for Run test in Chrome
//		System.setProperty("webdriver.chrome.driver", "/home/fareena/eclipse-workspace/SeleniumTest/chromedriver/chromedriver");
//		WebDriver driver = new ChromeDriver();
		driver.get("http://www.gmail.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("identifierId")).sendKeys("fareena.ehtesham.230@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".VfPpkd-Jh9lGc")).click();
		Thread.sleep(2000);
		//actual Output
		String atitle =driver.getTitle();
		//expected Output
		String etitle = "Gmail";
		driver.close();
		if(atitle.equalsIgnoreCase(etitle)) {
			System.out.println("Test Successfully Pass");
		}
		else
		{
			System.out.println("Test Fail");
		}
	}
}