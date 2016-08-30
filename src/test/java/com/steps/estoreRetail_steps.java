package com.steps;

import org.hamcrest.core.IsEqual;
import org.hamcrest.core.IsNot;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.base.Base;
import com.pageObjects.CheckOutPgObject;
import com.pageObjects.EcardPgObject;
import com.pageObjects.HomePgObject;
import com.pageObjects.PaymentPgobject;
import com.pageObjects.ProductPgObject;
import com.pageObjects.ReferrerdetailPgObject;
import com.pageObjects.RegPageFiller;
import com.pageObjects.RegistrationPgObject;
import com.pageObjects.ShoppingcartPgObject;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import utils.TabCatcher;

public class estoreRetail_steps {
	public static WebDriver driver;
	public Base base;
	public HomePgObject homePgObject;
	ReferrerdetailPgObject referrerdetailPgObject;
	ProductPgObject productPgObject;
	ShoppingcartPgObject shoppingcartPgObject;
	RegistrationPgObject registrationPgObject;
	CheckOutPgObject checkOutPgObject;
	RegPageFiller regPageFiller;
	PaymentPgobject paymentPgobject;
	EcardPgObject ecardPgObject;
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
	    Thread.sleep(10000);
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
		Thread.sleep(10000);
	}

	@When("^user can be view page content  with corresponding language \"([^\"]*)\"$")
	public void user_can_be_view_page_content_with_corresponding_language(String lang) throws Throwable {
		 Assert.assertEquals("Language Validation", lang,referrerdetailPgObject.getTextLanguage());
	}
	@Given("^user can see no any country selected on the drop down when default loading page\\.$")
	public void user_can_see_no_any_country_selected_on_the_drop_down_when_default_loading_page() throws Throwable {
		referrerdetailPgObject=new ReferrerdetailPgObject();
		Assert.assertEquals("Default country validation", "Select Country",referrerdetailPgObject.getDefaultCountry());
	}
	@Given("^user click on the link$")
	public void user_click_on_the_link() throws Throwable {
		referrerdetailPgObject=new ReferrerdetailPgObject();
		referrerdetailPgObject.clickLink();
	}

	@When("^should be displayed notification error message$")
	public void should_be_displayed_notification_error_message() throws Throwable {
	    Assert.assertEquals("Error Msg Validation", "Please select your country of residence.", referrerdetailPgObject.getErrorMsg());
	}
	@Given("^user should be able to select any country in WP through the country drop down list \"([^\"]*)\"$")
	public void user_should_be_able_to_select_any_country_in_WP_through_the_country_drop_down_list(String country) throws Throwable {
		referrerdetailPgObject=new ReferrerdetailPgObject();
		referrerdetailPgObject.setCountry(country);
		Thread.sleep(10000);
	}
	@Given("^user select the available country through country drop down list\\. \"([^\"]*)\"$")
	public void user_select_the_available_country_through_country_drop_down_list(String country) throws Throwable {
		referrerdetailPgObject=new ReferrerdetailPgObject();
		referrerdetailPgObject.setCountry(country);
		Thread.sleep(8000);
	}

	@When("^user should not allow to click on Shop Now button\\.$")
	public void user_should_not_allow_to_click_on_Shop_Now_button() throws Throwable {
		 Assert.assertEquals("ShopNow button Validation", "false",referrerdetailPgObject.checkShopNowbtn());
	}
	@When("^user should be able to click on Check referrer button$")
	public void user_should_be_able_to_click_on_Check_referrer_button() throws Throwable {
		referrerdetailPgObject.clickCheckReferrer();
	}
	@Then("^user should not direct any page form the existing page \"([^\"]*)\"$")
	public void user_should_not_direct_any_page_form_the_existing_page(String url) throws Throwable {
	   Assert.assertEquals(url, driver.getCurrentUrl());
	}
	
	@Given("^user can not see any local plan countries in country drop down \"([^\"]*)\"$")
	public void user_can_not_see_any_local_plan_countries_in_country_drop_down(String localcountry) throws Throwable {
		referrerdetailPgObject=new ReferrerdetailPgObject();
		String [] cou=referrerdetailPgObject.getCountry();
		int i=0;
		System.out.println("yyyyy"+cou.length);
		while(i<cou.length){
			Assert.assertThat(localcountry, IsNot.not(IsEqual.equalTo(cou[i])));
			i++;
		}
		System.out.println("Count "+ i);
	}
	@Given("^user click on the available link which regarding entered product page$")
	public void user_click_on_the_available_link_which_regarding_entered_product_page() throws Throwable {
		referrerdetailPgObject=new ReferrerdetailPgObject();
		referrerdetailPgObject.clickLink();
	}
	@When("^should be direct to the product page on same window \"([^\"]*)\"$")
	public void should_be_direct_to_the_product_page_on_same_window(String url) throws Throwable {
	   Assert.assertEquals("Product Page Validation", url, driver.getCurrentUrl());
	    
	   
	}
	@Given("^user directs to the products page$")
	public void user_directs_to_the_products_page() throws Throwable {
		 productPgObject=new ProductPgObject();
	}
	
	@When("^user select the preferred language from dropdown \"([^\"]*)\"$")
	public void user_select_the_preferred_language_from_dropdown(String language) throws Throwable {
		productPgObject.setLanguage(language);
		Thread.sleep(10000);
	}

	@When("^products radio button is highlighted \"([^\"]*)\"$")
	public void products_radio_button_is_highlighted(String src) throws Throwable {
	    Assert.assertEquals("Product Radio Button Validation", src, productPgObject.getProductsRadiobtn());
	    
	}

	@Given("^user can filter the products via dropdown \"([^\"]*)\"$")
	public void user_can_filter_the_products_via_dropdown(String category) throws Throwable {
		productPgObject=new ProductPgObject();
		productPgObject.setProduct(category);
	    Thread.sleep(10000);
	}

	@Given("^default selected category is Health and wellness$")
	public void default_selected_category_is_Health_and_wellness() throws Throwable {
		productPgObject=new ProductPgObject();
	    Assert.assertEquals("Default Category Validation", "underline",productPgObject.getCSS());
	    
	}

	@When("^add to cart buttons available$")
	public void add_to_cart_buttons_available() throws Throwable {
	   Assert.assertEquals("Add to Cart Button Validation", "true", productPgObject.getAddtoCartStatus());
	}

	@Given("^user select the search option  \"([^\"]*)\"$")
	public void user_select_the_search_option(String option) throws Throwable {
		productPgObject=new ProductPgObject();
		productPgObject.setProduct(option);
	    
	}

	@When("^user enter a negative key word \"([^\"]*)\"$")
	public void user_enter_a_negative_key_word(String product) throws Throwable {
		productPgObject.enterSearch(product);
	    
	}

	@Then("^click on search button$")
	public void click_on_search_button() throws Throwable {
		productPgObject.clicksearch(); 
		 Thread.sleep(10000);
	}
	@Then("^Validate error message \"([^\"]*)\"$")
	public void validate_error_message(String msg) throws Throwable {
	   Assert.assertEquals("Error message validation", msg, productPgObject.getErrorMsg());
	   Thread.sleep(10000);
	}


	@Given("^user select the search option as  Product name/brand\"([^\"]*)\"$")
	public void user_select_the_search_option_as_Product_name_brand(String option) throws Throwable {
		productPgObject=new ProductPgObject();
		productPgObject.setProduct(option);
		
	    
	}

	@When("^user enter a key word \"([^\"]*)\"$")
	public void user_enter_a_key_word(String product) throws Throwable {
		productPgObject.enterSearch(product);
		
	    
	}
	@When("^click on searchbutton$")
	public void click_on_searchbutton() throws Throwable {
		productPgObject.clicksearch();
		Thread.sleep(10000);
	}
	

	@Then("^verify on product name \"([^\"]*)\"$")
	public void verify_on_product_name(String name) throws Throwable {
	    Assert.assertEquals("Product Name Validation", name, productPgObject.getName(name));
	    
	}

	@Then("^verify on image \"([^\"]*)\"$")
	public void verify_on_image(String image) throws Throwable {
		// Assert.assertEquals("Product Name Image", name, productPgObject.getName(name));
	    
	}

	@Then("^verify on Retail price \"([^\"]*)\"$")
	public void verify_on_Retail_price(String price) throws Throwable {
		 Assert.assertEquals("Product Price Validation", price, productPgObject.getPrice(price));
	    
	}

	@Then("^verify on S&H fee \"([^\"]*)\"$")
	public void verify_on_S_H_fee(String sh) throws Throwable {
		 Assert.assertEquals("Product SH Validation", sh, productPgObject.getSH(sh));
	    
	}

	@Then("^verify on Avalability \"([^\"]*)\"$")
	public void verify_on_Avalability(String availability) throws Throwable {
		 Assert.assertEquals("Product Availability Validation", availability, productPgObject.getAvalability());
	}

	@Then("^user select preferred products$")
	public void user_select_preferred_products() throws Throwable {
		if(productPgObject.getAvalability().equals("true"))
			productPgObject.clickCheckBox();
			else{
				System.out.println(" Not available");
			}
	}
	@Given("^user can click on add to cart button$")
	public void user_can_click_on_add_to_cart_button() throws Throwable {
		productPgObject=new ProductPgObject();
		productPgObject.addcart_btn();
		Thread.sleep(10000);
	}

	@Given("^user clicks on delete product button \"([^\"]*)\"$")
	public void user_clicks_on_delete_product_button(String item) throws Throwable {
		shoppingcartPgObject= new ShoppingcartPgObject();
		shoppingcartPgObject.deleteItem(Integer.parseInt(item));
		Thread.sleep(8000);
	}

