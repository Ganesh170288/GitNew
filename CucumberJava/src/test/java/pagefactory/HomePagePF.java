package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePagePF {
	
	WebDriver driver=null;
	
	@FindBy(id="logout")
	@CacheLookup
	WebElement txt_logout;
	
	
	public HomePagePF(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void checklogoutisDisplayed()
	{
		txt_logout.isDisplayed();
	}
public void clicklogout()
	{
		txt_logout.click();
	}

}
