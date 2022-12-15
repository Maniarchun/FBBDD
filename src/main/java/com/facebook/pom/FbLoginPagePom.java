package com.facebook.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbLoginPagePom {
public static WebDriver driver;
	
	
	
	@FindBy(xpath = "//div/h2")
	private WebElement pageText;

	@FindBy(id = "email")
	private WebElement email;
	
	@FindBy(id = "pass")
	private WebElement password;
	
	@FindBy(name = "login")
	private WebElement loginButton;
	
	@FindBy(xpath = "//a[text()='Create New Account']")
	private WebElement createButton;
	

	public FbLoginPagePom(WebDriver adriver) {
		this.driver=adriver;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getPageText() {
		return pageText;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	public WebElement getCreateButton() {
		return createButton;
	}


}
