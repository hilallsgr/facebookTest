package step_defination;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.Facebook;
import pages.Locator;
import utilities.Config;
import utilities.Driver;

public class FacebookDef {
	Facebook locator=new Facebook();
	

	@Given("^user on signin page$")
	public void user_on_signin_page() throws Throwable {
	    Driver.getDriver().get(Config.getProperties("url"));
	}

	@When("^user click create new account button$")
	public void user_click_create_new_account_button() throws Throwable {
	    locator.NewAccount.click();
	   
	}

	@Then("^user able to see sign up title$")
	public void user_able_to_see_sign_up_title() throws Throwable {
	    Assert.assertTrue(locator.Title.isDisplayed());
	   
	}

	@Then("^user able to see sign up subtitle$")
	public void user_able_to_see_sign_up_subtitle() throws Throwable {
	  Assert.assertTrue(locator.lastTitle.isDisplayed());
	
	}

	@Then("^user able to see firstname label$")
	public void user_able_to_see_firstname_label() throws Throwable {
	    Assert.assertTrue(locator.name.isDisplayed());
	    
	}

	@Then("^user able to see lastname label$")
	public void user_able_to_see_lastname_label() throws Throwable {
	   Assert.assertTrue(locator.lastname.isDisplayed());
	  
	}

	@Then("^user able to see mobile number or email label$")
	public void user_able_to_see_mobile_number_or_email_label() throws Throwable {
	   Assert.assertTrue(locator.ePosta.isDisplayed());
	 
	}

	@Then("^user able to see new password label$")
	public void user_able_to_see_new_password_label() throws Throwable {
	    Assert.assertTrue(locator.newPassword.isDisplayed());
	   
	}

	@Then("^user able to see birthday header$")
	public void user_able_to_see_birthday_header() throws Throwable {
	    Assert.assertTrue(locator.birthday.isDisplayed());
	    
	}

	@Then("^user able to see gender header$")
	public void user_able_to_see_gender_header() throws Throwable {
	    Assert.assertTrue(locator.gender.isDisplayed());
	    
	}

	@Then("^user able to see sign up button text$")
	public void user_able_to_see_sign_up_button_text() throws Throwable {
	   Assert.assertTrue(locator.buttonTitle.isDisplayed());
	  
	}
}
