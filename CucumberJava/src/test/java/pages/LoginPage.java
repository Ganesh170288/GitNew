package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	protected WebDriver driver;
	
	private By txt_username = By.id("name");
	
	private By txt_password = By.id("password");
	
	private By btn_login = By.id("login");
	
	private By btn_logout = By.id("logout");
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		
		if(!driver.getTitle().equals("TestProject Demo"))
		{
			throw new IllegalStateException("This is not Login Page.The current page is: "+driver.getCurrentUrl());
		}
	}
	
	public void enterusername(String username)
	{
		driver.findElement(txt_username).sendKeys(username);
	}
	public void enterpassord(String password)
	{
		driver.findElement(txt_password).sendKeys(password);
	}
	
	public void clicklogin()
	{
		driver.findElement(btn_login).click();
	}
	
	public void checklogoutIsDisplayed()
	{
		driver.findElement(btn_logout).isDisplayed();
	}
	
	public void loginvaliduser(String username,String password)
	{
		driver.findElement(txt_username).sendKeys(username);
		driver.findElement(txt_password).sendKeys(password);
		driver.findElement(btn_login).click();
		driver.findElement(btn_logout).isDisplayed();
		
	}


}
