package com.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
WebDriver driver;
	@FindBy(id="email")
	public static WebElement userid;
	@FindBy(id="pass")
	public static WebElement password;
	@FindBy(id="loginbutton")
	public static WebElement submitbtn;
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
}
