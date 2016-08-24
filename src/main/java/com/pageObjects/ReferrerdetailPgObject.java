package com.pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.steps.estoreRetail_steps;
import com.vselenium.LanDetector;

public class ReferrerdetailPgObject {
 
 WebDriver webDriver    =estoreRetail_steps.driver;
 WebElement purchasingPathimg = webDriver.findElement(By.xpath(".//*[@id='imgHeader']"));
 WebElement langDropDown=webDriver.findElement(By.id("ddlLanguage"));
 Select lang=new Select(webDriver.findElement(By.id("ddlLanguage")));
 Select country=new Select(webDriver.findElement(By.id("ddlCountry")));
 WebElement countrydrop=webDriver.findElement(By.id("ddlCountry"));
WebElement clickherelink=webDriver.findElement(By.xpath(".//*[@id='lbClickShop']"));
 public String checkpurchasingPathimg(){
  if(purchasingPathimg.isDisplayed()){
   return "true";
  }else
   return "false";
 
 }
 public String checkShopNowbtn(){
	 WebElement shopnowbtn= webDriver.findElement(By.xpath(".//*[@id='cmdOK']"));
	  if(shopnowbtn.isEnabled()){
	   return "true";
	  }else
	   return "false";
	 
	 }
 public void clickLink(){
	 clickherelink.click();
 }
 public String getErrorMsg(){
	 WebElement error=webDriver.findElement(By.xpath(".//*[@id='lblError']"));
	 return error.getText();
 }
 public void clickCheckReferrer(){
	  WebElement checkreferrerbn=webDriver.findElement(By.id("cmdValidate"));
	  checkreferrerbn.click();
 }
 public String getReferrerRadiobtn(){
  String src = ((JavascriptExecutor)webDriver).executeScript("return arguments[0].attributes['src'].value;", purchasingPathimg).toString();
  return src;
 }
 public String getLanguage(){
	 WebElement option=lang.getFirstSelectedOption();
	 return option.getText();
 }
 public void setLanguage(String value){
	  lang.selectByValue(value);
 }
 public void setCountry(String value) throws InterruptedException{
	
	 country.selectByValue(value);
	 
	}
 public String getDefaultCountry(){
	 WebElement defaultcountry=country.getFirstSelectedOption();
	 return defaultcountry.getText();
 }
 public String getTextLanguage() throws IOException{
	 WebElement text= webDriver.findElement(By.id("lblVer_detail_T_4"));
	 String value=text.getText();
	return LanDetector.getLan(value);
	  
 }
 public String [] getCountry(){
	 System.out.println(countrydrop.getText());
	 String []arr=countrydrop.getText().split("\n");
	 System.out.println("xxxxxxxxx"+arr.length);
	 return arr;
 }
}