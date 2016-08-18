package com.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.steps.estoreRetail_steps;

public class VerifyReferrerPgObject {
	WebDriver webDriver=estoreRetail_steps.driver;
	Select country=new Select(webDriver.findElement(By.xpath(".//*[@id='ddlCountry']")));
	WebElement clickHere = webDriver.findElement(By.xpath(".//*[@id='lbClickShop']"));
	WebElement shopNow= webDriver.findElement(By.xpath(".//*[@id='cmdOK']"));
	public void selectCountry(String value){
		country.selectByVisibleText(value);
	}
	public void clickClickHere(){
		clickHere.click();
	}
	public String getShopNowStatus(){
		if(shopNow.isEnabled()){
			return "true";
		}else{
			return "false";
		}
	}
	public void clickShopNow(){
		shopNow.click();
	}
}
