package com.pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.steps.estoreRetail_steps;
import com.vselenium.LanDetector;


public class ProductPgObject {

 
 WebDriver webDriver=estoreRetail_steps.driver;
 
 Select langDropDown   =new Select(webDriver.findElement(By.id("ddlLanguage")));
 WebElement language=webDriver.findElement(By.id("ddlLanguage"));
 


 //WebElement product_img    = webDriver.findElement(By.xpath(".//*[@id='imgListProductProdImage']"));
 // WebElement product_check    = webDriver.findElement(By.xpath(".//*[@id='cbAddToCart']"));
// WebElement sh_value     = webDriver.findElement(By.xpath(".//*[@id='lblShipFee']"));
 //WebElement Regular_value     = webDriver.findElement(By.xpath(".//*[@id='lblPriceRegularRepeat']"));
//WebElement notAvailable_txt    = webDriver.findElement(By.xpath(".//*[@id='lblSpecialIcon']"));

 
 

 // WebElement start_value  = webDriver.findElement(By.xpath(".//*[@id='RadSliderDrag_ctl00_cphBody01_ctlSlider_rsdControl']/span"));
  //WebElement end_value  = webDriver.findElement(By.xpath(".//*[@id='RadSliderEndDrag_ctl00_cphBody01_ctlSlider_rsdControl']/span"));
  //WebElement range_value  = webDriver.findElement(By.xpath(".//*[@id='RadSliderSelected_ctl00_cphBody01_ctlSlider_rsdControl']"));

 public void setLanguage(String value){ 
  langDropDown.selectByValue(value);
 }
 public String getAddtoCartStatus(){
	 WebElement addcart_btn    = webDriver.findElement(By.id("btnAddToCartMerged"));
	 if(addcart_btn.isDisplayed())
		  return "true";
		  else
		   return "false";
 }
 
 public void clickCheckBox(){
	  WebElement RPP_btn = webDriver.findElement(By.xpath("(//input[@type='checkbox'])[position()=1]"));
	  RPP_btn.click();
	 }
 public void setProduct(String val){
	 Select productDropDown = new Select(estoreRetail_steps.driver.findElement(By.id("ddlSearchProduct")));
	 productDropDown.selectByValue(val);
 }
 public String getErrorMsg(){
	 WebElement result=webDriver.findElement(By.id("lblSearchResultMessage"));
		   return result.getText();
 }
 
 public String getCSS(){
	 WebElement defaultProductcategory  = webDriver.findElement(By.xpath(".//*[@id='lbtnCategoryID_LeftProdCat']/div/b/u"));
	  return (defaultProductcategory.getCssValue("text-decoration"));
 }
 public String getTextLanguage() throws IOException{
  WebElement text= webDriver.findElement(By.id("lblVer_detail_T_4"));
  String value=text.getText();
 return LanDetector.getLan(value);
   
 }
 public String [] getLangDropDownElements(){
	 String [] elements=language.getText().split("\n");
	 return elements;
 }
 public String getProductsRadiobtn(){
	 WebElement purchasingPathimg   = webDriver.findElement(By.xpath(".//*[@id='imgHeader']"));
   String src = ((JavascriptExecutor)webDriver).executeScript("return arguments[0].attributes['src'].value;", purchasingPathimg).toString();
   return src;
  }
 
 public void clicksearch(){
	 WebElement search_btn    = webDriver.findElement(By.xpath(".//*[@id='btnSearchProduct']"));
  search_btn.click();
 }
 
 public void addcart_btn(){
	 WebElement addcart_btn    = webDriver.findElement(By.id("btnAddToCartMerged"));
  addcart_btn.click();
 }
 public void enterSearch(String value){
	 WebElement search_txt     = webDriver.findElement(By.xpath(".//*[@id='tbSearchProduct']"));
	 search_txt.clear();
  search_txt.sendKeys(value);
 } 
 public String getName(String value){
  
  WebElement nametxt=webDriver.findElement(By.xpath("id('hlListProductProdName')[.='" + value + "']"));
  return nametxt.getText();
 }
 public String getPrice(String price){
	  
	  WebElement pricetxt=webDriver.findElement(By.xpath("id('lblPrice')[.='" + price + "']"));
	  return pricetxt.getText();
	 }
 public String getImage(){
 /* String value="";
  WebElement imgelement=webDriver.findElement(By.xpath("id('imgListProductProdImage')[.='" + value + "']"));
  if(product_img.isDisplayed())
  return "true";
  else*/
   return "false";
 }

 
 public String getSH(String value){
  
  WebElement shelement=webDriver.findElement(By.xpath("id('lblShipFee')[.='" + value + "']"));
  
  return shelement.getText();
 }
/* public String getRegValue(){
  if(Regular_value.isDisplayed())
  return Regular_value.getText();
  else
   return "";
 }*/
 public String getAvalability(){
  String value="(Temporarily Not Available)";
  try{
  WebElement availableelement=webDriver.findElement(By.xpath("id('lblSpecialIcon')[.='" + value + "']"));
   return "false";
  }catch(Exception ex){
   return "true";
  }
  
  
 
  
 }
}