@When("^user clicks on empty cart button$")
public void user_clicks_on_empty_cart_button() throws Throwable {
	shoppingcartPgObject.clickEmpty();
    
}

@Then("^directs to the  products page$")
public void directs_to_the_products_page() throws Throwable {
    
    Assert.assertEquals("Product Page validation", "https://portal.qnet.net/eStore4/products.aspx?Category=5011000", driver.getCurrentUrl());
}

@Given("^User click on Add products button$")
public void user_click_on_Add_products_button() throws Throwable {
	shoppingcartPgObject= new ShoppingcartPgObject();
	shoppingcartPgObject.clickAdd();
}


@Given("^user directs to the Shopping cart page$")
public void user_directs_to_the_Shopping_cart_page() throws Throwable {
	shoppingcartPgObject= new ShoppingcartPgObject();
	Assert.assertEquals("Shoppingcart Page validation", "https://portal.qnet.net/eStore4/shoppingcart.aspx#no-back-button", driver.getCurrentUrl());

    
}

@When("^shopping cart radio button is highlighted \"([^\"]*)\"$")
public void shopping_cart_radio_button_is_highlighted(String src) throws Throwable {
	Assert.assertEquals("Shopping card radio btn validation", src,shoppingcartPgObject.getShoppingCartRadiobtn());
}



