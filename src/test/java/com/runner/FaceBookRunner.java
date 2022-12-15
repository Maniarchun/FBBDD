package com.runner;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.base.BaseClass;
import com.facebook.properties.ConfigHelper;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\ELCOT\\eclipse-workspace\\FaceBook\\src\\test\\java\\com\\feature\\FaceBook.feature",
							glue = "com.stepdefinition",
							monochrome = true,
							plugin = "pretty"
							)
public class FaceBookRunner {
	public static WebDriver driver;
	@BeforeClass
	public static void setUp() throws IOException {
		String browser = ConfigHelper.getInstance().getBrowser();
		driver=BaseClass.browserLaunch(browser);
	}
	@AfterClass
	public static void tearDown() {
		driver.close();
	}

}
