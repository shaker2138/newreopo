package cucucmber;

public class Sepes {
	import cucumber.api.PendingException;
	import cucumber.api.java.en.Given;
	import cucumber.api.java.en.When;
	import cucumber.api.java.en.Then;
	import cucumber.api.java.en.And;
	import cucumber.api.junit.Cucumber;
	import org.junit.runner.RunWith;

	@RunWith(Cucumber.class)
	public class MyStepDefinitions {

	    @Given("^open browser$")
	    public void open_browser() throws Throwable {
	        throw new PendingException();
	    }

	    @When("^user type userId in Text box$")
	    public void user_type_userid_in_text_box() throws Throwable {
	        throw new PendingException();
	    }

	    @When("^user type (.+) in Text box$")
	    public void user_type_in_text_box(String userid, String strArg1) throws Throwable {
	        throw new PendingException();
	    }

	    @Then("^user should land his profile page$")
	    public void user_should_land_his_profile_page() throws Throwable {
	        throw new PendingException();
	    }

	    @Then("^user should not land his profile page$")
	    public void user_should_not_land_his_profile_page() throws Throwable {
	        throw new PendingException();
	    }

	    @And("^navigate to url$")
	    public void navigate_to_url() throws Throwable {
	        throw new PendingException();
	    }

	    @And("^user type password ind text box$")
	    public void user_type_password_ind_text_box() throws Throwable {
	        throw new PendingException();
	    }

	    @And("^uder click on login button$")
	    public void uder_click_on_login_button() throws Throwable {
	        throw new PendingException();
	    }

	    @And("^user type (.+) ind text box$")
	    public void user_type_ind_text_box(String password, String strArg1) throws Throwable {
	        throw new PendingException();
	    }


}
