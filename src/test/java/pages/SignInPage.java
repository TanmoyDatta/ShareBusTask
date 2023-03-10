package pages;

import org.openqa.selenium.By;

public class SignInPage extends BasePage{
	
	public String signinURL= "https://test.sharebus.co/auth/signin";
	
	public By email_input = By.xpath("//input[@id='email']");
	public By password_input = By.xpath("//input[@id='password']");
	public By signIn = By.xpath("//button[@type='submit']");
	
	
	public void doLogin(String email, String password) throws InterruptedException {
		writeTextOnElement(email_input,email);
		writeTextOnElement(password_input,password);
		clickOnElement(signIn);
		Thread.sleep(5000);
	}

}
