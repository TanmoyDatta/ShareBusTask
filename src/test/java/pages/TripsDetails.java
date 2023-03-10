package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import static utilities.DriverSetUp.getDriver;
import org.openqa.selenium.interactions.Actions;

public class TripsDetails extends BasePage{
	
	public By Trip_From = By.xpath("//input[@id='startPoint']");
	public By Trip_To = By.xpath("//input[@id='destination']");
	public By Departure_Date = By.xpath("//input[@placeholder='Departure Date']");
  //  public By D_Time = By.xpath("//span[normalize-space()='16']");
    public By Return_Date = By.xpath("//input[@placeholder='Return Date']");
    public By R_Time = By.xpath("//span[@class='p-calendar p-component p-inputwrapper p-calendar-timeonly p-inputwrapper-filled']//input[@placeholder='Time']");
    
    public By Con_BTN = By.xpath("//span[normalize-space()='Continue']");
    
    
    public void setRoute() throws InterruptedException {
    	WebElement From = getElement(Trip_From);
    	From.sendKeys("Oslo");
    	Thread.sleep(4000);
    	Actions actions = new Actions(getDriver());
    	actions.sendKeys(From, Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
    	Thread.sleep(5000);
    	
    	WebElement To = getElement(Trip_To);
    	To.sendKeys("Kolbotn");
    	Thread.sleep(4000);
    	actions.sendKeys(To,Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
    	Thread.sleep(5000);
    	
//    	WebElement date = getElement(Departure_Date);
//    	Actions Dept = new Actions(getDriver());
//    	Dept.scrollToElement(date).build().perform();
//    	Thread.sleep(2000);
//      	date.click();
//      	date.sendKeys("Tuesday, 16.03.2023");
//    	date.click();
    	
//    	WebElement time = getElement(D_Time);
//    	JavascriptExecutor js2 = (JavascriptExecutor)getDriver();
//		js2.executeScript("arguments[0].scrollIntoView();", time);
//		Thread.sleep(2000);
//    	time.sendKeys("03:00");
    	
    	
//    	WebElement date1 = getElement(Return_Date);
//    	JavascriptExecutor js3 = (JavascriptExecutor)getDriver();
//		js3.executeScript("arguments[0].scrollIntoView();", date1);
//		Thread.sleep(2000);
//    	date1.sendKeys("Tuesday, 16.03.2023");
    	
//    	WebElement time2 = getElement(R_Time);
//    	JavascriptExecutor js4 = (JavascriptExecutor)getDriver();
//		js4.executeScript("arguments[0].scrollIntoView();", time2);
//		Thread.sleep(2000);
//    	time2.sendKeys("04:00");
    	
    	clickOnElement(Departure_Date);
    	clickOnElement(Return_Date);
    	//clickOnElement(R_Date);
       	Thread.sleep(2000);
		
//    	WebElement BTN = getElement(Con_BTN);
//    	JavascriptExecutor js5 = (JavascriptExecutor)getDriver();
//		js5.executeScript("arguments[0].scrollIntoView();" ,BTN);
//		Thread.sleep(5000);
//		BTN.click();
	}
} 
