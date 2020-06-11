package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBookStepDefination {
	
	WebDriver driver;
	
	@Given("^User On Facebook Page$")
	public void user_On_Facebook_Page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	}

	@When("^Verify Facebook Title And URL$")
	public void verify_Facebook_Title_And_URL() {
	    String title = driver.getTitle();
	    Assert.assertEquals("Facebook – log in or sign up", title);
	    
	    String url = driver.getCurrentUrl();
	    Assert.assertEquals("https://www.facebook.com/", url);
	}

	@Then("^Enter \"([^\"]*)\" And \"([^\"]*)\"$")
	public void enter_UserName_Password(String userName, String password) {
	   driver.findElement(By.cssSelector("input[name='email']")).sendKeys(userName);
	   driver.findElement(By.cssSelector("input[name='pass']")).sendKeys(password);
	}

	@Then("^Click On Login Button$")
	public void click_On_Login_Button() {
	    driver.findElement(By.cssSelector("input[value='Log In']")).click();
	}


	@Then("^Close The Browser$")
	public void close_The_Browser() {
	    driver.quit();
	}
}
