package com.facebook.properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	private Properties p;
	public ConfigReader() throws IOException {
		File f = new File("C:\\Users\\ELCOT\\eclipse-workspace\\FaceBook\\src\\main\\java\\com\\facebook\\properties\\facebook.properties");
		FileInputStream fi = new FileInputStream(f);
		p = new Properties();
		p.load(fi);
	}
	public String getBrowser() {
		String browser = p.getProperty("browser");
		return browser;
	}
	public String getUrl() {
		String url = p.getProperty("url");
		return url;
	}
	public String getUsername() {
		String username = p.getProperty("username");
		return username;
	}
	public String getPassword() {
		String password = p.getProperty("password");
		return password;
	}
	public String getFirstName() {
		String firstName = p.getProperty("firstName");
		return firstName;
	}
	public String getLastName() {
		String lastName = p.getProperty("lastName");
		return lastName;
	}
	public String getEmail() {
		String email = p.getProperty("email");
		return email;
	}
	public String getNewPassword() {
		String newPass = p.getProperty("newPassword");
		return newPass;
	}
}
