package stepDefination;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DegitalBankDefinationTwo {

	WebDriver driver;
	
	@Given("^open  digital bank site$")
	public void open_digital_bank_site() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://dbankdemo.com/login");
	}

	@When("^verift site title and URL$")
	public void verift_site_title_and_URL() {
		String url = driver.getCurrentUrl();
		Assert.assertEquals("http://dbankdemo.com/login", url);
	}

	@Then("^enter username and password$")
	public void enter_username_and_password(DataTable loginDetailData) {
	    for(Map<String, String> ldd : loginDetailData.asMaps(String.class, String.class)) {
	    	driver.findElement(By.cssSelector("input[name='username']")).sendKeys(ldd.get("username"));
			driver.findElement(By.cssSelector("input[name='password']")).sendKeys(ldd.get("password"));
	    }
	}

	@Then("^click on sign in button$")
	public void click_on_sign_in_button() {
		driver.findElement(By.cssSelector("button[id='submit']")).click();
	}

	@Then("^verify home page url$")
	public void verify_home_page_url() {
		String url = driver.getCurrentUrl();
	    Assert.assertEquals("http://dbankdemo.com/home", url);
	}

	@Then("^click on checking dropdown$")
	public void click_on_checking_dropdown() {
		driver.findElement(By.cssSelector("i[class='menu-icon fa fa-pencil-square-o']")).click();
	}

	@Then("^click on new checking option$")
	public void click_on_new_checking_option() {
		driver.findElement(By.xpath("//a[text()='New Checking']")).click();
	}

	@Then("^create checking account$")
	public void create_checking_account(DataTable accountData) {
		driver.findElement(By.cssSelector("input[id='Standard Checking']")).click();
	    driver.findElement(By.cssSelector("input[id='Individual']")).click();
	    
	    for(Map<String, String> ad : accountData.asMaps(String.class, String.class)) {
	    	driver.findElement(By.cssSelector("input[id='name']")).sendKeys(ad.get("account name"));
		    driver.findElement(By.cssSelector("input[id='openingBalance']")).sendKeys(ad.get("deposite amount"));
		    driver.findElement(By.cssSelector("button[class='btn btn-primary btn-sm']")).click();
		    
		    driver.findElement(By.cssSelector("i[class='menu-icon fa fa-pencil-square-o']")).click();
		    driver.findElement(By.xpath("//a[text()='New Checking']")).click();
	    }
	}

	@Then("^close the browser$")
	public void close_the_browser() {
	    driver.quit();
	}
}
