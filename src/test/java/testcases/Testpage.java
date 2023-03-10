package testcases;

import static org.testng.Assert.assertEquals;
import static utilities.DriverSetUp.getDriver;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.ManuOptionPage;
import pages.MyBusses;
import pages.SignInPage;
import pages.TripsDetails;
import utilities.DriverSetUp;

public class Testpage extends DriverSetUp{
	
	HomePage homePage =  new HomePage();
	SignInPage signInPage = new SignInPage();
	ManuOptionPage manuOptionPage = new ManuOptionPage();
	MyBusses busses = new MyBusses();
	TripsDetails tripsDetails = new TripsDetails();
	
	@Test
	public void HomePageTitle() throws InterruptedException {	
		getDriver().get(homePage.homepageURL);
		// get element text
		System.out.println(homePage.getElementText(homePage.LogIn));
		// clickOnMehtod called
		homePage.clickOnElement(homePage.LogIn);
		signInPage.doLogin("brainstation23@yopmail.com","Pass@1234");
		Thread.sleep(3000);
		manuOptionPage.role();
		busses.setUpBusess();
		tripsDetails.setRoute();
		
		
		
		
	}

}
