package com.facebook.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SingleTonDesignPatten {
	public static WebDriver driver;
	public SingleTonDesignPatten(WebDriver driver2) {
	this.driver=driver2;
	PageFactory.initElements(driver, this);
	}
	public FbLoginPagePom getLoginPage() {
		FbLoginPagePom lp = new FbLoginPagePom(driver);
		return lp;
	}
	public FbSignupPom getSignUpPage() {
		FbSignupPom sp =new FbSignupPom(driver);
		return sp;
	}

}
