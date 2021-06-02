package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Test {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "/home/fareena/eclipse-workspace/SeleniumTest/geckodriver/geckodriver");
		WebDriver driver = new FirefoxDriver();
		//select from dropdown
//		driver.get("http://demo.guru99.com/test/newtours/register.php");
//		Select dropdown= new Select(driver.findElement(By.name("country")));
//		dropdown.selectByVisibleText("ANTARCTICA");
//		Thread.sleep(2000);
//		System.out.println("Value select from the dropdown");
		
		// Test for radio button and checkboxes
		driver.get("http://demo.guru99.com/test/radio.html");
		driver.findElement(By.id("vfb-7-1")).click();
		System.out.println("Radio Button 1 Selected");
		driver.findElement(By.id("vfb-7-2")).click();
		System.out.println("Radio Button 2 Selected");
		driver.findElement(By.id("vfb-7-3")).click();
		System.out.println("Radio Button 3 Selected");
		
		WebElement option1 = driver.findElement(By.id("vfb-6-0"));
		option1.click();
		if(option1.isSelected()) {
			System.out.println("checkbox1 toggle on");
		}
		else {
			System.out.println("checkbox1 toggle off");
		}
		
		option1.click();
		if(!option1.isSelected()) {
			System.out.println("checkbox1 toggle off");
		}
		
		driver.quit();
	}
}
