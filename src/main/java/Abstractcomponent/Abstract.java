package Abstractcomponent;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class Abstract {

	public static WebDriver driver;
	
	@BeforeMethod
	public void Website() {
		
	
	driver = new ChromeDriver();
	driver.get("https://staging.xpofairs.com/");
	driver.manage().window().maximize();
	/*
	 * driver.findElement(By.xpath("//*[text()='Log in']")).click();
	 * driver.findElement(By.id("basic_email")).sendKeys("wick3@mailinator.com");
	 * driver.findElement(By.id("basic_password")).sendKeys("Test@1234");
	 * driver.findElement(By.xpath("//*[text()='Sign in']")).click();
	 */	}
	
	
	public void Backbutton() {
		driver.findElement(By.xpath("//*[@class='back-btn']")).click();
	}
	
	
	
	}
		
	
	

