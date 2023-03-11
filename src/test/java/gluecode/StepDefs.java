package gluecode;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.asserts.SoftAssert;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefs 
{
	public RemoteWebDriver driver;
	public FluentWait <RemoteWebDriver> wait;
	public Scenario s;
	public SoftAssert sa;
	
	@Before
	public void method(Scenario x)
	{
		s=x;
		sa=new SoftAssert();
	}
	
	@Given("open chrome browser")
	public void openbrowser() 
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		wait = new FluentWait<RemoteWebDriver>(driver);
		wait.pollingEvery(Duration.ofMillis(500));
		wait.withTimeout(Duration.ofSeconds(20));
		
	}

	@When("launch site {string}")
	public void launchsite(String url) 
	{
		driver.get(url);
	
	}

	@Then("title should be {string}")
	public void titleshouldbe(String ext) 
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("email")));
		String act=driver.getTitle();
		if(act.contains(ext))
		{
			s.log("Title test passsed");
			sa.assertTrue(true);
		}
		else
		{
			s.log("Title test failed");
			sa.assertTrue(false);

		}
	}

	@When("close site")
	public void closesite() 
	{
		driver.close();
	}
	
	@After
	public void lastmethod()
	{
		sa.assertAll();
	}
}
