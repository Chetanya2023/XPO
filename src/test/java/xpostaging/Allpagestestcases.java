package xpostaging;

import org.testng.annotations.Test;

import Abstractcomponent.Abstract;
import Staging.XPO.Allpages;
import Staging.XPO.mainsite;

public class Allpagestestcases extends Abstract {

	@Test
	public void login_modal() throws InterruptedException  {
		Allpages allpages = new Allpages(driver);
		mainsite dashboard = new mainsite(driver);
		allpages.Login_modal("wick3@mailinator.com", "Test@1234");
		dashboard.dashboards();
		dashboard.Buyticket();
	}
	
		
		
		
	
}
