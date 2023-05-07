package stepsforhooks;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepsForHooks {
	
	WebDriver driver = null;
	@Before(value ="@smoke",order=1)
	public void browserSetup1() throws InterruptedException
	{
		System.out.println("======I am Inside - browserSetup1======= ");
		System.setProperty("webdriver.chrome.driver", "src/test/resources/Drivers/chromedriver");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}
	@Before(order=2)
	public void browserSetup2()
	{
		System.out.println("======I am Inside - browserSetup2======= ");
	}
	
	@After(order=1)
	public void browserTeardown1()
	{
		System.out.println("======I am Inside - browserTearDown1======= ");
		
	}
	
	@After(order=2)
	public void browserTeardown2()
	{
		System.out.println("======I am Inside - browserTearDown2======= ");
		driver.close();
		driver.quit();
	}
	@BeforeStep
	public void beforeSteps()
	{
		System.out.println("======I am Inside - beforeSteps======= ");
	}
	@AfterStep
	public void afterSteps()
	{
		System.out.println("======I am Inside - afterSteps======= ");
	}
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
	   
	}

	@When("user is going to enter usn and pswd")
	public void user_is_going_to_enter_usn_and_pswd() {
	   
	}

	@And("user will make action on login button")
	public void user_will_make_action_on_login_button() {

	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
	   
	}

}
