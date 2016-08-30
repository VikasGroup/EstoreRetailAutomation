package com.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.steps.estoreRetail_steps;

public class EcardPgObject {
 
 WebDriver webDriver   =estoreRetail_steps.driver;
 

  WebElement totAmount_txt = webDriver.findElement(By.xpath(".//*[@id='lblAmountDueDisplay']"));
  WebElement totBal_txt = webDriver.findElement(By.xpath(".//*[@id='lblBalanceDueDisplay']"));
  WebElement EcardNo_txt = webDriver.findElement(By.xpath(".//*[@id='dgGrid_ctl02_txtECardNo']"));
  WebElement EcardPin_txt = webDriver.findElement(By.xpath(".//*[@id='dgGrid_ctl02_txtECardPin']"));
  WebElement balance_txt = webDriver.findElement(By.xpath(".//*[@id='dgGrid_ctl02_lblBalanceDisplay']"));
  WebElement amountPaid_txt = webDriver.findElement(By.xpath(".//*[@id='dgGrid_ctl02_lblAmountDisplay']"));
  
  WebElement validate_btn = webDriver.findElement(By.xpath(".//*[@id='dgGrid_ctl02_cmdValidate']"));
  WebElement cancel_btn = webDriver.findElement(By.xpath(".//*[@id='cmdCancel']"));

 
 
 
 public void clickRemove(){
  WebElement remove_btn = webDriver.findElement(By.xpath(".//*[@id='dgGrid_ctl02_cmdRemove']"));
    remove_btn.click();
   }
 public void clickValidate(){
    validate_btn.click();
   }
 public void clickCancel(){
    cancel_btn.click();
   }
 public void clickConfirm(){
   WebElement confirm_btn = webDriver.findElement(By.xpath(".//*[@id='cmdOK']"));
    confirm_btn.click();
   }
  public String printErrorMsg(){
   WebElement errMsg_txt = webDriver.findElement(By.id("lblMsg"));
   return errMsg_txt.getText();
  }
  public  void enterEcardNo(String value){
   EcardNo_txt.sendKeys(value);
  }
  public  void enterEcardPin(String value){
   EcardPin_txt.sendKeys(value);
  }
}