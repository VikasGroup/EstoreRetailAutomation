package com.steps;

import org.openqa.selenium.WebDriver;

import com.base.Base;

public class estoreRetail_steps {
	public static WebDriver driver;
	public Base base;
	public estoreRetail_steps (Base base){
		this.base = base;
		this.driver=base.getDriver();
			}
	
}
