package com.stepdefinition;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.base.BaseClass;
import com.facebook.pom.FbLoginPagePom;
import com.facebook.pom.SingleTonDesignPatten;
import com.facebook.properties.ConfigHelper;
import com.facebook.properties.ConfigReader;
import com.runner.FaceBookRunner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FacebookStep extends BaseClass {
	public static WebDriver driver = FaceBookRunner.driver;
	static SingleTonDesignPatten stdp =new SingleTonDesignPatten(driver);

	@Given("user Launch The Application Url")
	public static void user_Launch_The_Application_Url() throws InterruptedException, IOException {
		String url = ConfigHelper.getInstance().getUrl();
		urlLaunch(url);
		implicitLoad();
	}

	@When("user Get Text From The Home Page")
	public static void user_Get_Text_From_The_Home_Page() {
		WebElement pageText = stdp.getLoginPage().getPageText();
//				fb.getPageText();
//		WebElement text = driver.findElement(By.xpath("//div/h2"));
		getingText(pageText);
	}

	@When("user Enter The Username")
	public static void user_Enter_The_Username() throws IOException {
		WebElement email = stdp.getLoginPage().getEmail();
//				fb.getEmail();
		// WebElement userName = driver.findElement(By.id("email"));
		String username = ConfigHelper.getInstance().getUsername();
		userInput(email, username);
	}

	@When("user Enter The Password")
	public static void user_Enter_The_Password() throws IOException {
		WebElement password = stdp.getLoginPage().getPassword();
//				fb.getPassword();
//		WebElement pass = driver.findElement(By.id("pass"));
		String password2 = ConfigHelper.getInstance().getPassword();
		userInput(password, password2);
	}

	@When("user Click The Login")
	public static void user_Click_The_Login() throws InterruptedException {
		WebElement loginButton = stdp.getLoginPage().getLoginButton(); 
//				fb.getLoginButton();
//		WebElement login = driver.findElement(By.name("login"));
		clickElement(loginButton);
		sleep();
	}

	@Then("user Back To The Home Page")
	public static void user_Back_To_The_Home_Page() {
		navBack();
	}

	@When("user Click The Create Account Botton")
	public static void user_Click_The_Create_Account_Botton() {
		WebElement createButton = stdp.getLoginPage().getCreateButton();
//				fb.getCreateButton();
//		WebElement createAccount = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		clickElement(createButton);
	}

	@When("use Enter The First Name")
	public static void use_Enter_The_First_Name() throws IOException {
		WebElement firstName = stdp.getSignUpPage().getFirstName();
//				fb.getFirstName();
//		WebElement firstName = driver.findElement(By.name("firstname"));
		String firstName2 = ConfigHelper.getInstance().getFirstName();
		userInput(firstName, firstName2);
	}

	@When("user Enter The Sure Name")
	public static void user_Enter_The_Sure_Name() throws IOException {
		WebElement lastName = stdp.getSignUpPage().getLastName();
//				fb.getLastName();
//		WebElement lastName = driver.findElement(By.name("lastname"));
		String lastName2 = ConfigHelper.getInstance().getLastName();
		userInput(lastName, lastName2);
	}

	@When("user Enther The Email Id")
	public static void user_Enther_The_Email_Id() throws IOException {
		WebElement newemail = stdp.getSignUpPage().getNewemail();
//				fb.getNewemail();
//		WebElement email = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		String email = ConfigHelper.getInstance().getEmail();
		userInput(newemail, email);
	}

	@When("user Enter Comfrim The Email Id")
	public static void user_Enter_Comfrim_The_Email_Id() throws IOException {
		WebElement confrimMail = stdp.getSignUpPage().getConfrimMail();
//				fb.getConfrimMail();
//		WebElement eemail = driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
		String email = ConfigHelper.getInstance().getEmail();
		userInput(confrimMail, email);
	}

	@When("user Enter The Pass")
	public static void user_Enter_The_Pass() throws IOException {
		WebElement newpassword = stdp.getSignUpPage().getNewpassword();
//				fb.getNewpassword();
//		WebElement password = driver.findElement(By.xpath("//input[@data-type='password']"));
		String newPassword2 = ConfigHelper.getInstance().getNewPassword();
		userInput(newpassword, newPassword2);
	}

	@When("user Select The Date")
	public static void user_Select_The_Date() {
		WebElement day = stdp.getSignUpPage().getDay();
//				fb.getDay();
//		WebElement day = driver.findElement(By.id("day"));
		dropDownSelect(day, "Value", "15");
//		Select s = new Select(day);
//		s.selectByValue("15");
	}

	@When("user Select Teh Month")
	public static void user_Select_Teh_Month() {
		WebElement month = stdp.getSignUpPage().getMonth();
//				fb.getMonth();
//		WebElement month = driver.findElement(By.id("month"));
		dropDownSelect(month, "index", "11");
//		Select s1 = new Select(month);
//		s1.selectByIndex(11);
	}

	@When("user Select The Year")
	public static void user_Select_The_Year() {
		WebElement year = stdp.getSignUpPage().getYear();
//				fb.getYear();
//		WebElement year = driver.findElement(By.id("year"));
		dropDownSelect(year, "Text", "1998");
//		Select s2 = new Select(year);
//		s2.selectByVisibleText("1998");
	}

	@When("user Select The Sex")
	public static void user_Select_The_Sex() {
		WebElement sex = stdp.getSignUpPage().getSex();
//				fb.getSex();
//		WebElement sex = driver.findElement(By.xpath("(//label[@class='_58mt'])[2]"));
		clickElement(sex);
	}

	@Then("user Click The SignUp Botton")
	public static void user_Click_The_SignUp_Botton() throws InterruptedException, IOException {
		WebElement signUp = stdp.getSignUpPage().getSignUp();
//				fb.getSignUp();
//		WebElement signUp = driver.findElement(By.name("websubmit"));
		clickElement(signUp);
		sleep();
		screenShot("fb");
		implicitLoad();
	}
	
}
