package stepdefinitions;

import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MainSteps {

	@Given("User is on NetBanking landing page")
	public void user_is_on_net_banking_landing_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user landed on netbanking  Page");

	}
	@Given("User is on register page")
	public void user_is_on_register_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User landed  on register page");
	}
	
	@Given("User is on landing  page")
	public void user_is_on_landing_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User landed  on  page");
	}
	/*
	 * @When("User login into application with {string} and password {string}")
	 * public void user_login_into_application_with_and_password(String string,
	 * String string2) { // Write code here that turns the phrase above into
	 * concrete actions System.out.println("user logged into application"
	 * +"admin is "+string+"Password   "+string2);
	 */
	 
	
	  @When("^User login into application with (.+) and password (.+)$") public
	  void user_login_into_application_with_and_password(String string, String  string2) { 
		  System.out.println("user logged into application"  +"admin is "+string+"Password   "+string2);
	 
	}
	  
	  @When("^user searched with Shortname (.+) and extracted actual name of product$")
	  public void user_searched_with_shortname_Name_and_extracted_actual_name_of_product(String Name) {
	      // Write code here that turns the phrase above into concrete actions
	      System.out.println("Passed " + Name);
	  }
	  
	  @When("added {string} items of the selected products to cart")
	  public void added_items_of_the_selected_products_to_cart(String string) {
	      // Write code here that turns the phrase above into concrete actions
		  System.out.println("Passed "+ string);
	  }
	  
	  @When("User signup application")
	  public void user_signup_application(List <String> data) {
		  System.out.println(data.get(0));
		  System.out.println(data.get(1));
		  System.out.println(data.get(2));
		  System.out.println(data.get(3));
		  
	  }
	@Then("Home page is displayed")
	public void home_page_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("home page is displayed");
	}
	@Then("Cards are displayed")
	public void cards_are_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	  System.out.println("Cards are displayed");
	}
	
	@Then("user proceeds to Checkout and validate the {string} items in checkout page")
	public void user_proceeds_to_checkout_and_validate_the_habib_items_in_checkout_page(String string1) {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println(string1);
	}
	
	  @Then("verify user has ability to enter promo code and place the order")
	  public void	  verify_user_has_ability_to_enter_promo_code_and_place_the_order() {  System.out.println("Method passed"); }
	 
	
	
}