@When("^enter the qty for each product \"([^\"]*)\" , \"([^\"]*)\"$")
public void enter_the_qty_for_each_product(String item, String qty) throws Throwable {
	shoppingcartPgObject.selectQTY(Integer.parseInt(item), qty);
    Thread.sleep(10000);
}

@Then("^verify Price change \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\"$")
public void verify_Price_change(String item, String price, String qty) throws Throwable {
	Assert.assertEquals("Validate Price", qty+" x "+price+".00",shoppingcartPgObject.getPrice(Integer.parseInt(item)));
	
    
}
@Given("^user agree on T&Cs$")
public void user_agree_on_T_Cs() throws Throwable {
	shoppingcartPgObject= new ShoppingcartPgObject();   
	shoppingcartPgObject.acceptAgreement();
}

@When("^Click on T&C link$")
public void click_on_T_C_link() throws Throwable {
	/*shoppingcartPgObject.clickTandClink();
	Thread.sleep(10000);
	new TabCatcher().setBaseTabTnC();
	Assert.assertEquals("T&C Lick Popup validation", "https://portal.qnet.net/eStore4/pma.aspx?", driver.getCurrentUrl());
	new TabCatcher().closeTabTnC();*/
}

@When("^user select USD as currency$")
public void user_select_USD_as_currency() throws Throwable {
	shoppingcartPgObject.clickUSD();
}

@Then("^Click on Checkout botton$")
public void click_on_Checkout_botton() throws Throwable {
	shoppingcartPgObject.clickCheckOut();
}
@Given("^user should be able to see purchasing path of e store top corner of the page \"([^\"]*)\"$")
public void user_should_be_able_to_see_purchasing_path_of_e_store_top_corner_of_the_page(String src) throws Throwable {
	registrationPgObject=new RegistrationPgObject();
	Assert.assertEquals("Registration Radio Btn Validation", src, registrationPgObject.getRegRadiobtn());
}

@Given("^user fill all the mandatory fields \"([^\"]*)\"$")
public void user_fill_all_the_mandatory_fields(String type) throws Throwable {
	regPageFiller=new RegPageFiller();
	registrationPgObject=new RegistrationPgObject();
	regPageFiller.regPageForm(type, registrationPgObject, base);
	Thread.sleep(10000);
}

@When("^user should be checked check boxes$")
public void user_should_be_checked_check_boxes() throws Throwable {
	registrationPgObject.clickCheck1();
	registrationPgObject.clickCheck2();
	registrationPgObject.clickCheck3();
	
}

@Then("^enable confirm bottom$")
public void enable_confirm_bottom() throws Throwable {
	registrationPgObject.clickConfirm();
	Thread.sleep(10000);
}
@Given("^user directs to the checkout page \"([^\"]*)\"$")
public void user_directs_to_the_checkout_page(String url) throws Throwable {
    Assert.assertEquals("CheckOut page validation", url, driver.getCurrentUrl());
    checkOutPgObject=new CheckOutPgObject();
    
}

