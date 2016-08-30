package com.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.steps.estoreRetail_steps;

public class HomePgObject {
 WebDriver webDriver   =estoreRetail_steps.driver;
 WebElement QNET_Logo  =webDriver.findElement(By.xpath(".//*[@id='ctl00_hlQNetlogo']/img"));
 WebElement SearchOption  =webDriver.findElement(By.xpath(".//*[@id='ctl00_ctl12_txtSearch']"));
 WebElement LanguageDrpdwn = webDriver.findElement(By.xpath(".//*[@id='ctl00_ctl12_hlLangualge']"));
 WebElement IRLoginbtn   = webDriver.findElement(By.xpath(".//*[@id='ctl00_ctl12_hlLogin']"));
 WebElement Enrolbtn   = webDriver.findElement(By.xpath(".//*[@id='ctl00_ctl12_hlJoinUs']"));
 WebElement Shopbtn   = webDriver.findElement(By.xpath(".//*[@id='ctl00_ctl12_hlShop']"));
 WebElement Footer      = webDriver.findElement(By.xpath(".//*[@id='aspnetForm']/div[4]/div[2]"));
 WebElement countinueShopbtn = webDriver.findElement(By.xpath(".//*[@id='myModal2']/p[2]/a[1]"));
 WebElement Exitbtn   = webDriver.findElement(By.xpath(".//*[@id='myModal2']/p[2]/a[2]"));
 
 public String checkQNET_Logo(){
  if(QNET_Logo.isDisplayed()){
   return "true";
  }else
   return "false";
 }
 public void clcik_countinueShopbtn(){
	  countinueShopbtn.click();
	   }
	 public void click_Exitbtn(){
	  Exitbtn.click();
	   }
 public String check_search(){
	 if(SearchOption.isDisplayed()){
		   return "true";
		  }else
		   return "false"; 
   }
 
 
 public String check_LanguageDrpdwn(){
  WebElement LanguageDrpdwn=(webDriver.findElement(By.xpath(".//*[@id='ctl00_ctl12_hlLangualge']")));
  if(LanguageDrpdwn.isDisplayed()){
	   return "true";
	  }else
	   return "false"; 
 }

 public String check_IRLogin(){ 
  if(IRLoginbtn.isDisplayed()){
	   return "true";
	  }else
	   return "false"; 
   }
 
 public String check_Enrolbtn(){
  if(Enrolbtn.isDisplayed()){
	   return "true";
	  }else
	   return "false"; 
   }
 
 public String check_Shopbtn(){
  if(Shopbtn.isDisplayed()){
	   return "true";
	  }else
	   return "false"; 
   }
 public void clickShopbtn()
 {
	 Shopbtn.click();
 }
 public String getFooter(){
  String foot=Footer.getText().replace("\n", "");
  return foot;
 }
 
}