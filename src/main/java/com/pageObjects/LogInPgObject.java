package com.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.steps.estoreRetail_steps;

public class LogInPgObject {
	WebDriver webDriver=estoreRetail_steps.driver;
	WebElement shopnow_check = webDriver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_chkRedirectToEStore']"));
	WebElement qnet_img = webDriver.findElement(By.xpath(".//*[@id='pnlLogo']/h1/a"));
	WebElement irid_txt = webDriver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_txtTCO']"));
	WebElement passowrd_txt = webDriver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_txtPassword']"));
	WebElement login_btn = webDriver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_btnLogin']"));
	WebElement retailCus=webDriver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_pnShopNow']/div"));
	public void enterIrid(String value) {

		irid_txt.sendKeys(value);
	}

	public void enterPassword(String value) {

		passowrd_txt.sendKeys(value);
	}

	public void clickLogin() {

		login_btn.click();
	}
	public String checkIMG(){
		if(qnet_img.isDisplayed()){
			return "true";
		}else
			return "false";
	}
 public void clickRetail(){
	 retailCus.click();
 }
}
