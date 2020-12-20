package cucucmber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SmokeTest {
  WebDriver driver;
	@Given("^open browser$")
	public void open_browser() throws Throwable {
	    driver=new ChromeDriver();
		 System.setProperty("Webdriver.driver.chrome", "C:\\Users\\shake\\Downloads\\chromedriver_win32.\\-   ChromeDriver.exe");
	}

	@Given("^navigate to url$")
	public void navigate_to_url() throws Throwable {
	    driver.get("https://www.facebook.com/");
		
	}

	@When("^user type userId in Text box$")
	public void user_type_userId_in_Text_box() throws Throwable {
	    driver.findElement(By.id("email")).sendKeys("user id");
	}

	@When("^user type password ind text box$")
	public void user_type_password_ind_text_box() throws Throwable {
	    driver.findElement(By.id("password")).sendKeys("Shaikat");
	}

	@When("^uder click on login button$")
	public void uder_click_on_login_button() throws Throwable {
	    driver.findElement(By.xpath("click")).click();
	}

	@Then("^user should land his profile page$")
	public void user_should_land_his_profile_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^user should not land his profile page$")
	public void user_should_not_land_his_profile_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}


}
