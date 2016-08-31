package com.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.steps.estoreRetail_steps;

public class CheckOutPgObject {
 WebDriver driver=estoreRetail_steps.driver;

 public WebElement totalAmnt_txt = driver.findElement(By.xpath(".//*[@id='lblTotalAmount']"));
 public WebElement deliveryFee_txt = driver.findElement(By.xpath(".//*[@id='lblDeliverySH']"));
public WebElement purchasingPathimg=driver.findElement(By.id("Topnav1_imgHeader"));
// public WebElement pickupFee_txt = driver.findElement(By.xpath(".//*[@id='lblPickUpSH']"));
 
 public WebElement countinue_btn = driver.findElement(By.xpath(".//*[@id='cmdOK']"));
 public WebElement cancel_btn = driver.findElement(By.xpath(".//*[@id='cmdCancel']"));
 public String checkOutRadiobtn(){
	  String src = ((JavascriptExecutor)driver).executeScript("return arguments[0].attributes['src'].value;", purchasingPathimg).toString();
	  return src;
	 }
 public void clcikDilivery(){
  WebElement deliAdd_btn = driver.findElement(By.xpath(".//*[@id='chkDel']"));
  deliAdd_btn.click();
 }
 public void clickPickup(){
   WebElement pickup_btn = driver.findElement(By.xpath(".//*[@id='chkHK']"));
  pickup_btn.click();
 }
 public void selectPickup(String value){
	 WebElement pickup_dp = driver.findElement(By.xpath(".//*[@id='drpQatana']"));
  Select select_pickup  = new Select(pickup_dp);
  select_pickup.selectByVisibleText(value);
 }
 public void clickCancel(){
  cancel_btn.click();
 }
 public void clickCountinue(){
  countinue_btn.click();
 }
 public String getTotal(int items){
	 WebElement [] element= new WebElement[5];
	 int total=0;
	 for(int i=1;i<=items;i++){
		 element[i]=driver.findElement(By.id("dgGrid_ctl0"+(i+1)+"_lblSubTotal"));
		 String totstring=element[i].getText();
		 totstring=element[i].getText().replace(".00", "");
		 totstring=totstring.replace(",", "");
		total=total+Integer.parseInt(totstring);
	 }
	 return Integer.toString(total);
 }
 public String getSubTotal(int items){
	 WebElement sub=driver.findElement(By.id("dgGrid_ctl0"+(items+2)+"_lblFooterSubTotal"));
	 String tot=sub.getText().replace(".00", "");
	 tot=tot.replace(",", "");
	 return tot;
 }
 public String getTotalAmout(){
	 WebElement totamount=driver.findElement(By.id("lblTotalAmount"));
	 String amount=totamount.getText().replace(".00", "");
	 amount=amount.replace(",", "");
	 return amount;
 }
 public String getShippingAmount(){
	 WebElement totamount=driver.findElement(By.id("lblDeliverySH"));
	 String amount=totamount.getText().replace(".00", "");
	 amount=amount.replace(",", "");
	 return amount;
 }
 public String getContactname(){
	 WebElement element=driver.findElement(By.id("lblContactNameValue"));
	 return element.getText();
 }
 public String getEmail(){
	 WebElement element=driver.findElement(By.id("lblContacteMailValue"));
	 return element.getText();
 }
 public String getAddress(){
	 WebElement element=driver.findElement(By.id("lblAddressValue"));
	 return element.getText();
 }
 public String getCity(){
	 WebElement element=driver.findElement(By.id("lblCityValue"));
	 return element.getText();
 }
 public String getZipCode(){
	 WebElement element=driver.findElement(By.id("lblZipCodeValue"));
	 return element.getText();
 }
 public String getCountry(){
	 WebElement element=driver.findElement(By.id("lblCountryValue"));
	 return element.getText();
 }
 public String getPhoneNo(){
	 WebElement element=driver.findElement(By.id("lblPhoneNoValue"));
	 return element.getText();
 }
}