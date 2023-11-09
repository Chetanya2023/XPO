package Staging.XPO;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import Abstractcomponent.Abstract;

public class Allpages extends Abstract {

	public static WebDriver driver;
	//
	
	public Allpages(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver,this );
		
		
	}
	
		//-----------------------------------------------------
		//login and Registration Block
	
		@FindBy(xpath="//*[text()='Log in']")
		WebElement loginmodal;
		
		@FindBy(id="basic_email")
		WebElement loginemail;
		
		@FindBy(id="basic_password")
		WebElement loginpassword;
		
		@FindBy(xpath="//*[@class='ant-input-suffix']")
		WebElement Eyepassword;
		
		@FindBy(xpath ="//*[text()='Sign in']")
		WebElement Signclick;
		
		@FindBy(xpath="//div[@class='ant-message']")
		WebElement Welcometoast;
		
		
		//How to get text for password field  - This is remaining
		
		//	---------------------------------------------------------------
		
		//Dashboard WebElement
		
		@FindBy(xpath="//div[@class='eventTitle']")
		WebElement eventtitle;
		
		
		//------------------------------------------------------------
		public void Login_modal(String email , String password)   {
			
			loginmodal.click();
			loginemail.sendKeys(email);
			loginpassword.sendKeys(password);
			Eyepassword.click();
			Signclick.click();
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
			wait.until(ExpectedConditions.visibilityOf(Welcometoast));
			System.out.println(Welcometoast.getText());
			
			
			
			
		}

//--------------------------------------------------------------
		
	
}
