package com.steps;

import org.openqa.selenium.WebDriver;

import com.base.Base;
import com.pageObjects.HomePgObject;
import com.pageObjects.ReferrerdetailPgObject;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import utils.TabCatcher;

public class estoreRetail_steps {
	public static WebDriver driver;
	public Base base;
	public HomePgObject homePgObject;
	ReferrerdetailPgObject referrerdetailPgObject;
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
	   
	    Assert.assertEquals("Home Page validation", url,driver.getCurrentUrl());
	}

	@Then("^user should be able to see QNET logo and image on the home page$")
	public void user_should_be_able_to_see_QNET_logo_and_image_on_the_home_page() throws Throwable {
	   homePgObject=new HomePgObject();
	   Assert.assertEquals("QNet Logo validation", "true",homePgObject.checkQNET_Logo());
	}

	@Then("^user should be able to see Search option top of the page$")
	public void user_should_be_able_to_see_Search_option_top_of_the_page() throws Throwable {
		 Assert.assertEquals("Search validation", "true",homePgObject.check_search());
	    
	}

	@Then("^user should be able to see language drop down top of the page$")
	public void user_should_be_able_to_see_language_drop_down_top_of_the_page() throws Throwable {
		 Assert.assertEquals("Language Dropdown validation", "true",homePgObject.check_LanguageDrpdwn());
	    
	}

	@Then("^user should be able to see IR login, Shop and Enroll links top corner of the page$")
	public void user_should_be_able_to_see_IR_login_Shop_and_Enroll_links_top_corner_of_the_page() throws Throwable {
		Assert.assertEquals("IR login validation", "true",homePgObject.check_IRLogin());
		Assert.assertEquals("Shop Link validation", "true",homePgObject.check_Shopbtn());
		Assert.assertEquals("Enroll Link validation", "true",homePgObject.check_Enrolbtn());
	    
	    
	}

	@Then("^user should be able to see corresponding footer bottom of the page$")
	public void user_should_be_able_to_see_corresponding_footer_bottom_of_the_page() throws Throwable {
	   
		Assert.assertEquals("Footer Validation", "Site Map | Privacy Policy | Disclaimer | Terms of Use | Social Media Policy | Code of Ethics | Earning and Income | Contact usCopyright © 2016 QNet Ltd. All rights reserved",homePgObject.getFooter());
	}
	@When("^user should be able to see pop up message with Exit link$")
	public void user_should_be_able_to_see_pop_up_message_with_Exit_link() throws Throwable {
	  
	}

	@When("^user click on the Exit  link$")
	public void user_click_on_the_Exit_link() throws Throwable {
		homePgObject.click_Exitbtn();
	}

	@Then("^user should be direct to the home page again \"([^\"]*)\"$")
	public void user_should_be_direct_to_the_home_page_again(String url) throws Throwable {
	    Assert.assertEquals("Home Page Validation", url,driver.getCurrentUrl());
	    Thread.sleep(5000);
	}

	@Given("^user click on the Shop button$")
	public void user_click_on_the_Shop_button() throws Throwable {
		homePgObject=new HomePgObject();
		homePgObject.clickShopbtn();
	}

	@When("^user should be able to see pop up message to continue to shop \"([^\"]*)\"$")
	public void user_should_be_able_to_see_pop_up_message_to_continue_to_shop(String popupurl) throws Throwable {
	    Assert.assertEquals("PopUp Window validation", popupurl,driver.getCurrentUrl());
	}

	@When("^user click on the continue to shop link$")
	public void user_click_on_the_continue_to_shop_link() throws Throwable {
		homePgObject.clcik_countinueShopbtn();
		Thread.sleep(10000);
	}

	@Then("^user should be direct to the verify referrer detail page \"([^\"]*)\"$")
	public void user_should_be_direct_to_the_verify_referrer_detail_page(String pageurl) throws Throwable {
	new TabCatcher().setBaseTab();
	   Assert.assertEquals("Verify Referrer Page", pageurl,driver.getCurrentUrl());
	}

	@Given("^user should be able to see purchasing path of e store top corner of the page$")
	public void user_should_be_able_to_see_purchasing_path_of_e_store_top_corner_of_the_page() throws Throwable {
		referrerdetailPgObject=new ReferrerdetailPgObject();
		Assert.assertEquals("Referrer Path Validation", "true",referrerdetailPgObject.checkpurchasingPathimg());
	}

	@When("^user already in verify referrer page$")
	public void user_already_in_verify_referrer_page() throws Throwable {
	  
	}

	@Then("^user should be able to see Verify referrer radio button is selected by default loading the page \"([^\"]*)\"$")
	public void user_should_be_able_to_see_Verify_referrer_radio_button_is_selected_by_default_loading_the_page(String imgsrc) throws Throwable {
	   Assert.assertEquals(imgsrc, referrerdetailPgObject.getReferrerRadiobtn());
	}

	@Then("^user can see default page loading with the English on language drop down$")
	public void user_can_see_default_page_loading_with_the_English_on_language_drop_down() throws Throwable {
		Assert.assertEquals("Default Language Validation", "EN - English",referrerdetailPgObject.getLanguage());
	}

	@Given("^user can be change the language \"([^\"]*)\"$")
	public void user_can_be_change_the_language(String droplang) throws Throwable {
	   referrerdetailPgObject=new ReferrerdetailPgObject();
	   referrerdetailPgObject.setLanguage(droplang);
		Thread.sleep(5000);
	}

	@When("^user can be view page content  with corresponding language \"([^\"]*)\"$")
	public void user_can_be_view_page_content_with_corresponding_language(String lang) throws Throwable {
		 Assert.assertEquals("Language Validation", lang,referrerdetailPgObject.getTextLanguage());
	}

}
