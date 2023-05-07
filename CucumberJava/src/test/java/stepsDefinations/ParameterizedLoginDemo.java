package stepsDefinations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ParameterizedLoginDemo {
	WebDriver driver=null;
	@Given("user opens the browser")
	public void user_opens_the_browser() {
		
		System.out.println("Starting- browser is open");
System.getProperty("user.dir");
		
		String ProjectPath = "/Users/ganeshk/eclipse/Ganesh_Cucumber/CucumberJava/";

		System.setProperty("webdriver.chrome.driver", ProjectPath+"src/test/resources/Drivers/chromedriver");
		System.out.println("Project path is: "+ProjectPath);
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		System.out.println("Ending- browser is open");
	}

	@And("user will enter url")
	public void user_will_enter_url() {
		
		driver.navigate().to("https://example.testproject.io/web/");
		System.out.println("Ending url");
		
	    
	}
	
	@When("^user enters (.*) and (.*)$")
	public void user_enters_ganesh_and(String username,String password) throws InterruptedException {
		
	driver.findElement(By.id("name")).sendKeys(username);
	driver.findElement(By.id("password")).sendKeys(password);
	System.out.println("Ending entering credentials");
		Thread.sleep(3000);
	   
	}

	@And("user clicks on login button")
	public void user_clicks_on_login_button() {
		driver.findElement(By.id("login")).click();
	System.out.println("Ending clicking-on-button");    
	    
	}

	@Then("page is navigated to home page")
	public void page_is_navigated_to_home_page() throws InterruptedException {
		driver.getPageSource().contains("logout");
	System.out.println("Ending containing logout1");
		driver.findElement(By.id("logout")).isDisplayed();
		System.out.println("Ending containing logout2");
	Thread.sleep(3000);
		driver.close();
		driver.quit();
	    
	}

}
