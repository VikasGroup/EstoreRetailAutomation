package com.pageObjects;

import java.beans.Customizer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.steps.estoreRetail_steps;

public class ReciptPgObject {
 WebDriver webDriver   =estoreRetail_steps.driver;
 WebElement QNET_Logo  =webDriver.findElement(By.xpath(".//*[@id='imgLogo']"));
 WebElement Customer_ID  =webDriver.findElement(By.xpath(".//*[@id='genTCOID']"));
 WebElement Customer_Name  =webDriver.findElement(By.id("genTCName"));
 WebElement Customer_Address  =webDriver.findElement(By.id("genAddress"));
 WebElement Customer_Email  =webDriver.findElement(By.id("genEMail"));
 WebElement OrderNo  =webDriver.findElement(By.xpath(".//*[@id='genReceiptNum']"));
 WebElement ecardNo =webDriver.findElement(By.xpath(".//*[@id='dgCards_ctl02_lbleCardNumber']"));
 WebElement value =webDriver.findElement(By.id("lblTotalAmountPaid"));
 WebElement usedValue =webDriver.findElement(By.xpath(".//*[@id='dgCards']/tbody/tr[2]/td[4]"));
 WebElement remainingValue =webDriver.findElement(By.xpath(".//*[@id='dgCards']/tbody/tr[2]/td[5]"));
 WebElement fotter =webDriver.findElement(By.xpath(".//*[@id='form1']/table/tbody/tr/td/div/table/tbody/tr[1]/td/table[5]/tbody/tr[2]/td"));
 //WebElement totalEuroAmountPaid =webDriver.findElement(By.xpath(".//*[@id='lblEuroTotal']"));
 
 
 
 
  public String checkQNET_Logo(){
    if(QNET_Logo.isDisplayed()){
     return "true";
    }else
     return "false";
   }
  
  public String getEardNo(){
   return ecardNo.getText();
   }
  public String getValue(){
   return value.getText();
   }
  public String getUsername(){
	  return  Customer_Name.getText();
  }
 public String getAddress(){
	 return  Customer_Address.getText();
  }
 public String getEmail(){
	 return  Customer_Email.getText();
 }
 
}