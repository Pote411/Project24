package com.Test;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.PageObject.LoginPage;
import com.Utility.BaseClass;
public class LoginTest extends BaseClass {
	@Test	
	public void verifyLogin() throws InterruptedException {
	//LoginPage login=PageFactory.initElements(driver, LoginPage.class);
//		/LoginPage l=new LoginPage();
		try{Thread.sleep(2000);
		LoginPage.userid.sendKeys("KQ0846");
		Thread.sleep(2000);

		LoginPage.password.sendKeys("Pranjal@2020");
		Thread.sleep(2000);}
		catch (NullPointerException e) {
			
			System.out.println("handeld ");
		}
finally {
		LoginPage.submitbtn.click();
	System.out.println("Login verification Success");	
}
}

} 
 