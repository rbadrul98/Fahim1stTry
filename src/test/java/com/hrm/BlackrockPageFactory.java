package com.hrm;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class BlackrockPageFactory {
	WebDriver driver;
	public BlackrockPageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
}
@FindBy (how= How.XPATH, using="//*[@name=\"txtUsername\"]")
private WebElement Username;

@FindBy(how = How.XPATH, using = "//input[@id='txtPassword']")
private WebElement Password;

@FindBy(how = How.XPATH, using = "//input[@type='submit']")
private WebElement Login;

public WebElement getPassword() {
	return Password;
}
public void setPassword(WebElement password) {
	Password = password;
}
public WebElement getLogin() {
	return Login;
}
public void setLogin(WebElement login) {
	Login = login;
}
public WebElement getUsername() {
	return Username;
}
public void setUsername(WebElement username) {
	Username = username;
}

	
}
