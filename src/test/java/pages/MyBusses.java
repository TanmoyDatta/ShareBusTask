package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import static utilities.DriverSetUp.getDriver;
//import utilities.DriverSetUp;

public class MyBusses extends BasePage{
	public By ShareBus_BTN = By.xpath("//span[contains(text(),'Set up a Sharebus')]");

	
	public void setUpBusess() throws InterruptedException {
		
		WebElement scroll = getElement(ShareBus_BTN);
		JavascriptExecutor js = (JavascriptExecutor)getDriver();
		js.executeScript("arguments[0].scrollIntoView();" ,scroll);
		Thread.sleep(5000);
		scroll.click();
		
	}
}
