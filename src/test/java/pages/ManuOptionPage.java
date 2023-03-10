package pages;

import org.openqa.selenium.By;

public class ManuOptionPage extends BasePage{
	
	public By Dropdown = By.xpath("//div[@class='text-start']");
	public By SelectSharelead = By.xpath("//li[@aria-label='sharelead']");
	public By ConBtn = By.xpath("//span[normalize-space()='Continue']");
	
	public void role() throws InterruptedException {
		clickOnElement(Dropdown);
		clickOnElement(SelectSharelead);
		clickOnElement(ConBtn);
		Thread.sleep(2000);
		
	}
}
