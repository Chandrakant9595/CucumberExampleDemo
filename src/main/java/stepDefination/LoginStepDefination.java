//chandu

package stepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginStepDefination {

	WebDriver driver;
	
	
	@Given("^user on login page$")
	public void user_on_login_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://tutorialsninja.com/demo/index.php?route=common/home");
	}
	
	@When("^title verify$")
	public void title_verify() {
		String title = driver.getTitle();
		Assert.assertEquals(title, "Your Store");
	}
	
	@Then("^click on MyAccount dropdown$")
	public void click_on_MyAccount_dropdown() {
		WebElement myAccount = driver.findElement(By.xpath("//span[text()='My Account']"));
		myAccount.click();
	}
	
	@Then("^click on login link$")
	public void click_on_login_link() {
		WebElement loginLink = driver.findElement(By.xpath("//a[text()='Login']"));
		loginLink.click();
	}
	
	@Then("^enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enter_and(String uName, String pas) throws Throwable {
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(uName);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pas);
	}
	
	@Then("^click on login button$")
	public void click_on_login_button() {
		driver.findElement(By.xpath("//input[@value='Login']")).click();
	}
}
	