package Staging.XPO;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Abstractcomponent.Abstract;

public class mainsite extends Abstract{
	
	WebDriver driver;		
	public mainsite(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy (xpath = "(//*[@class='hover-effect'])[1]")
	WebElement viewfavorites;
	
	@FindBy(xpath = "//th[@class='ant-table-cell']")
	List<WebElement> Favstandstable;
	
	@FindBy(xpath ="//*[@class='ant-table-cell'] //span[@class='ant-badge ant-badge-status ant-badge-not-a-wrapper']/span[@class='ant-badge-status-text']")
	WebElement userstatus;

	@FindBy(xpath="//*[text()='UEFA Champions League']")
	WebElement Eventname;
	
	@FindBy(xpath="//*[text()='Visit Event']")
	WebElement Visitevent;
	
	@FindBy(xpath="//div[@class='EventListBox']//*[@class='EventBoxBottom']")
	List <WebElement> eventbox;
	
	@FindBy(xpath ="//*[@class='mapbgpinkbg']")
	WebElement Eventpagehappeningnow;
	
	@FindBy(xpath="//*[@class='eventbtncret']")
	WebElement discoverevents;

	@FindBy(xpath="//*[@class='mapMenuOpen mapMenuOpen-sponsorship']")
	WebElement sidemenu;
	
	@FindBy(xpath="//span[@class='anticon anticon-left']")
	WebElement Backbuttoneventpage;
	
	@FindBy(xpath="//button[@class='ant-btn ant-btn-default btn_class']")
	WebElement Buyticket;
	
	@FindBy(xpath ="//*[@class='vipBoxTicketBottom']")
	WebElement ticketdetails;
	
	@FindBy(linkText="BUY TICKET")
	WebElement clickbuyticket;
	
	@FindBy(xpath="//*[@class='ant-modal-body']")
	WebElement Ticketmodal;
	
public void dashboards() throws InterruptedException {
	
	Thread.sleep(2000);
	System.out.println(	Eventname.getText());
	viewfavorites.click();
	int t = Favstandstable.size();
	for(int i =0 ; i<t ; i++)
			{
		System.out.print("\t" + Favstandstable.get(i).getText());
			System.out.println(" ");
			Thread.sleep(2000);
	String Statusofuser = userstatus.getText();
	if (Favstandstable.get(i).getText().contains("User Status"))
		System.out.println("User Status" + " :" + Statusofuser );
			}
	Backbutton();
	Thread.sleep(1000);
	
	for (int i =0 ;i<eventbox.size();i++)
	{
		//System.out.println(eventbox.get(i).getText());
		System.out.println(	eventbox.get(i).getText().indexOf("GYMNESTIC"));
		System.out.println(" ");
		if(eventbox.get(i).getText().indexOf("GYMNESTIC") ==0)
		{
			Visitevent.click();
				break;
		}
			 }
	Thread.sleep(2000);
	sidemenu.click();
	System.out.println(Eventpagehappeningnow.getText());
	Backbuttoneventpage.click();
	discoverevents.click();
}


	public void Buyticket() throws InterruptedException {
		
		Thread.sleep(2000);
		for (int i =0 ;i<eventbox.size();i++)
		{
			System.out.println(" ");
			System.out.println(eventbox.get(i).getText());
			System.out.println(	eventbox.get(i).getText().indexOf("GYMNESTIC"));
			System.out.println(" ");
			if(eventbox.get(i).getText().indexOf("GYMNESTIC") ==0)
			{
				Buyticket.click();
				break;
				
	}
		}
			System.out.println(ticketdetails.getText());
			clickbuyticket.click();
			System.out.println (Ticketmodal.getText());
			
			
			
		
	}
}
	

