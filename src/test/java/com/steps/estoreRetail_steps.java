package com.steps;

import org.openqa.selenium.WebDriver;

import com.base.Base;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class estoreRetail_steps {
	public static WebDriver driver;
	public Base base;
	public estoreRetail_steps (Base base){
		this.base = base;
		this.driver=base.getDriver();
			}
	@Given("^user  entered the URL on web browser \"([^\"]*)\"$")
	public void user_entered_the_URL_on_web_browser(String url) throws Throwable {
	    driver.get(url);
	  
	}

	@When("^user can be view the Home page \"([^\"]*)\"$")
	public void user_can_be_view_the_Home_page(String url) throws Throwable {
	   
	    
	}

	@Then("^user should be able to see QNET logo and image on the home page$")
	public void user_should_be_able_to_see_QNET_logo_and_image_on_the_home_page() throws Throwable {
	   
	    
	}

	@Then("^user should be able to see Search option top of the page$")
	public void user_should_be_able_to_see_Search_option_top_of_the_page() throws Throwable {
	   
	    
	}

	@Then("^user should be able to see language drop down top of the page$")
	public void user_should_be_able_to_see_language_drop_down_top_of_the_page() throws Throwable {
	   
	    
	}

	@Then("^user should be able to see IR login, Shop and Enroll links top corner of the page$")
	public void user_should_be_able_to_see_IR_login_Shop_and_Enroll_links_top_corner_of_the_page() throws Throwable {
	   
	    
	}

	@Then("^user should be able to see corresponding footer bottom of the page$")
	public void user_should_be_able_to_see_corresponding_footer_bottom_of_the_page() throws Throwable {
	   
	    
	}
	@Given("^user click on the Shop button$")
	public void user_click_on_the_Shop_button() throws Throwable {
	    
	}

	@When("^user should be able to see pop up message to continue to shop \"([^\"]*)\"$")
	public void user_should_be_able_to_see_pop_up_message_to_continue_to_shop(String popupurl) throws Throwable {
	    
	}

	@When("^user click on the continue to shop link$")
	public void user_click_on_the_continue_to_shop_link() throws Throwable {
	
	}

	@Then("^user should be direct to the verify referrer detail page \"([^\"]*)\"$")
	public void user_should_be_direct_to_the_verify_referrer_detail_page(String pageurl) throws Throwable {
	   
	}

	@Given("^user should be able to see purchasing path of e store top corner of the page$")
	public void user_should_be_able_to_see_purchasing_path_of_e_store_top_corner_of_the_page() throws Throwable {
	   
	}

	@When("^user already in verify referrer page$")
	public void user_already_in_verify_referrer_page() throws Throwable {
	  
	}

	@Then("^user should be able to see Verify referrer radio button is selected by default loading the page \"([^\"]*)\"$")
	public void user_should_be_able_to_see_Verify_referrer_radio_button_is_selected_by_default_loading_the_page(String imgsrc) throws Throwable {
	   
	}

	@Given("^user can see default page loading with the English on language drop down$")
	public void user_can_see_default_page_loading_with_the_English_on_language_drop_down() throws Throwable {
	   
	}

	@When("^user can be change the language \"([^\"]*)\"$")
	public void user_can_be_change_the_language(String droplang) throws Throwable {
	   
	}

	@Then("^user can be view page content  with corresponding language \"([^\"]*)\"$")
	public void user_can_be_view_page_content_with_corresponding_language(String lang) throws Throwable {
	    
	}

}
