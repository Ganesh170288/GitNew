package stepDefinations;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class GoogleSearchStep {

	WebDriver driver = null;

	@Given("browser is open")
	public void browser_is_open() {
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


	@Given("user is on google search page")
	public void user_is_on_google_search_page() {
		System.out.println("Inside step- user is on google search page");
		driver.navigate().to("https://www.google.com/");
	}

	@When("user enters a text in search box")
	public void user_enters_a_text_in_search_box() {
		System.out.println("Inside step- user enters a text in search box");
		
		driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
	}

	@When("user enters search button")
	public void user_enters_search_button() {
		System.out.println("Inside step- user enters search button");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

	@Then("user is navigated to search results")
	public void user_is_navigated_to_search_results() {
		System.out.println("Inside step- user is navigated to search results");
		driver.getPageSource().contains("Online Courses");
	}


}
