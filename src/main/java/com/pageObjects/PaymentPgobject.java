package com.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.steps.estoreRetail_steps;

public class PaymentPgobject {

 WebDriver webDriver = estoreRetail_steps.driver;
 
 WebElement Ecard_img = webDriver.findElement(By.xpath(".//*[@id='dlPaymentModeButton_ctl01_ibtnPaymentModeButtonItem']"));
 WebElement CreditCard_img = webDriver.findElement(By.xpath(".//*[@id='dlPaymentModeButton_ctl02_ibtnPaymentModeButtonItem']"));
 WebElement UnionPay_img = webDriver.findElement(By.xpath(".//*[@id='dlPaymentModeButton_ctl03_ibtnPaymentModeButtonItem']"));

  public String getPaymentRadioBtn(){
	  WebElement paymentRadioBtn_img = webDriver.findElement(By.xpath(".//*[@id='Topnav1_imgHeader']"));
    String src = ((JavascriptExecutor)webDriver).executeScript("return arguments[0].attributes['src'].value;", paymentRadioBtn_img).toString();
    return src;
   }
  public String getEcardimg(){
     String src = ((JavascriptExecutor)webDriver).executeScript("return arguments[0].attributes['src'].value;", Ecard_img).toString();
     return src;
    }
  public String getCreditCardimg(){
    String src = ((JavascriptExecutor)webDriver).executeScript("return arguments[0].attributes['src'].value;", CreditCard_img).toString();
    return src;
   }
  public String getUnionPayimg(){
    String src = ((JavascriptExecutor)webDriver).executeScript("return arguments[0].attributes['src'].value;", UnionPay_img).toString();
    return src;
   }
  public String getPayPalimg(){
	  WebElement PayPal_img = webDriver.findElement(By.xpath(".//*[@id='dlPaymentModeButton_ctl04_ibtnPaymentModeButtonItem']"));

    String src = ((JavascriptExecutor)webDriver).executeScript("return arguments[0].attributes['src'].value;", PayPal_img).toString();
    return src;
   }
  public String getCashUimg(){
	  WebElement CashU_img = webDriver.findElement(By.xpath(".//*[@id='Topnav1_imgHeader']"));

    String src = ((JavascriptExecutor)webDriver).executeScript("return arguments[0].attributes['src'].value;", CashU_img).toString();
    return src;
    }
  
   public void clickEcard(){
	   Ecard_img.click();
   }
}