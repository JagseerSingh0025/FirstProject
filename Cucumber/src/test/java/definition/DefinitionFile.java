package definition;

import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

public class DefinitionFile {
	String user;
	String pswd;
	String validateuser;
	String validatepassword;

	@Given("^username (.+) and password (.+)$")
	public void username_and_Password(String user, String pswd) {
		this.user = user;
		this.pswd = pswd;
		System.out.println("given username is: "+user);
		System.out.println("given password is:"+pswd);
	}

	@When("^I log into page$")
	public void i_log_into_page() {
		System.out.println("Logged to page and checking credentials");
	}

	@Then("^Results should be (.+) and (.+)$")
	public void results_should_be_and(String validateuser, String validatepassword) {
		this.validateuser = validateuser;
		this.validatepassword = validatepassword;
		System.out.println("Results are " + user + " " + pswd);
	}

	@And("^Validate both matches or not$")
	public void validate() {
	
				Assert.assertEquals(user, validateuser);
				System.out.println("usernames are matched");
				Assert.assertEquals(validatepassword, pswd);
				System.out.println("passwords are matched");
				System.out.println("___________________________________________");
				System.out.println("___________________________________________");
				
			}
		}
