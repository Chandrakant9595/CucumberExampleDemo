package stepDefination;

import cucumber.api.java.en.Given;

public class TagingExampleDefination {

	@Given("^Validate the amazon home page$")
	public void validate_the_amazon_home_page() {
	   System.out.println("User on Home page");
	}

	@Given("^Validate the login functionality$")
	public void validate_the_login_functionality() {
		System.out.println("User successfully logged in");
	}

	@Given("^Validate the search functionality$")
	public void validate_the_search_functionality() {
		System.out.println("User able to search the product");
	}

	@Given("^Validate the add to cart functionality$")
	public void validate_the_add_to_cart_functionality() {
		System.out.println("User successfully add product in to the cart");
	}

	@Given("^Validate the checkout page is opened$")
	public void validate_the_checkout_page_is_opened() {
		System.out.println("User is on checkout page now");
	}

	@Given("^Validate the checkout functionality with CARD option$")
	public void validate_the_checkout_functionality_with_CARD_option() {
		System.out.println("Successfully checout with CARD option");
	}

	@Given("^Validate the checkout functionality with UPI option$")
	public void validate_the_checkout_functionality_with_UPI_option() {
		System.out.println("Successfully checout with UPI option");
	}

	@Given("^Validate the checkout functionality with COD option$")
	public void validate_the_checkout_functionality_with_COD_option() {
		System.out.println("Successfully checout with COD option");
	}

	@Given("^Validate the download recipt functioanlity$")
	public void validate_the_download_recipt_functioanlity() {
		System.out.println("Successfully download the recipt");
	}

	@Given("^Validate the logout functionality$")
	public void validate_the_logout_functionality() {
		System.out.println("User logout successfully");
	}
}
