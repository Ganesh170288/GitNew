package pagefactory;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class PageFactoryPF {
	
	WebDriver driver;
	
	@FindBy(id="name")
	@CacheLookup
	WebElement txt_username;
	
	@FindBy(id="password")
	@CacheLookup
	WebElement txt_password;
	
	@FindBy(id="login")
	@CacheLookup
	WebElement btn_login;
	
	@FindBy(partialLinkText = "ganesh")
	List<WebElement>mylinks;
	
	@FindBy(how=How.ID,using = "name")
	WebElement abc;
	
	public PageFactoryPF(WebDriver driver)
	{
		this.driver=driver;
		//PageFactory.initElements(driver, this);
		
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 30);
		PageFactory.initElements(factory, this);
	}
	
	
	public void enterusername(String username) {
	txt_username.sendKeys(username);
	}
	
	public void enterpassword(String password) {
		txt_password.sendKeys(password);
		}
	
	public void clicklogin() {
		btn_login.click();
		}
	
}