@When("^checkout radio button is highlighted$")
public void checkout_radio_button_is_highlighted() throws Throwable {
        
}

@When("^User verify the diliver details name$")
public void user_verify_the_diliver_details_name() throws Throwable {
    Assert.assertEquals("Name validation",checkOutPgObject.getContactname() ,base.propp.getProperty("validfname").toUpperCase()+" "+base.propp.getProperty("validlname").toUpperCase());
    
}

@When("^email$")
public void email() throws Throwable {
	  Assert.assertEquals("Email validation",checkOutPgObject.getEmail() ,base.propp.getProperty("validmail").toUpperCase() );
	    
    
}

@When("^address$")
public void address() throws Throwable {
	 Assert.assertEquals("Address validation",checkOutPgObject.getAddress() ,base.propp.getProperty("validaddress").toUpperCase() );
	    
    
}

@When("^city$")
public void city() throws Throwable {
	 Assert.assertEquals("City validation",checkOutPgObject.getCity() ,base.propp.getProperty("validtown").toUpperCase() ); 
}

@When("^zip$")
public void zip() throws Throwable {
	 Assert.assertEquals("Zip validation",checkOutPgObject.getZipCode() ,base.propp.getProperty("validpost") );     
    
}

@When("^counrty$")
public void counrty() throws Throwable {
	 Assert.assertEquals("Country validation",checkOutPgObject.getCountry() ,"Australia");       
}

@When("^phone$")
public void phone() throws Throwable {
	Assert.assertEquals("Phone validation",checkOutPgObject.getPhoneNo() ,base.propp.getProperty("validtel")); 
}

@Then("^user verify on countinue button$")
public void user_verify_on_countinue_button() throws Throwable {
    
    
}

@Then("^cancel button$")
public void cancel_button() throws Throwable {
    
    
}

@Given("^user verify the sub total$")
public void user_verify_the_sub_total() throws Throwable {
	 checkOutPgObject =new CheckOutPgObject();
    Assert.assertEquals("Verify Subtotal",checkOutPgObject.getSubTotal(2),checkOutPgObject.getTotal(2));
}

@When("^user select the dilivery option$")
public void user_select_the_dilivery_option() throws Throwable {
    
    
}

@Then("^user verify the total amount to pay$")
public void user_verify_the_total_amount_to_pay() throws Throwable {
	 Assert.assertEquals("Verify Total",checkOutPgObject.getTotalAmout(),Integer.toString(Integer.parseInt(checkOutPgObject.getSubTotal(2))+Integer.parseInt(checkOutPgObject.getShippingAmount())));    
    
}

@Then("^If user select Euro, veryfy the total euro amount$")
public void if_user_select_Euro_veryfy_the_total_euro_amount() throws Throwable {
    
    
}

@Then("^user click on countinue button$")
public void user_click_on_countinue_button() throws Throwable {
	checkOutPgObject.clickCountinue();
    
}
@Given("^user select the Ecard as payment gateway$")
public void user_select_the_Ecard_as_payment_gateway() throws Throwable {
	paymentPgobject=new PaymentPgobject();
	paymentPgobject.clickEcard();
    
}

@When("^User enter invalid ecard No/ PIN No \"([^\"]*)\" , \"([^\"]*)\"$")
public void user_enter_invalid_ecard_No_PIN_No(String num, String pin) throws Throwable {
	ecardPgObject= new EcardPgObject();
	ecardPgObject.enterEcardNo(num);
	ecardPgObject.enterEcardPin(pin);
    
}

@When("^click on validate button$")
public void click_on_validate_button() throws Throwable {
	ecardPgObject.clickValidate();
	Thread.sleep(1000);
    
}

@Then("^validate the error message \"([^\"]*)\"$")
public void validate_the_error_message(String msg) throws Throwable {
    Assert.assertEquals("Validate Error Msg", msg, ecardPgObject.printErrorMsg());
    
}

@Given("^User enter valid ecard No \"([^\"]*)\"$")
public void user_enter_valid_ecard_No(String num) throws Throwable {
	ecardPgObject= new EcardPgObject();
	ecardPgObject.enterEcardNo(num);
	
    
}

@When("^corresponding PIN No \"([^\"]*)\"$")
public void corresponding_PIN_No(String pin) throws Throwable {
	ecardPgObject.enterEcardPin(pin);
    
}

@Then("^click on validatebutton$")
public void click_on_validatebutton() throws Throwable {
	ecardPgObject.clickValidate();
}

@Then("^click on Confirm button$")
public void click_on_Confirm_button() throws Throwable {
	ecardPgObject.clickConfirm();
    
}

}
