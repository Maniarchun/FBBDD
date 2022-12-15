package com.facebook.FaceBook;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBookLogin {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\ELCOT\\eclipse-workspace\\FaceBook\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement text = driver.findElement(By.xpath("//div/h2"));
		String pageText = text.getText();
		System.out.println(pageText);
		WebElement userName = driver.findElement(By.id("email"));
		userName.sendKeys("jamjam@gmail.com");
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("123545");
		WebElement login = driver.findElement(By.name("login"));
		login.click();
		Thread.sleep(4000);
		driver.navigate().back();
		WebElement createAccount = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		createAccount.click();
		WebElement firstName = driver.findElement(By.name("firstname"));
		firstName.sendKeys("Ajith");
		WebElement lastName = driver.findElement(By.name("lastname"));
		lastName.sendKeys("Kumar");
		WebElement email = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		email.sendKeys("ajaiajiaji@gmail.com");
		WebElement eemail = driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
		eemail.sendKeys("ajaiajiaji@gmail.com");
		WebElement password = driver.findElement(By.xpath("//input[@data-type='password']"));
		password.sendKeys("dfy745rty");
		WebElement h = driver.findElement(By.xpath("(//label[@class='_58mt'])[2]"));
		h.click();
		WebElement day = driver.findElement(By.id("day"));
		Select s = new Select(day);
		s.selectByValue("15");
		WebElement month = driver.findElement(By.id("month"));
		Select s1 = new Select(month);
		s1.selectByIndex(11);
		WebElement year = driver.findElement(By.id("year"));
		Select s2 = new Select(year);
		s2.selectByVisibleText("1998");
		WebElement i = driver.findElement(By.name("websubmit"));
		i.click();
		Thread.sleep(3000);
		TakesScreenshot ts = (TakesScreenshot)driver;
		File f = ts.getScreenshotAs(OutputType.FILE);
		File fs = new File("C:\\Users\\ELCOT\\eclipse-workspace\\FaceBook\\target\\ts.png");
		FileUtils.copyFile(f, fs);
		
	}

}
